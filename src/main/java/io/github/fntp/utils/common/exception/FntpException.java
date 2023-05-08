package io.github.fntp.utils.common.exception;


import io.github.fntp.utils.common.enums.FntpCodeEnums;

/**
 * description: AliyunDriveExceptions
 * 自定义异常类
 * @ClassName : AliyunDriveExceptions
 * @Date 2022/12/15 15:54
 * @Author puye(0303)
 * @PackageName io.github.aliyundrive4j.common.exception
 */
public class FntpException extends RuntimeException{

    /**
     * 状态码
     */
    private final int code;

    /**
     * 异常类构造器
     * @param code 异常码
     * @param msg 异常信息
     */
    public FntpException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    /***
     * 异常类构造器
     * @param code 异常码
     * @param msg 异常信息
     * @param cause 异常原有
     */
    @SuppressWarnings("unused")
    public FntpException(int code, String msg, Throwable cause) {
        super(msg, cause);
        this.code = code;
    }

    /**
     * 阿里云异常构造器
     * @param fntpCodeEnums 传入一个阿里云异常码对象
     */
    public FntpException(FntpCodeEnums fntpCodeEnums) {
        super(fntpCodeEnums.getMessage());
        this.code = fntpCodeEnums.getCode();
    }

    /**
     * Fntp异常构造器
     * @param e 传入一个异常对象
     */
    @SuppressWarnings("unused")
    public FntpException(Exception e) {
        super(e);
        this.code = FntpCodeEnums.FAILED.getCode();
    }

    /**
     * FntpSDK异常构造器
     * @param fntpCodeEnums 传入一个Fntp异常信息枚举
     * @param msg 传入一个或者多个异常信息
     */
    @SuppressWarnings("unused")
    public FntpException(FntpCodeEnums fntpCodeEnums, String... msg) {
        super(String.format(fntpCodeEnums.getMessage(), (Object) msg));
        this.code = fntpCodeEnums.getCode();
    }

    /**
     * 获得请求码
     * @return 返回一个请求码
     */
    @SuppressWarnings("unused")
    public int getCode() {
        return code;
    }
}

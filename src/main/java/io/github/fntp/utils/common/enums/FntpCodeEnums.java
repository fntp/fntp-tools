package io.github.fntp.utils.common.enums;

/**
 * 状态码 枚举类
 *
 * @author Hebr
 * @since 2022/03/05
 */
public enum FntpCodeEnums {
    // 100XX String 字符串异常
    ERROR_STRING_NULL(10000,"当前所检测的目标字符串为Null"),
    // 101xx 参数问题
    ERROR_PARAM(10100,"参数异常"),
    // 102xx 通用异常
    FAILED(10200,"执行失败！"),
    // 301xx-captcha异常
    ERROR_CAPTCHA_LENGTH_TOO_LONG(10201,"验证码长度过长"),
    ERROR_CAPTCHA_LENGTH_ILLEGAL(10202,"验证码长度不合法"),
    ERROR_CAPTCHA_NO_SUCH_ALGORITHM(10203,"无此验证码算法"),
    ;
    /**
     * 状态码
     */
    private final int code;

    /**
     * 信息
     */
    private final String message;

    /**
     * 构造方法
     * @param code    状态码
     * @param message 信息
     */
    FntpCodeEnums(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 获取错误代码
     * @return 错误代码
     */
    public int getCode() {
        return this.code;
    }

    /**
     * 获取描述
     * @return 描述信息
     */
    public String getMessage() {
        return this.message;
    }

}

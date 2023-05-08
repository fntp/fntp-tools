package io.github.fntp.utils.core.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author puye(0303)
 * @since 2023/3/7
 */
public class Base64Utils {

    private Base64Utils() {
        throw new IllegalStateException("Utility class");
    }


    /**
     * 将字节数组转为 Base64 编码的字符串
     *
     * @param bytes 字节数组
     * @return Base64 编码的字符串
     */
    @SuppressWarnings("unused")
    public static String toBase64String(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }
    /**
     * 将 Base64 编码的字符串解码为字节数组
     *
     * @param base64Str Base64 编码的字符串
     * @return 字节数组
     */
    public static byte[] fromBase64String(String base64Str) {
        return Base64.getDecoder().decode(base64Str);
    }
    /**
     * 将字符串转为 Base64 编码的字符串
     *
     * @param str 字符串
     * @return Base64 编码的字符串
     */
    @SuppressWarnings("unused")
    public static String toBase64String(String str) {
        return toBase64String(str.getBytes(StandardCharsets.UTF_8));
    }
    /**
     * 将 Base64 编码的字符串解码为字符串
     *
     * @param base64Str Base64 编码的字符串
     * @return 字符串
     */
    @SuppressWarnings("unused")
    public static String decodeToString(String base64Str) {
        return new String(fromBase64String(base64Str), StandardCharsets.UTF_8);
    }

}

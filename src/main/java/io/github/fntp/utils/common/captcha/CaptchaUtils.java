package io.github.fntp.utils.common.captcha;
import io.github.fntp.utils.common.enums.FntpCodeEnums;
import io.github.fntp.utils.common.exception.FntpException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;


/**
 * @author puye(0303)
 * @since 2023/3/22
 */
@SuppressWarnings("unused")
public class CaptchaUtils {

    /**
     * 工具日志
     */
    private static final Logger log = LoggerFactory.getLogger(CaptchaUtils.class);

    private static final char [] CHARS={'A','B','C','D','E','F','G','H','I','J',
            'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
            '1','2','3','4','5','6','7','8','9'};

    private CaptchaUtils(){
        throw new IllegalStateException("Utility class");
    }

    /**
     *
     * @param codeLength 输入验证码长度
     * @return 返回一个指定长度的验证码
     */
    @SuppressWarnings("unused")
    public static String generateCode(Integer codeLength) {
        if (codeLength > CHARS.length) {
            throw new FntpException(FntpCodeEnums.ERROR_CAPTCHA_LENGTH_TOO_LONG);
        }
        if (codeLength < 0) {
            throw new FntpException(FntpCodeEnums.ERROR_CAPTCHA_LENGTH_ILLEGAL);
        }
        Random random;
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            throw new FntpException(FntpCodeEnums.ERROR_CAPTCHA_NO_SUCH_ALGORITHM);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < codeLength; i++) {
            builder.append(CHARS[random.nextInt(CHARS.length)]);
        }
        log.info("generated captchaCode：{}", builder);
        return builder.toString();
    }

}

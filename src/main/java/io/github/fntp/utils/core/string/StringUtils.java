package io.github.fntp.utils.core.string;
import io.github.fntp.utils.common.enums.FntpCodeEnums;
import io.github.fntp.utils.common.exception.FntpException;

import java.util.Objects;

/**
 * @BelongsProject: fntp-tools
 * @BelongsPackage: com.stickpoint.fntp
 * @Author: fntp
 * @CreateTime: 2023-03-06  22:21
 * @Description: StringUtils工具类
 * @Version: 1.0
 */
public class StringUtils {

    /**
     * 判断目标字符串内容是否为空
     * @param targetString 目标字符串
     * @return 返回一个是否为空的标志
     */
    public static boolean isEmpty(String targetString) {
        if (Objects.isNull(targetString)) {
            throw new FntpException(FntpCodeEnums.ERROR_STRING_NULL);
        }
        return targetString.length()==0 || targetString.isBlank();
    }



}

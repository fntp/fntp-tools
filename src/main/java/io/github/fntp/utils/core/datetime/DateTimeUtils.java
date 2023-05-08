package io.github.fntp.utils.core.datetime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @BelongsProject: fntp-tools
 * @BelongsPackage: com.stickpoint.fntp
 * @Author: fntp
 * @CreateTime: 2023-03-06  22:24
 * @Description: TODO
 * @Version: 1.0
 */
@SuppressWarnings("unused")
public class DateTimeUtils {

    private DateTimeUtils() throws IllegalAccessException {
        throw new IllegalAccessException("Utils Class");
    }

    private static final Logger logger = LoggerFactory.getLogger(DateTimeUtils.class);

    private static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

    private static final DateTimeFormatter DEFAULT_SDF = DateTimeFormatter.ofPattern(DEFAULT_DATE_PATTERN);

    private static final String DEFAULT_TIME_PATTERN = "HH:mm:ss";

    private static final DateTimeFormatter DEFAULT_HMS_SDF = DateTimeFormatter.ofPattern(DEFAULT_TIME_PATTERN);

    /**
     * 获得当前完整的时间
     * @return 返回一个完整的当前时间
     */
    @SuppressWarnings("unused")
    public static String getCurrentWholeTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        logger.info("Generated Current Time");
        return localDateTime.format(DEFAULT_SDF);
    }

    /**
     * 获得当前仅包含时分秒信息的时间
     * @return 返回一个完整的时分秒时间
     */
    @SuppressWarnings("unused")
    public static String getCurrentHmsTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        logger.info("Generated Current Time");
        return localDateTime.format(DEFAULT_HMS_SDF);
    }

    /**
     * 时间比较
     * 比较两个时间 如果一个时间另一个时间大那么就判断这个时间
     * @param baseTime 当前基数时间
     * @param comparedTime 被比较的时间
     * @return 返回一个比较的结果
     * @throws ParseException 抛出时间格式字符串转为时间时候出现的转换异常
     */
    @SuppressWarnings("unused")
    public static int compareTime(String baseTime,String comparedTime) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
        Date baseDate = sdf.parse(baseTime);
        Date comparedDate = sdf.parse(comparedTime);
        // 转为时间戳计算
        long result = baseDate.getTime() - comparedDate.getTime();
        if(result > 0){
            return 1;
        }else if(result==0){
            return 0;
        }else{
            return -1;
        }
    }


}

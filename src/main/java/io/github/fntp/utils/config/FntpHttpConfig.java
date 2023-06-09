package io.github.fntp.utils.config;

import com.ejlchina.okhttps.Config;
import com.ejlchina.okhttps.HTTP.Builder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

/**
 * @author puye(0303)
 * @since 2023/3/22
 */
public class FntpHttpConfig implements Config {
    /**
     * 系统Http请求工具日志
     */
    private static final Logger log = LoggerFactory.getLogger(FntpHttpConfig.class);

    /**
     * 在这里对 HTTP.Builder 做一些自定义的配置
     * @param builder Http构建者对象
     */
    @Override
    public void with(Builder builder) {
        log.warn("系统正在配置全局Http请求...");
        // 配置基本固定参数 全局请求五秒超时自动断开
        builder.preprocTimeoutTimes(5)
                //.config()
                // 配置全局请求字符编码 UTF-8
                .charset(StandardCharsets.UTF_8);
    }
}

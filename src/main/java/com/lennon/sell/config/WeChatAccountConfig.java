package com.lennon.sell.config;

import com.google.common.annotations.VisibleForTesting;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WeChatAccountConfig {
    private String mpAppId;
    private String mpAppSecret;
}

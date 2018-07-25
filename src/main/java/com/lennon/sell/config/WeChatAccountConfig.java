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
    /*商户号*/
    private String mchId;
    /*商户秘钥*/
    private String mchKey;
    /*商户证书路径*/
    private String keyPath;
    /*
    * 微信支付的异步通知
    */
    private String notifyUrl;
}

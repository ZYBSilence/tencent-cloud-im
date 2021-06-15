package com.example.tencentcloudim.config;

import com.tencentyun.TLSSigAPIv2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @description: 腾讯im基础配置
 * @author: zyb
 * @date: 2021/5/27 17:32
 */
@Component
public class TencentCloudImConfig {
    private static final String HTTPS_URL_PREFIX = "https://console.tim.qq.com/";
    private static final String APP_MANAGER = "administrator";

    @Value("${silence.tencent.cloud.im.sdkAppId}")
    private long sdkAppId;
    @Value("${silence.tencent.cloud.im.key}")
    private String key;

    /**
     * 获取腾讯云用户签名
     */
    public String getTxCloudUserSig(String userId) {
        // 后续可以把生成的用户签名存到redis，方便获取
        TLSSigAPIv2 tlsSigApi = new TLSSigAPIv2(sdkAppId, key);
        return tlsSigApi.genUserSig(userId, 180 * 86400);
    }

    /**
     * 获取腾讯im请求路径
     */
    public String getHttpsUrl(String imServiceApi, String userSig, Integer random){
        return String.format("%S%S?sdkappid=%S&identifier=%S&usersig=%S&random=%S&contenttype=json",
                HTTPS_URL_PREFIX, imServiceApi, sdkAppId, APP_MANAGER, userSig, random);
    }
}

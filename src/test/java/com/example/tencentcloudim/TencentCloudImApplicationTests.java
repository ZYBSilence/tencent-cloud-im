package com.example.tencentcloudim;

import com.example.tencentcloudim.config.TencentCloudImConfig;
import com.example.tencentcloudim.constant.TencentCloudImApiConstant;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TencentCloudImApplicationTests {
    @Autowired
    private TencentCloudImConfig tencentCloudImConfig;
    @Test
    void contextLoads() {
        Integer random = RandomUtils.nextInt(0, 999999999);
        String aaa = tencentCloudImConfig.getTxCloudUserSig("aaa");
//        String httpsUrl = TencentCloudImConfig.getHttpsUrl(TencentCloudImApiConstant.AccountManage.ACCOUNT_CHECK, TencentCloudImConfig.getTxCloudUserSig("administrator"), random);
//        System.out.println(httpsUrl);
    }

}

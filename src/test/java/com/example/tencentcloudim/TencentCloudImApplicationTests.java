package com.example.tencentcloudim;

import com.example.tencentcloudim.util.TencentCloudImUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TencentCloudImApplicationTests {
    @Autowired
    private TencentCloudImUtil tencentCloudImUtil;
    @Test
    void contextLoads() {
        String userSig = tencentCloudImUtil.getTxCloudUserSig();
        System.out.println(userSig);
    }

}

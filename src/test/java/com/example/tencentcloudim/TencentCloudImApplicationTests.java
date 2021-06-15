package com.example.tencentcloudim;

import com.example.tencentcloudim.constant.TencentCloudImConstant;
import com.example.tencentcloudim.util.TencentCloudImUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


@SpringBootTest
class TencentCloudImApplicationTests {
    @Autowired
    private TencentCloudImUtil tencentCloudImUtil;

    @Test
    void contextLoads() {
        String userSig = tencentCloudImUtil.getTxCloudUserSig();
        System.out.println(userSig);
    }

    @Test
    void testSendIMMsg(){
//        String sendMsg = tencentCloudImUtil.sendMsg(1, "test01", "test02", TencentCloudImConstant.TIM_TEXT_ELEM, "发送消息测试01");
//        System.out.println(sendMsg);
        Calendar cale = Calendar.getInstance();
        cale.setTime(new Date());
        cale.set(Calendar.HOUR_OF_DAY, 0);
        cale.set(Calendar.MINUTE, 0);
        cale.set(Calendar.SECOND, 0);
        Date beginTime = cale.getTime();
        tencentCloudImUtil.adminGetRoamMsg("test01", "test02", 100, beginTime.getTime()/1000, System.currentTimeMillis()/1000, null);
    }

    @Test
    void testAccount(){
        tencentCloudImUtil.accountImport("test01", "ceshi01");
        tencentCloudImUtil.accountImport("test02", "ceshi02");
        String accountCheck = tencentCloudImUtil.accountCheck(Arrays.asList("test01", "test02"));
        System.out.println(accountCheck);
    }
}

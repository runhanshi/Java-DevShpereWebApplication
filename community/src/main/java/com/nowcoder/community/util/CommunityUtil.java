package com.nowcoder.community.util;

import io.micrometer.common.util.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

public class CommunityUtil {

    // 生成随机字符串
    public static String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    // MD5加密密码
    // MD5只能加密，不能解密
    // hello -> abc123def456 多次加密结果一致不会改变
    // 解决办法：利用salt, 在密码后面加随机字符串，再加密
    // hello + random(3e4a8)
    public static String md5(String key){
        if (StringUtils.isBlank(key)){
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }
}

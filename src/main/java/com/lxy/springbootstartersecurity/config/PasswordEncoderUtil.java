package com.lxy.springbootstartersecurity.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderUtil {

    private static PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); //使用构造方法生成对象

    /**
     * 对密码使用BCryptPasswordEncoder加密方式进行加密
     */
    public static String passwordEncoder(String password) {
        return passwordEncoder.encode(password);
    }

    public static void main (String[] args) {
        System.out.println(passwordEncoder("wyf"));
        System.out.println(passwordEncoder("wisely"));
    }
}

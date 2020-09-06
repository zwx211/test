package com.study.config;

import org.apache.http.impl.client.DefaultHttpClient;

import org.apache.http.client.CookieStore;

public class TestConfig {
    public static String loginUrl;
    public static String updateUserInfoUrl;
    public static String getUserInfoUrl;
    public static String getUserListUrl;
    public static String addUserUrl;
    public static DefaultHttpClient httpClient;
    public static CookieStore cookieStore;

}

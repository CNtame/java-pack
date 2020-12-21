package com.pack.java.Http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/16
 */
public class HttpUtil {

    public static void main(String[] args) {

        System.out.println(HttpPost("/16:27:05.jpg",""));
    }

    /**
     *
     * @param url
     * @param params
     * @return
     */
    public static String HttpPost(String url,String params) {

        HttpURLConnection connection = null;
        OutputStream output = null;
        InputStream input = null;
        InputStreamReader reader = null;
        BufferedReader buffer = null;
        StringBuilder res = new StringBuilder();
        try {
            URL url1 = new URL(url);
            connection = (HttpURLConnection) url1.openConnection();
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);
            // 默认值为：false，当向远程服务器传送数据/写数据时，需要设置为true
            connection.setDoOutput(true);
            // 默认值为：true，当前向远程服务读取数据时，设置为true，该参数可有可无
            connection.setDoInput(true);
            // 设置传入参数的格式:请求参数应该是 name1=value1&name2=value2 的形式。
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("charset", "UTF-8");
            output = connection.getOutputStream();
            output.write(params.getBytes());
            output.close();
            input = connection.getInputStream();
            reader = new InputStreamReader(input);
            buffer = new BufferedReader(reader);
            int data=0;
            while((data=buffer.read())!=-1){
                res.append((char) data);
            }
            return res.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }








}

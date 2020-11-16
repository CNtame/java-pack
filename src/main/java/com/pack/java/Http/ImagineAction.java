package com.pack.java.Http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/16
 */
public class ImagineAction {

    public static void main(String[] args) {

        InputStream reader = readImagineHttp("mid2020-10-26/16:27:05.jpg");
        preserveImagine(reader);

    }

    /**
     * 读取图片
     * 输出流
     * @param url
     * @return
     */
    public static InputStream readImagineHttp(String url) {
        HttpURLConnection connection = null;
        InputStream input = null;
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
            input = connection.getInputStream();
            return input;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                assert input != null;
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     *
     */
    public static void preserveImagine(InputStream stream) {
        File file = new File("/Users/liuhaibo/Documents/data/pic/pic1.png");

        FileOutputStream output = null;
        OutputStream stream1 = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            output = new FileOutputStream(file);
            int n=0;
            byte[] data = new byte[1024];
            while((n=stream.read(data))!=-1){
                output.write(data,0, n);
            }
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert output != null;
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

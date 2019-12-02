/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
package trains;

/**
 *
 * @author jwalker15
 */
//package com.java2s;



import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.HttpURLConnection;

import java.net.URL;

public class JsonGetter{
    public static String getJsonContent(String path) {
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setConnectTimeout(3000);
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            int code = connection.getResponseCode();
            if (code == 200) {
                return changeInputStream(connection.getInputStream());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    public static String changeInputStream(InputStream inputStream) {
        String jsonString = "";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int len = 0;
        byte[] data = new byte[1024];
        try {
            while ((len = inputStream.read(data)) != -1) {
                byteArrayOutputStream.write(data, 0, len);
            }
            jsonString = new String(byteArrayOutputStream.toByteArray());
            return jsonString;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

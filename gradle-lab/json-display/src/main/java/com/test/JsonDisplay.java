package com.test;

import com.google.gson.*;


public class JsonDisplay {
    public static void showAsJson(Object object) {
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(object);
        System.out.println(json);
    }
}

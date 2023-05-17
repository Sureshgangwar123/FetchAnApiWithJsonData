package com.example.FetchApiApp.Example;


import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class FetchData {

    public Object JSONObjects() throws IOException {
        JSONObject json = readJson("https://soundcloud.com/oembed?url=http%3A//soundcloud.com/forss/flickermood&format=json");
        return FetchCountString(json);

    }

    public FetchData(){
    }


    public String readData(Reader rd )throws IOException{
     /*
     A mutable sequence of characters. This class provides an API compatible with StringBuffer,
      but with no guarantee of synchronization
      */
        StringBuilder stringBuilder = new StringBuilder();
        int text;
        while((text = rd.read()) != -1) {   // Read a single character
            stringBuilder.append((char) text);
        }
        return stringBuilder.toString(); //return a string containing the characters in sequence
    }



    public  JSONObject readJson(String url) throws IOException{

        /*
        Open a connection to Url and return InputStream
        */
        try (InputStream inputStream = new URL(url).openStream()) {
            /*
            Create a buffering character input stream
             */
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String data = readData(bufferedReader);

            return new JSONObject(data);
        }


    }


    public Object FetchCountString(JSONObject json){
      /*
      Create a hashMap to store the key value pair
       */
        Map<Object,Object> hashMap = new HashMap<>();
        Object obj =json.get("title");
        hashMap.put("value",obj);
        return hashMap.values().size();

    }


}

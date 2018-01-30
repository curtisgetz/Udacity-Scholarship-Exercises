package com.example.android.jsontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String conditionJSONString = "{\n" +
                "   \"temp\": {\n" +
                "      \"min\":\"11.34\",\n" +
                "      \"max\":\"19.01\"\n" +
                "   },\n" +
                "   \"weather\": {\n" +
                "      \"id\":\"801\",\n" +
                "      \"condition\":\"Clouds\",\n" +
                "      \"description\":\"few clouds\"\n" +
                "   },\n" +
                "   \"pressure\":\"1023.51\",\n" +
                "   \"humidity\":\"87\"\n" +
                "}";
        System.out.println("****" + condition(conditionJSONString));

    }

        public String condition(String conditionJSONString) {
            String condition = "";
            try {
                JSONObject conditionJson = new JSONObject(conditionJSONString);
                JSONObject weather = conditionJson.getJSONObject("weather");
                condition = weather.getString("condition");

            } catch (JSONException e) {
                e.printStackTrace();
            }
            return condition;
        }



}


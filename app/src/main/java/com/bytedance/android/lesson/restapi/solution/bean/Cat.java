package com.bytedance.android.lesson.restapi.solution.bean;

import android.widget.LinearLayout;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.http.Url;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {
    //{"breeds":[],"id":"1b0","url":"https://cdn2.thecatapi.com/images/1b0.gif","width":500,"height":281}
    // TODO-C1 (1) Implement your Cat Bean here according to the response json
    @SerializedName("url") private String url;
    public void setUrl(String url){
        this.url = url;
    }
    @Override public String toString(){
        return url;
    }
}

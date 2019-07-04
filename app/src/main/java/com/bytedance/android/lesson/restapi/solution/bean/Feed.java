package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {

    // TODO-C2 (1) Implement your Feed Bean here according to the response json
    @SerializedName("image_url") private String image_url;
    @SerializedName("video_url") private String video_url;
    public String toImage_url(){
        return image_url;
    }
    public String toVideo_url(){
        return video_url;
    }
}


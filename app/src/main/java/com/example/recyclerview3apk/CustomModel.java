package com.example.recyclerview3apk;

import android.widget.ImageView;
import android.widget.TextView;

public class CustomModel {

    int image;
    String nametext;

    public CustomModel(int image, String nametext) {
        this.image = image;
        this.nametext = nametext;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNametext() {
        return nametext;
    }

    public void setNametext(String nametext) {
        this.nametext = nametext;
    }
}

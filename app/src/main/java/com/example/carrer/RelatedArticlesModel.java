package com.example.carrer;

import android.util.Log;

public class RelatedArticlesModel {
    int imageMain;
    String textTitle;

    public int getImageMain() {
        return imageMain;
    }

    public void setImageMain(int imageMain) {
        this.imageMain = imageMain;
    }

    public String getTextTitle() {
        Log.d("img", String.valueOf(textTitle));return textTitle;
    }

    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }

    @Override
    public String toString() {
        return "RelatedArticlesModel{" +
                "imageMain=" + imageMain +
                ", textTitle='" + textTitle + '\'' +
                '}';
    }
}

package com.example.carrer;

import android.util.Log;

public class CoverLetterModel {
    private int content_Image;
    private String text_Content;
    private String title_Content;

    public String getTitle_Content() {
        return title_Content;
    }

    public void setTitle_Content(String title_Content) {
        this.title_Content = title_Content;
    }

    public int getContent_Image() {
        return content_Image;
    }

    public void setContent_Image(int content_Image) {
        this.content_Image = content_Image;
    }

    public String getText_Content() {
        return text_Content;
    }

    public void setText_Content(String text_Content) {
        this.text_Content = text_Content;
    }

}

package com.example.audioapp.Classes;

public class MyListData {

    private int image;
    private String title;


    public MyListData(int image ,String title) {
        this.image = image;
        this.title = title;
        }
    public int getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImg(int img) {
        this.image = img;
    }


    public String getTitle(){
        return title;
    }

}

package com.august.mvp.bean;

/**
 * Created by chengxi on 17/5/1.
 */

public class GirlBean {


    private int image;
    private String name;

    public GirlBean(int image,String name){
        this.image=image;
        this.name=name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.example.codetribe.circleactionmenu;

/**
 * Created by Codetribe on 8/7/2017.
 */

public class CategoriesPojo
{
    private String name;
    private float ratings;
    private String status;
    private double price;
    private  int mImageResourceId;
    private  static final int NO_IMAGE_PROVIDED = -1;

    public CategoriesPojo(String name, float ratings, String status, double price, int mImageResourceId) {
        this.name = name;
        this.ratings = ratings;
        this.status = status;
        this.price = price;
        this.mImageResourceId = mImageResourceId;
    }

    public CategoriesPojo(String name, float ratings, String status, double price) {
        this.name = name;
        this.ratings = ratings;
        this.status = status;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getRatings(float v) {
        return ratings;
    }

    public String getStatus() {
        return status;
    }

    public double getPrice() {
        return price;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}

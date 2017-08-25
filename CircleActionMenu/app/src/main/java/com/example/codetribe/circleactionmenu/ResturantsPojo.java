package com.example.codetribe.circleactionmenu;

/**
 * Created by Codetribe on 8/10/2017.
 */

public class ResturantsPojo
{
    private String name;
    private String place;
    private float ratings;
    private  int mImageResourceId;

    public ResturantsPojo(String name, String place, float ratings, int mImageResourceId) {
        this.name = name;
        this.place = place;
        this.ratings = ratings;
        this.mImageResourceId = mImageResourceId;
    }

    public ResturantsPojo(String name, float ratings, int mImageResourceId) {
        this.name = name;
        this.ratings = ratings;
        this.mImageResourceId = mImageResourceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public float getRatings(float v) {
        return ratings;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}

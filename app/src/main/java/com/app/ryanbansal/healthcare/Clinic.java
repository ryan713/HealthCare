package com.app.ryanbansal.healthcare;

/**
 * Created by Raghav on 27-10-2017.
 */

public class Clinic {

    private int mColorId;
    private String mClinicName;
    private String mDistance;

    public Clinic(int colorId, String clincName, String distnce){
        mColorId = colorId;
        mDistance = distnce;
        mClinicName = clincName;
    }

    public int getmColorId(){
        return mColorId;
    }

    public String getmClinicName(){
        return mClinicName;
    }

    public String getmDistance(){
        return mDistance;
    }
}

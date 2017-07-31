package com.example.krishna.tripmaza;

/**
 * Created by krishna on 6/8/17.
 */

public class Word {

    private String mCategoryName;
    private String mTextPart;
    private int mImageResourceId;

    public Word(String categoryName,String textPart,int imageResourceId){
        mCategoryName =categoryName;
        mTextPart = textPart;
        mImageResourceId = imageResourceId;
    }
    public String getmCategoryName(){
        return mCategoryName;
    }
    public String getmTextPart(){
        return mTextPart;
    }
    public int getmImageResourceId(){
        return mImageResourceId;
    }
}

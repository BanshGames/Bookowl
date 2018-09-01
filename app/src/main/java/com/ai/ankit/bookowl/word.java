package com.ai.ankit.bookowl;

public class word {
    private String bookname;

    private String authorname;

    private int mImageresorceId=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1 ;

    private int mAudioResourceId;

    public word(String defaultranslation,String mewoktranslation)
    {
        bookname =defaultranslation;
        authorname = mewoktranslation;
    }


    public word(String defaultranslation,String mewoktranslation,int ImageresorceId,int AudioResourceId)
    {
        mImageresorceId =ImageresorceId;
        bookname =defaultranslation;
        authorname = mewoktranslation;
        mAudioResourceId =AudioResourceId;
    }


    public String getauthorname()
    {
        return authorname;
    }

    public String getbookname()
    {
        return bookname;
    }

    public int getmImageresorceId(){return mImageresorceId;}

    public boolean hasImage(){return mImageresorceId!=NO_IMAGE_PROVIDED;}

    public int getmAudioResourceId(){ return mAudioResourceId;}
}

package com.example.android.miwok;

/**
 * Created by cristina on 3/8/18.
 */

public class Word {

    private String mDefaultTranslation;

    private String mSpanishTranslation;

    private int mImageResourceId;

    public Word(String DefaultTranslation, String SpanishTranslation){
        mDefaultTranslation = DefaultTranslation;
        mSpanishTranslation = SpanishTranslation;
    }

    public Word(String defaultTranslation, String spanishTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getSpanishTranslation(){
        return mSpanishTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}

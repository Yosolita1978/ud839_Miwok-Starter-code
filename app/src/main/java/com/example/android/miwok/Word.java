package com.example.android.miwok;

/**
 * Created by cristina on 3/8/18.
 */

public class Word {

    private String mDefaultTranslation;

    private String mSpanishTranslation;

    public Word(String DefaultTranslation, String SpanishTranslation){
        mDefaultTranslation = DefaultTranslation;
        mSpanishTranslation = SpanishTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getSpanishTranslation(){
        return mSpanishTranslation;
    }
}

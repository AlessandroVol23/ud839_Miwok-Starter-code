package com.example.android.miwok;

/**
 * Created by Sandro on 06.11.2016.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return this.mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return this.mDefaultTranslation;
    }
}

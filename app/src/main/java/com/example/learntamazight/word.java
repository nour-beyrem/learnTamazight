package com.example.learntamazight;

public class word {
    private static final int IMAGE_INDISPONIBLE= -1;
    private String mDefaultTranslation;
    private String mTamazigheTranslation;
    private int mImageResId = IMAGE_INDISPONIBLE;

    public word(String mDefaultTranslation, String mTamazigheTranslation, int _mImageResId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mTamazigheTranslation = mTamazigheTranslation;
        this.mImageResId = _mImageResId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmTamazigheTranslation() {
        return mTamazigheTranslation;
    }

    public void setmTamazigheTranslation(String mTamazigheTranslation) {
        this.mTamazigheTranslation = mTamazigheTranslation;
    }
    public Boolean hasImage(){
        return mImageResId != IMAGE_INDISPONIBLE;
    }

    public int getmImageResId() {
        return mImageResId;
    }

    public void setmImageResId(int mImageResId) {
        this.mImageResId = mImageResId;
    }
}

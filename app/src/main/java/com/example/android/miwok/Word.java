package com.example.android.miwok;

/**
 * Created by szcze on 29.08.2017.
 */

public class Word {

    //Miwok translation string
    private String mMiwokTranslation;

    //Default translation string
    private String mDefaultTranslation;

    // Music ID
    private int mMusicId;

    //Image id
    private int mImageId = NO_IMAGE_PROVIDED;

    // Constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = -1;

    //Constructor
    public Word (String defaultTranslation, String miwokTranslation, int musicId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMusicId = musicId;
    }

    public Word (String defaultTranslation, String miwokTranslation, int musicId, int ImageId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMusicId = musicId;
        mImageId = ImageId;
    }

    /** Gets the String value of default translation
     *
     * @return the value of default translation
     */
    public String getDefaultTranslation (){
        return mDefaultTranslation;
    }

    /** Gets the String value of Miwok translation
     *
     * @return the value of translation
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    // Return int value of image ID
    public int getImageId (){
        return mImageId;
    }

    // Return int value of music ID
    public int getMusicId (){
        return mMusicId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }
}

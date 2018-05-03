package com.example.android.tourquide;

public class Place {

    /** String resource ID for the name of place */
    private int mPlaceNameId;

    /** String resource ID for the description of place */
    private int mPlaceDescriptionId;

    /** Image resource ID of place*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** If no image was provided  */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     */
    public Place(int placeNameId, int placeDescriptionId) {
        mPlaceNameId = placeNameId;
        mPlaceDescriptionId = placeDescriptionId;
    }

    public Place(int placeNameId, int placeDescriptionId, int imageResourceId) {
        mPlaceNameId = placeNameId;
        mPlaceDescriptionId = placeDescriptionId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the name of place
     */
    public int getPlaceNameId() {
        return mPlaceNameId;
    }

    /**
     * Get the string resource ID for the description of place
     */
    public int getPlaceDescriptionId() {
        return mPlaceDescriptionId;
    }

    /**
     * Return the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
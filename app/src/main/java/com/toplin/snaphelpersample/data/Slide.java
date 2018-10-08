package com.toplin.snaphelpersample.data;

import com.toplin.snaphelpersample.R;

import java.util.Random;

import androidx.annotation.DrawableRes;

public final class Slide {

    @DrawableRes
    private int photoId;

    @DrawableRes
    public int getPhotoId() {
        Random random = new Random();
        int slideNumber = random.nextInt(3);
        switch (slideNumber) {
            case 0:
                photoId = R.drawable.ic_slide_first;
                break;
            case 1:
                photoId = R.drawable.ic_slide_two;
                break;
            case 2:
                photoId = R.drawable.ic_slide_third;
                break;
            default:
                photoId = R.drawable.ic_slide_first;
        }
        return photoId;
    }
}

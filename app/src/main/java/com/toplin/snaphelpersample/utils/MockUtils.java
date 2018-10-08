package com.toplin.snaphelpersample.utils;

import com.toplin.snaphelpersample.data.Slide;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

public final class MockUtils {

    @NonNull
    public static List<Slide> getSlides(int count) {
        List<Slide> slides = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            slides.add(new Slide());
        }
        return slides;
    }
}

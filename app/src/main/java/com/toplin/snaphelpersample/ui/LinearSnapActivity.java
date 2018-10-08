package com.toplin.snaphelpersample.ui;

import com.toplin.snaphelpersample.utils.ScreenUtils;

import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

public class LinearSnapActivity extends BaseActivity {

    @Override
    protected void setSnapHelper() {
        RecyclerView slideRecycler = getSlideRecycler();
        if (slideRecycler != null) {
            LinearSnapHelper snapHelper = new LinearSnapHelper();
            snapHelper.attachToRecyclerView(slideRecycler);
        }
    }

    @Override
    protected int getSlideWidth() {
        return (int) (ScreenUtils.getScreenWidth(this) / 3.f - 20 * ScreenUtils.getScreenDensity());
    }

    @Override
    protected int getSlideHeight() {
        return (int) (ScreenUtils.getScreenHeight(this) / 3.f - 20 * ScreenUtils.getScreenDensity());
    }

    @Override
    protected int getSlideCount() {
        return 11;
    }
}

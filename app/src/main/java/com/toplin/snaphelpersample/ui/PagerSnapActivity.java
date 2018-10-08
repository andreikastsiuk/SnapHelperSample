package com.toplin.snaphelpersample.ui;

import com.toplin.snaphelpersample.utils.ScreenUtils;

import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

public class PagerSnapActivity extends BaseActivity {

    @Override
    protected void setSnapHelper() {
        RecyclerView slideRecycler = getSlideRecycler();
        if (slideRecycler != null) {
            PagerSnapHelper snapHelper = new PagerSnapHelper();
            snapHelper.attachToRecyclerView(slideRecycler);
        }
    }

    @Override
    protected int getSlideWidth() {
        return (int) (ScreenUtils.getScreenWidth(this) - 20 * ScreenUtils.getScreenDensity());
    }

    @Override
    protected int getSlideHeight() {
        return (int) (ScreenUtils.getScreenWidth(this) / 3.f - 20 * ScreenUtils.getScreenDensity());
    }

    @Override
    protected int getSlideCount() {
        return 3;
    }
}

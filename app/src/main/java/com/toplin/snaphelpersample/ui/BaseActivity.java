package com.toplin.snaphelpersample.ui;

import android.os.Bundle;

import com.toplin.snaphelpersample.R;
import com.toplin.snaphelpersample.ui.adapter.SlideAdapter;
import com.toplin.snaphelpersample.utils.MockUtils;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseActivity extends AppCompatActivity {

    private RecyclerView slideRecycler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        setUpViews();
    }

    private void setUpViews() {
        slideRecycler = findViewById(R.id.recycler_slide);
        slideRecycler.setLayoutManager(new LinearLayoutManager(
                this, RecyclerView.HORIZONTAL, false));
        setSnapHelper();
        SlideAdapter slideAdapter = new SlideAdapter(getSlideWidth(), getSlideHeight());
        slideRecycler.setAdapter(slideAdapter);
        slideAdapter.addItems(MockUtils.getSlides(getSlideCount()));
    }

    protected abstract void setSnapHelper();

    protected abstract int getSlideWidth();

    protected abstract int getSlideHeight();

    protected abstract int getSlideCount();

    @Nullable
    public RecyclerView getSlideRecycler() {
        return slideRecycler;
    }
}

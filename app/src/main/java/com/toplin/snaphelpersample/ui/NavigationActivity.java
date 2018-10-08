package com.toplin.snaphelpersample.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.toplin.snaphelpersample.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        setUpViews();
    }

    private void setUpViews() {
        View linearSnapBtn = findViewById(R.id.btn_linear);
        linearSnapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this, LinearSnapActivity.class));
            }
        });

        View pagerSnapBtn = findViewById(R.id.btn_pager);
        pagerSnapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this, PagerSnapActivity.class));
            }
        });
    }
}

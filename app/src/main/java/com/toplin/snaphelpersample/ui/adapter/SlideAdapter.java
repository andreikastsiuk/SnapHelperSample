package com.toplin.snaphelpersample.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.toplin.snaphelpersample.R;
import com.toplin.snaphelpersample.data.Slide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

public class SlideAdapter extends RecyclerView.Adapter<SlideAdapter.SlideViewHolder> {

    private List<Slide> slides;
    private int slideWidth;
    private int slideHeight;

    public SlideAdapter(int slideWidth, int slideHeight) {
        this.slideHeight = slideHeight;
        this.slideWidth = slideWidth;
    }

    @NonNull
    @Override
    public SlideViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_slide, parent, false);
        return new SlideViewHolder(view, slideWidth, slideHeight);
    }

    @Override
    public void onBindViewHolder(@NonNull SlideViewHolder holder, int position) {
        holder.onBindData(slides.get(position));
    }

    @Override
    public int getItemCount() {
        return slides.size();
    }

    public void addItems(@NonNull List<Slide> slides) {
        this.slides = slides;
        notifyDataSetChanged();
    }

    public static class SlideViewHolder extends RecyclerView.ViewHolder {

        private AppCompatImageView photoView;

        public SlideViewHolder(@NonNull View itemView, int width, int height) {
            super(itemView);
            setLayoutParams(width, height);
            setUpViews();
        }

        private void setLayoutParams(int width, int height) {
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            layoutParams.height = height;
            layoutParams.width = width;
            itemView.setLayoutParams(layoutParams);
        }

        private void setUpViews() {
            photoView = itemView.findViewById(R.id.view_photo);
        }

        private void onBindData(@NonNull Slide slide) {
            photoView.setBackgroundResource(slide.getPhotoId());
        }
    }
}

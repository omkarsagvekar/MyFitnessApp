package com.example.myfitnessapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;


public class ImageAdapter extends PagerAdapter {

    private Context mContext;
    private int[] mImageIds = new int[] {R.drawable.stretching_for_runners, R.drawable.quick_warmup_workout_intro,R.drawable.cool_down_warm_exercise_stretching,R.drawable.lat_pull_down,R.drawable.dumbbell_bench_press,R.drawable.front_lateral,R.drawable.side_lateral,R.drawable.seated_dumbbell_overhead_press_main,R.drawable.bicep_curls,R.drawable.tricep_extension,R.drawable.machine_forearm_curl};

    ImageAdapter(Context context){
        mContext=context;
    }
    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView=new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView,0);
        return imageView;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}


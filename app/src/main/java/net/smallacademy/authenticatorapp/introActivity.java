package net.smallacademy.authenticatorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class introActivity extends AppCompatActivity {
    private TextView next;
    private ViewPager viewpager;

    private LinearLayout linearDots;
    private intropref intropref;
    private int[] layouts;
    private TextView[] dots;

    private MyViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        intropref = new intropref(this);
        if (intropref.isFirstTimeLaunch()) {
            launchHomeScreen();
            finish();
        }
        next = findViewById(R.id.next);
        viewpager = findViewById(R.id.viewPager);
        linearDots = findViewById(R.id.layoutView);



        layouts = new int[]{
                R.layout.first_intro,
                R.layout.second_intro,
                R.layout.third_intro

        };
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int current = getItem(+1);
                if (current < layouts.length) {
                    viewpager.setCurrentItem(current);

                } else {
                    launchHomeScreen();
                }

            }
        });
        viewPagerAdapter = new MyViewPagerAdapter();
        viewpager.setAdapter(viewPagerAdapter);
        viewpager.addOnPageChangeListener(onPageChangeListener);
        addBottomDots(0);



    }

    ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addBottomDots(position);
            if (position == layouts.length - 1) {
                next.setText("START");
            }

        else

        {
            next.setText("NEXT");
        }
    }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
    private void addBottomDots(int currentPage){
        dots=new TextView[layouts.length];
        int [] activeColors =getResources().getIntArray(R.array.active);
        int [] inactiveColors =getResources().getIntArray(R.array.inactive);
        linearDots.removeAllViews();
        for(int k = 0; k < dots.length; k += 1 ) {
            dots[k] = new TextView(this);
            dots[k].setText(Html.fromHtml("& #8226; "));
            dots[k].setTextColor(inactiveColors[currentPage]);
            linearDots.addView(dots[k]);}
        if (dots.length>0){
            dots[currentPage].setTextColor(activeColors[currentPage]);
        }


    }
    public class MyViewPagerAdapter extends PagerAdapter{
        LayoutInflater layoutInflater;
        public MyViewPagerAdapter(){

        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view =layoutInflater.inflate(layouts[position],container,false);
            container.addView(view);
            return view;
        }

        @Override
        public int getCount() {
            return layouts.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view ==object;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            View view =(View) object;
            container.removeView(view);

        }
    }
    private  int getItem(int i){
        return viewpager.getCurrentItem()+1;
    }

    private void launchHomeScreen() {
        intropref.setIsFirstTimeLaunch(false);
        startActivity(new Intent(getApplicationContext(),Register.class));
        finish();
    }
}
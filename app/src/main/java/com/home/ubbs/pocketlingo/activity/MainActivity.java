package com.home.ubbs.pocketlingo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.home.ubbs.pocketlingo.R;
import com.home.ubbs.pocketlingo.fragment.BaseFragment;
import com.home.ubbs.pocketlingo.fragment.french.SampleFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BaseFragment fragment = new SampleFragment();
        // Add the fragment to the 'fragment_container' FrameLayout
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame_container, fragment).commit();
    }
}

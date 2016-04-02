package com.home.ubbs.pocketlingo.view;

import android.util.Log;
import android.view.View;

/**
 * Created by udyatbhanu-mac on 4/1/16.
 */
public class ButtonOnClickListener implements View.OnClickListener{
    private int position;

    public ButtonOnClickListener() {
    }

    public ButtonOnClickListener(int position) {
        this.position = position;
    }
    @Override
    public void onClick(View v) {
        Log.i("Info", position+" Button click..!!");

    }
}

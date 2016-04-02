package com.home.ubbs.pocketlingo.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.home.ubbs.pocketlingo.R;

/**
 * Created by udyatbhanu-mac on 4/1/16.
 */
public class CustomGridBaseAdapter extends BaseAdapter {

    Context context;
    public CustomGridBaseAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 12;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder {
        public Button button;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder view;
        LayoutInflater inflater = LayoutInflater.from(context);


        if (convertView == null) {
            view = new ViewHolder();
            convertView = inflater.inflate(R.layout.grid_item, null);
            view.button = (Button)convertView.findViewById(R.id.button);
            view.button.setOnClickListener(new ButtonOnClickListener(position));
            convertView.setTag(view);
        }else{
            view = (ViewHolder) convertView.getTag();
        }





        return convertView;
    }
}

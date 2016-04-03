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
        return 20;
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
        ViewHolder viewHolder = new ViewHolder();
        LayoutInflater inflater = LayoutInflater.from(context);


        if (convertView == null) {

            convertView = inflater.inflate(R.layout.grid_item, null);
            viewHolder.button = (Button)convertView.findViewById(R.id.button);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.button.setText("Button position: "+position);
        viewHolder.button.setOnClickListener(new ButtonOnClickListener(position));




        return convertView;
    }
}

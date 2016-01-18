package com.example.dongja94.samplespinner;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongja94 on 2016-01-18.
 */
public class MyAdapter extends BaseAdapter {
    List<String> items = new ArrayList<String>();

    public void add(String s) {
        items.add(s);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        if (convertView == null) {
            tv = new TextView(parent.getContext());
        } else {
            tv = (TextView)convertView;
        }
        tv.setText(items.get(position));
        return tv;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        if (convertView == null) {
            tv = new TextView(parent.getContext());
        } else {
            tv = (TextView)convertView;
        }
        tv.setText(items.get(position));
        tv.setBackgroundColor(Color.GREEN);
        return tv;
    }
}

package com.swapnil;

import java.util.Vector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	
	private Context ctx;
	private Vector<String> namesArray;

	public MyAdapter(Context context, Vector<String> namesArray2) {
		this.ctx = context;
		this.namesArray = namesArray2;
		
	}

	public int getCount() {
		return namesArray.size();
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		convertView = LayoutInflater.from(ctx).inflate(R.layout.names, null);
		((TextView)convertView.findViewById(R.id.textView1)).setText(namesArray.get(position));
		return convertView;
	}

}

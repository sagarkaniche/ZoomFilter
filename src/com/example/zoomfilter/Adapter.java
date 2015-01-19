package com.example.zoomfilter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
public class Adapter extends BaseAdapter{
	
	Context context;
	ArrayList<SingleItem> array;
	MyViewHolder holder ;
	SingleItem single;
	public Adapter(Context c,ArrayList<SingleItem> list) {
		// TODO Auto-generated constructor stub
		context = c;
		array = list;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return array.size();
	}

	@Override
	public SingleItem getItem(int position) {
		// TODO Auto-generated method stub
		return array.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return array.get(position).hashCode();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		View view = convertView;
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		view = inflater.inflate(R.layout.singleitem, parent,false);
		single = array.get(position);
		holder = new MyViewHolder(view,single.getId());
		holder.brand.setTag(holder);
		holder.check.setTag(holder);
		
		return view;
	}

}

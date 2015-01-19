package com.example.zoomfilter;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MyViewHolder {
	TextView value,mileage,year,engine,doors,price;
	int id;
	TextView brand,model,bodytype,color,transmission,drivetrain;
	CheckBox check;
	public MyViewHolder(View v,int itemid) {
		// TODO Auto-generated constructor stub
		value = (TextView) v.findViewById(R.id.value);
		brand = (TextView) v.findViewById(R.id.brand);
		price = (TextView) v.findViewById(R.id.price);
		check = (CheckBox) v.findViewById(R.id.checkbox);
		id = itemid;
	}
}

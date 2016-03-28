package com.example.fbs;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<String> {

	private List<String> list;
	private Activity activity;

	public class ViewHolder {

		TextView drname, field,time;
		LinearLayout layout;
	}

	public ListAdapter(Activity activity, int activtyadapter, List<String> arlist) {

		super(activity, activtyadapter, arlist);
		this.activity = activity;
		this.list = arlist;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder holder = null;

		if (convertView == null) {
			LayoutInflater vi = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = vi.inflate(R.layout.activity_listadapter, null);

			holder = new ViewHolder();
			holder.drname = (TextView) convertView.findViewById(R.id.listadapter_drname);
			holder.field = (TextView) convertView.findViewById(R.id.listadapter_field);
			holder.layout=(LinearLayout) convertView.findViewById(R.id.listadapter_layout);
			convertView.setTag(holder);

		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.drname.setText(list.get(position));
		if(position%2==0)
			holder.layout.setBackgroundColor(Color.parseColor("#156A86"));

		return convertView;

	}


}

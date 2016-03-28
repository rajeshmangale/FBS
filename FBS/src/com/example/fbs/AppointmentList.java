package com.example.fbs;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class AppointmentList extends Activity {

	private ListView list;
	private ListAdapter adapter;
	ArrayList<String> arr=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_appointment_list);
		
		list =(ListView) findViewById(R.id.main_listview);
		arr=new ArrayList<String>();
		arr.add("ABC");
		arr.add("DEF");
		arr.add("XYZ");
		arr.add("PQR");
		
		
		adapter=new ListAdapter(AppointmentList.this,R.layout.activity_listadapter , arr);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() 
		{

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) 
			{
				// TODO Auto-generated method stub
			
				if(position==0)
				{
					Intent i = new Intent(AppointmentList.this,AppointmentDetails.class);
					startActivity(i);
				}
				if(position==1)
				{
					Intent i = new Intent(AppointmentList.this,AppointmentDetails.class);
					startActivity(i);
				}
				if(position==2)
				{
					Intent i = new Intent(AppointmentList.this,AppointmentDetails.class);
					startActivity(i);
				}
				if(position==3)
				{
					Intent i = new Intent(AppointmentList.this,AppointmentDetails.class);
					startActivity(i);
				}
				
			}
		});
		
		
		
	}
}

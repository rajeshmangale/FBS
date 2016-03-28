package com.example.fbs;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splashscreen);

		Thread th = new Thread() {
			public void run() {
				try {
					sleep(5000);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Intent i = new Intent(SplashScreen.this, AppointmentList.class);
				startActivity(i);
				finish();
			}
		};
		th.start();	
	}
}

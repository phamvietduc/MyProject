package com.example.amthucvasuckhoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class AmThucViet extends Activity {
	ImageView image1,image2,image3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_am_thuc_viet);
		 image1=(ImageView)findViewById(R.id.imageView1);
	        image2=(ImageView)findViewById(R.id.imageView2);
	        image3=(ImageView)findViewById(R.id.imageView3);
	        image1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent  intent =new Intent(AmThucViet.this, ListMonAn.class);
					startActivity(intent);
				}
			});
	}
}

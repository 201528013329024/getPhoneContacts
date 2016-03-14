package com.example.tongxunlu;

import android.R.anim;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private ListView lv;
	private MyAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		GetNumber.getNumber(this);
		
		lv = (ListView) findViewById(R.id.lv);
		
		adapter = new MyAdapter(GetNumber.list, this);
		lv.setAdapter(adapter);
	}
}

package com.example.tongxunlu;

import java.util.List;
import java.util.zip.Inflater;

import com.example.tongxunlu.R.id;

import android.R.color;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.OperationCanceledException;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{

	private List<PhoneInfo> lists;
	private Context context = null;
	private LinearLayout layout;

 	public MyAdapter(List<PhoneInfo> lists, Context context) {
		this.context = context;
		this.lists = lists;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		return lists.size();
	}

	@Override
	public Object getItem(int position) {
		return lists.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	
//	public String callNumber = null;
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView != null) {
			layout = (LinearLayout) convertView;
		} else {
			LayoutInflater inflater = LayoutInflater.from(getContext());
			layout = (LinearLayout) inflater.inflate(R.layout.aty_cell, null);
		}

		TextView tvName = (TextView) layout.findViewById(R.id.tvName);
		TextView tvNumber = (TextView) layout.findViewById(R.id.tvNumber);

		tvName.setText(lists.get(position).getPhoneName());
		tvNumber.setText(lists.get(position).getPhoneNumber());

//	    callNumber = lists.get(position).getPhoneNumber();
		
//		layout.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Intent intent = new Intent(Intent.ACTION_VIEW);
////				intent.setData(Uri.parse("tel:"+tvNumber.getText()));// 启动系统拨打电话程序
//				intent.setData(Uri.parse("tel:"+callNumber));// 启动系统拨打电话程序
////				System.out.println("点击！！！！！！！！！！"+);
////				Activity.startActivity(intent, null);
//				context.startActivity(intent);
//			}
//		});;
		return layout;
	}


}

package com.example.tongxunlu;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.opengl.ETC1Util.ETC1Texture;
import android.provider.ContactsContract.CommonDataKinds.Phone;

public class GetNumber {
	
	public static List<PhoneInfo> list = new ArrayList<PhoneInfo>();
	
	public static String getNumber(Context context) {
		Cursor cursor = context.getContentResolver().query(Phone.CONTENT_URI, null, null, null, null);
		String phoneName,phoneNumber;
		
		while (cursor.moveToNext()) {
			phoneName = cursor.getString(cursor.getColumnIndex(Phone.DISPLAY_NAME));
			phoneNumber = cursor.getString(cursor.getColumnIndex(Phone.NUMBER));
			
			PhoneInfo phoneInfo = new PhoneInfo(phoneName, phoneNumber);
			list.add(phoneInfo);
			System.out.println(phoneName+"  "+phoneNumber);
		}
		return null;
	}
}

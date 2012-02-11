package com.swapnil;

import java.util.Vector;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class HelloWorldActivity extends Activity implements OnItemClickListener  {
	Context mContext = HelloWorldActivity.this;
	private ListView list;
	private Vector<String> namesArray = new Vector<String>();
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        namesArray.add("Kaustubh");
		namesArray.add("sagar");
		namesArray.add("swapnil");
		namesArray.add("piyush");
		namesArray.add("akhil");
		namesArray.add("Prem");
		namesArray.add("Animal Planet");
		namesArray.add("Dholu");
		namesArray.add("Angry Birds");
		namesArray.add("Prison Break");
        
        
        list = (ListView) findViewById(R.id.namesList1);
        list.setAdapter(new MyAdapter(mContext,namesArray));
        
        list.setOnItemClickListener(this);
    }

	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		Toast.makeText(mContext, "position "+arg2, Toast.LENGTH_SHORT).show();
		
		Bundle bundle = new Bundle();
		bundle.putString("name", ""+namesArray.get(arg2));
		
		Intent intent = new Intent(mContext,FirstActivity.class);
		intent.putExtra("name", ""+namesArray.get(arg2));
		startActivity(intent);
	}

}
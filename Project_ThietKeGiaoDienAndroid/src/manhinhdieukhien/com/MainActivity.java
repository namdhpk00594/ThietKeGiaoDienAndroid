package manhinhdieukhien.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import lab1.com.*;
import lab2.com.lab2;
import lab3.com.lab3;
import lab4.com.lab4;
import lab5.com.lab5;
import lab6.com.lab6;
import lab7.com.lab7;
import lab8.com.lab8;
import manhinhdieukhien.com.R;

public class MainActivity extends Activity implements OnClickListener {

	Button btnlab1,btnlab2,btnlab3,btnlab4,btnlab5,btnlab6,btnlab7,btnlab8;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnlab1 = (Button) findViewById(R.id.btnlab1);
		btnlab2 = (Button) findViewById(R.id.btnlab2);
		btnlab3 = (Button) findViewById(R.id.btnlab3);
		btnlab4 = (Button) findViewById(R.id.btnlab4);
		btnlab5 = (Button) findViewById(R.id.btnlab5);
		btnlab6 = (Button) findViewById(R.id.btnlab6);
		btnlab7 = (Button) findViewById(R.id.btnlab7);
		btnlab8 = (Button) findViewById(R.id.btnlab8);
		
		btnlab1.setOnClickListener(this);//Set su kien cho btn1
		btnlab2.setOnClickListener(this);
		btnlab3.setOnClickListener(this);
		btnlab4.setOnClickListener(this);
		btnlab5.setOnClickListener(this);
		btnlab6.setOnClickListener(this);
		btnlab7.setOnClickListener(this);
		btnlab8.setOnClickListener(this);
		
		
		
	//SuKien();
	}
	@Override
	public void onClick(View v) {
		if(v==btnlab1){
			Toast.makeText(getApplicationContext(), "Lab1", Toast.LENGTH_LONG).show();
			Intent intent = new Intent(getApplicationContext(),lab1.class);
			startActivity(intent);
		}
		if(v==btnlab2){
			Toast.makeText(getApplicationContext(), "Lab2", Toast.LENGTH_LONG).show();
			Intent intent = new Intent(getApplicationContext(),lab2.class);
			startActivity(intent);
		}
		if(v==btnlab3){
			Toast.makeText(getApplicationContext(), "Lab3", Toast.LENGTH_LONG).show();
			Intent intent = new Intent(getApplicationContext(),lab3.class);
			startActivity(intent);
		}
		if(v==btnlab4){
			Toast.makeText(getApplicationContext(), "Lab4", Toast.LENGTH_LONG).show();
			Intent intent = new Intent(getApplicationContext(),lab4.class);
			startActivity(intent);
		}
		if(v==btnlab5){
			Toast.makeText(getApplicationContext(), "Lab5", Toast.LENGTH_LONG).show();
			Intent intent = new Intent(getApplicationContext(),lab5.class);
			startActivity(intent);
		}
		if(v==btnlab6){
			Toast.makeText(getApplicationContext(), "Lab6", Toast.LENGTH_LONG).show();
			Intent intent = new Intent(getApplicationContext(),lab6.class);
			startActivity(intent);
		}
		if(v==btnlab7){
			Toast.makeText(getApplicationContext(), "Lab7", Toast.LENGTH_LONG).show();
			Intent intent = new Intent(getApplicationContext(),lab7.class);
			startActivity(intent);
		}
		if(v==btnlab8){
			Toast.makeText(getApplicationContext(), "Lab8", Toast.LENGTH_LONG).show();
			Intent intent = new Intent(getApplicationContext(),lab8.class);
			startActivity(intent);
		}
		
		
	}
	/*
	private void SuKien() {
		btnlab1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Lab01", Toast.LENGTH_LONG).show();
				
			}
		});
		btnlab2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Lab02", Toast.LENGTH_LONG).show();
				
			}
		});
		btnlab3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Lab03", Toast.LENGTH_LONG).show();
				
			}
		});
		btnlab4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Lab04", Toast.LENGTH_LONG).show();
				
			}
		});
		btnlab5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Lab05", Toast.LENGTH_LONG).show();
				
			}
		});
		btnlab6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Lab06", Toast.LENGTH_LONG).show();
				
			}
		});
		btnlab7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Lab07", Toast.LENGTH_LONG).show();
				
			}
		});
		btnlab8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Lab08", Toast.LENGTH_LONG).show();
				
			}
		});
		
		
	}
	*/

	
	
}

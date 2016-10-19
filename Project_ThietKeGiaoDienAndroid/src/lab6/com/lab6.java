package lab6.com;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import manhinhdieukhien.com.R;

public class lab6 extends TabActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {  
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab6);
		
		TabHost tabhost = getTabHost();
		TabSpec tabspec = tabhost.newTabSpec("first");
		TabSpec tabspec2 = tabhost.newTabSpec("second");
		
		
		tabspec.setIndicator("Tab1");
		tabspec.setContent(new Intent(this, lab6_tabhost1.class));
		tabspec2.setIndicator("Tab2");
		tabspec2.setContent(new Intent(this, lab6_tabhost2.class));
		
		
		tabhost.addTab(tabspec);
		tabhost.addTab(tabspec2);
		
	}

	
}

package lab1.com;

import aboutme.com.aboutme;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import lab8.com.lab8;
import manhinhdieukhien.com.R;

public class lab1 extends Activity {
	
	Button btnAboutme;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab1);
		
		String doc="https://drive.google.com/file/d/0BxASZH_T9NTubVl4Q2dxUEJZM00/view?usp=sharing";
		
		WebView wv = (WebView)findViewById(R.id.fileWebView);
		
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setAllowFileAccess(true);
		wv.getSettings().setLoadsImagesAutomatically(true);
		
		wv.loadUrl(doc);
		
		btnAboutme = (Button) findViewById(R.id.btnAboutme);
		
		sukien();
	
		
		
	}

	private void sukien() {
		// TODO Auto-generated method stub
		btnAboutme.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),aboutme.class);
				startActivity(intent);
			}
		});
		
	}

}

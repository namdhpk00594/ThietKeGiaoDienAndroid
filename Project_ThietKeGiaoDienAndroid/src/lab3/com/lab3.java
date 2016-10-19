package lab3.com;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import manhinhdieukhien.com.R;
import quantri.com.quantri;

public class lab3 extends Activity implements OnClickListener{
	Button btnLogin;
	TextView txtReg,txtPass;
	EditText edtuser,edtpass;
	BroadcastReceiver Receiver = new BroadcastReceiver() {
		
		@Override
		public void onReceive(Context context, Intent intent) {
			ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
			if(connectivityManager.getActiveNetworkInfo() !=null){
				btnLogin.setEnabled(true);
				Toast.makeText(getBaseContext(),"Wifi True", Toast.LENGTH_LONG).show();
			}else{
				btnLogin.setEnabled(false);
				Toast.makeText(getBaseContext(), "Wifi false", Toast.LENGTH_LONG).show();
			}
		}
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab3);
		edtuser = (EditText) findViewById(R.id.edtuser);
		edtpass = (EditText) findViewById(R.id.edtpass);
		btnLogin = (Button) findViewById(R.id.btnLogin);
		txtReg = (TextView) findViewById(R.id.txtReg);
		txtPass = (TextView) findViewById(R.id.txtPass);
		
		btnLogin.setOnClickListener(this);
		txtReg.setOnClickListener(this);
		txtPass.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		if (v==btnLogin) {
			String user = edtuser.getText().toString();
			String pass = edtpass.getText().toString();
			if (user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
				Intent intent = new Intent(getApplicationContext(),quantri.class);
				startActivity(intent);				
			}
		}
		if (v==txtReg) {
			Intent intent=new Intent(getApplicationContext(),dangky.class);
			startActivity(intent);		
		}
		if (v==txtPass) {
			Intent intent = new Intent(getApplicationContext(),quenmatkhau.class);
			startActivity(intent);			
		}
		
	}
	@Override
	protected void onResume() {
		super.onResume();
		IntentFilter filterWifi = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
		registerReceiver(Receiver, filterWifi);		
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if (Receiver!=null) {
			unregisterReceiver(Receiver);
		}
	}
	
}

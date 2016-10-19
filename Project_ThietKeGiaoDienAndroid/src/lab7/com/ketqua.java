package lab7.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import manhinhdieukhien.com.R;

public class ketqua extends Activity{
	Button btnBack;
	TextView txtNhan,txtNhan2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab7_ketqua);
		txtNhan = (TextView) findViewById(R.id.txtNhan);
		txtNhan2 = (TextView) findViewById(R.id.txtNhan2);
		String gt = getIntent().getExtras().getString("requestCode");
		String gt2 = getIntent().getExtras().getString("requestCode2");
		txtNhan.setText(gt);
		txtNhan2.setText(gt2);
		
		btnBack = (Button) findViewById(R.id.btnBack);
		
		chuyentrang();
	}
	private void chuyentrang() {
		btnBack.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),lab7.class);
				startActivity(intent);
			}
		});
		
	}
}

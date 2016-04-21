package com.example.progressdialog;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btnShow;
	private Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = this;
		btnShow = (Button) findViewById(R.id.btn_show);
		btnShow.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String msg = getString(R.string.sf_progress_dialog_image_loading);
				ProgressDialogShowOrHide.showCustomProgrssDialog(msg, context);
			}
		});

	}

}

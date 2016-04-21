package com.example.progressdialog;

import android.content.Context;

public class ProgressDialogShowOrHide {
	private static SFProgrssDialog m_customProgrssDialog;

	final static void showCustomProgrssDialog(String msg, Context context) {
		if (null == m_customProgrssDialog)
			m_customProgrssDialog = SFProgrssDialog
					.createProgrssDialog(context);

		if (null != m_customProgrssDialog) {
			m_customProgrssDialog.setMessage(msg);
			m_customProgrssDialog.show();
			m_customProgrssDialog.setCancelable(false);
		}
	}

	final void hideCustomProgressDialog() {
		if (null != m_customProgrssDialog) {
			m_customProgrssDialog.dismiss();
			m_customProgrssDialog = null;
		}
	}
}

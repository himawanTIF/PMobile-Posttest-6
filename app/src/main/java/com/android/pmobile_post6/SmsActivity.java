package com.android.pmobile_post6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SmsActivity extends AppCompatActivity {

    public EditText mSmsNomor, mSmsIsiPesan;
    public Button mBtnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        mSmsNomor = (EditText) findViewById(R.id.smsNomor);
        mSmsIsiPesan = (EditText) findViewById(R.id.smsIsiPesan);
        mBtnKirim = (Button) findViewById(R.id.btn_kirim);

        mBtnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iKirim = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("smsto:" + mSmsNomor.getText().toString()));
                iKirim.putExtra("sms_body", mSmsIsiPesan.getText().toString());
                startActivity(iKirim);
            }
        });
    }
}

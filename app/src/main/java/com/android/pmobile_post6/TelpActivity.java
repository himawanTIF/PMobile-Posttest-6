package com.android.pmobile_post6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelpActivity extends AppCompatActivity {

    public EditText mNomor;
    public Button mBtn_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telp);

        mBtn_call = (Button) findViewById(R.id.btn_call);
        mNomor = (EditText) findViewById(R.id.nomor);

        mBtn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCall = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:" + mNomor.getText().toString()));
                startActivity(iCall);
            }
        });
    }
}

package com.android.pmobile_post6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MapsActivity extends AppCompatActivity {

    public EditText mCariMaps;
    public Button mBtnMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        mCariMaps = (EditText)findViewById(R.id.cari_maps);
        mBtnMaps = (Button)findViewById(R.id.btn_maps);

        mBtnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maps = new Intent(Intent.ACTION_VIEW);
                maps.setData(Uri.parse("geo:0,0?q=" + mCariMaps.getText().toString()));
                maps.setPackage("com.google.android.apps.maps");
                startActivity(maps);
            }
        });
    }
}

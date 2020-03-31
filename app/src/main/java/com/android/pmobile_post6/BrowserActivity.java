package com.android.pmobile_post6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BrowserActivity extends AppCompatActivity {

    public EditText mBukaBrowser;
    public Button mBtnBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        mBukaBrowser = (EditText) findViewById(R.id.buka_browser);
        mBtnBrowser = (Button) findViewById(R.id.btn_browser);

        mBtnBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse("http://www.google.com/#q=" + mBukaBrowser.getText()));
                startActivity(Intent.createChooser(browser, "Buka dengan..."));
            }
        });
    }
}

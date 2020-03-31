package com.android.pmobile_post6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungActivity extends AppCompatActivity {
    private EditText hjari_jari;
    private Button hbtn_hvolume, hbtn_hluaspm;
    private TextView hasil_vol, hasil_luaspm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung);

        hjari_jari = (EditText) findViewById(R.id.jari_jari);
        hbtn_hvolume = (Button) findViewById(R.id.btn_hvolume);
        hbtn_hluaspm = (Button) findViewById(R.id.btn_hluaspm);
        hasil_vol = (TextView) findViewById(R.id.hasil_vol);
        hasil_luaspm = (TextView) findViewById(R.id.hasil_luaspm);

        hbtn_hvolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hit_volBola(v);
            }
        });
        hbtn_hluaspm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hit_lpBola(v);
            }
        });
    }

    public void hit_volBola(View v) {
        try {
            double r = Integer.parseInt(hjari_jari.getText().toString());
            double volBola = 4 / 3 * 3.14 * r * r * r;
            hasil_vol.setText(String.valueOf(volBola));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hit_lpBola(View v) {
        try {
            double r = Integer.parseInt(hjari_jari.getText().toString());
            double luasper = 4 * 3.14 * r * r;
            hasil_luaspm.setText(String.valueOf(luasper));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

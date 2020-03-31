package com.android.pmobile_post6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public boolean exit = true;
    private EditText hjari_jari;
    private Button hbtn_hvolume, hbtn_hluaspm;
    private TextView hasil_vol, hasil_luaspm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menu_sms() {
        Intent esemes = new Intent(MainActivity.this, SmsActivity.class);
        startActivity(esemes);
        Toast.makeText(this, "Ini Halaman SMS", Toast.LENGTH_SHORT).show();
        exit = false;
    }

    public void menu_telp() {
        Intent panggil = new Intent(MainActivity.this, TelpActivity.class);
        startActivity(panggil);
        Toast.makeText(this, "Ini Halaman Telephone", Toast.LENGTH_SHORT).show();
        exit = false;
    }

    public void menu_browser() {
        Intent browsing = new Intent(MainActivity.this, BrowserActivity.class);
        startActivity(browsing);
        Toast.makeText(this, "Ini Browser", Toast.LENGTH_SHORT).show();
        exit = false;
    }

    public void menu_maps() {
        Intent travel = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(travel);
        Toast.makeText(this, "Ini Maps", Toast.LENGTH_SHORT).show();
        exit = false;
    }

    public void menu_hitung() {
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

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sms:
                menu_sms();
                break;
            case R.id.telp:
                menu_telp();
                break;
            case R.id.browser:
                menu_browser();
                break;
            case R.id.maps:
                menu_maps();
                break;
            case R.id.hitung:
                setContentView(R.layout.activity_hitung);
                menu_hitung();
                break;
            default:
                return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        if (exit) {
            super.onBackPressed();
        }
        setContentView(R.layout.activity_main);
        exit = true;
    }
}

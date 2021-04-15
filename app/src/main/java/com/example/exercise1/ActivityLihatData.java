package com.example.exercise1;

import androidx.appcompat.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);


        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");


        switch (nama) {
            case "Zahra":
                tvnama.setText("Zahra A");
                tvnomor.setText("08122233344");
                break;
            case "Bian ":
                tvnama.setText("Bian R");
                tvnomor.setText("08133224455");
                break;
            case "Jia ":
                tvnama.setText("Jia K");
                tvnomor.setText("08125533344");
                break;
            case "Caca ":
                tvnama.setText("Caca L");
                tvnomor.setText("08122453344");
                break;
            case "Rafly":
                tvnama.setText("Rafly B");
                tvnomor.setText("08126633344");
                break;
            case "Dinda":
                tvnama.setText("Dinda A");
                tvnomor.setText("08122555344");
                break;
            case "Rey":
                tvnama.setText("Rey W");
                tvnomor.setText("08125556344");
                break;
            case "Tiara":
                tvnama.setText("Tiara A");
                tvnomor.setText("08199233344");
                break;
            case "Qilla":
                tvnama.setText("Qilla Y");
                tvnomor.setText("08122233234");
                break;
            case "Dewi":
                tvnama.setText("Dewi M");
                tvnomor.setText("08122969344");
                break;
        }
    }
}
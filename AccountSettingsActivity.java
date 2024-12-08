package com.example.profilfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.example.profilfirebase.RiwayatActivity;
import com.example.profilfirebase.KebijakanActivity;

import androidx.appcompat.app.AppCompatActivity;

public class AccountSettingsActivity extends AppCompatActivity {

    private Button riwayatButton, syaratButton, kebijakanButton, pusatBantuanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);

        // Inisialisasi tombol
        riwayatButton = findViewById(R.id.riwayatButton);
        syaratButton = findViewById(R.id.syaratButton);
        kebijakanButton = findViewById(R.id.kebijakanButton);
        pusatBantuanButton = findViewById(R.id.pusatBantuanButton);

        // Navigasi ke halaman fitur
        riwayatButton.setOnClickListener(v -> openActivity(RiwayatActivity.class));
        syaratButton.setOnClickListener(v -> openActivity(SyaratActivity.class));
        kebijakanButton.setOnClickListener(v -> openActivity(KebijakanActivity.class));
        pusatBantuanButton.setOnClickListener(v -> openActivity(PusatBantuanActivity.class));
    }

    private void openActivity(Class<?> activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}

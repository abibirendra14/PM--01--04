package com.example.profilfirebase;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class PusatBantuanActivity extends AppCompatActivity {

    private ListView helpListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pusat_bantuan);

        helpListView = findViewById(R.id.helpListView);

        // Data dummy daftar pusat bantuan
        String[] bantuanItems = {
                "Cara mengubah kata sandi",
                "Mengatasi masalah login",
                "Cara menghapus akun",
                "Kebijakan pembatalan transaksi",
                "Hubungi tim dukungan"
        };

        // Adapter untuk menampilkan daftar
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                bantuanItems
        );

        helpListView.setAdapter(adapter);
    }
}

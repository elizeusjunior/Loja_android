package com.example.loja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnProduto, btnCliente, btnVenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCliente = findViewById(R.id.btnCliente);
        btnProduto = findViewById(R.id.btnProduto);
        btnVenda = findViewById(R.id.btnVenda);

        btnProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProdutoActivity.class);
                startActivityForResult(intent, 1);
            }
        });
        btnCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ClienteActivity.class);
                startActivityForResult(intent,1);
            }
        });
        btnVenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), VendaActivity.class);
                startActivityForResult(intent,1);
            }
        });


    }
}
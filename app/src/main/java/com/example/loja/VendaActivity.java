package com.example.loja;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class VendaActivity extends AppCompatActivity {
    private Button buttonVoltar, buttonCadastrarVenda;
    private EditText editTextData, editTextQuantidadeVenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venda);

        //referências
        buttonCadastrarVenda = findViewById(R.id.buttonCadastrarProduto);
        buttonVoltar = findViewById(R.id.buttonVoltar);
        editTextData = findViewById(R.id.editTextData);
        editTextQuantidadeVenda = findViewById(R.id.editTextQuantidadeVenda);
    }
    public void onCadastrarVenda(View view){
        if (!editTextData.getText().toString().isEmpty() && !editTextQuantidadeVenda.toString().isEmpty()){
            Venda venda = new Venda(editTextData.getText().toString(), editTextQuantidadeVenda.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("produtos", venda);
            setResult(Activity.RESULT_OK, intent);
            Toast.makeText(this, "Cadastrado com sucesso", Toast.LENGTH_SHORT).show();
            finish();
        }else Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();


    }
    public void onVoltar(View view){
        finish();

    }
}
package com.example.loja;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProdutoActivity extends AppCompatActivity {
    private EditText editTextDescricao, editTextCategoria, editTextPreco, editTextQuantidadeProduto;
    private Button buttonVoltar, buttonCadastrarProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        //referências
        editTextDescricao = findViewById(R.id.editTextDescricao);
        editTextCategoria = findViewById(R.id.editTextCategoria);
        editTextPreco = findViewById(R.id.editTextPreco);
        editTextQuantidadeProduto = findViewById(R.id.editTextQuantidadeProduto);
        buttonCadastrarProduto = findViewById(R.id.buttonCadastrarProduto);
        buttonVoltar = findViewById(R.id.buttonVoltar);
    }
    public void onCadastrarProduto(View view){
    if (!editTextDescricao.getText().toString().isEmpty() && !editTextCategoria.toString().isEmpty() && !editTextPreco.toString().isEmpty()
            && !editTextQuantidadeProduto.toString().isEmpty()){
        Produto produto = new Produto(editTextDescricao.getText().toString(), editTextCategoria.getText().toString(),
                editTextPreco.getText().toString(), editTextQuantidadeProduto.getText().toString());
        Intent intent = new Intent();
        intent.putExtra("produtos", produto);
        setResult(Activity.RESULT_OK, intent);
        Toast.makeText(this, "Cadastrado com sucesso", Toast.LENGTH_SHORT).show();
        finish();
        }else Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();


        }
    public void onVoltar(View view){
        finish();

    }
}
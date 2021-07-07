package com.example.loja;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ClienteActivity extends AppCompatActivity {
    private EditText editTextNome, editTextEmail, editTextCPF, editTextSenha;
    private Button buttonVoltar, buttonCadastrarCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        //referências
        editTextNome = findViewById(R.id.editTextDescricao);
        editTextEmail = findViewById(R.id.editTextCategoria);
        editTextCPF = findViewById(R.id.editTextPreco);
        editTextSenha = findViewById(R.id.editTextQuantidadeProduto);
        buttonCadastrarCliente = findViewById(R.id.buttonCadastrarProduto);
        buttonVoltar = findViewById(R.id.buttonVoltar);
    }
    public void onCadastrarCliente(View view){
        if (!editTextNome.getText().toString().isEmpty() && !editTextEmail.toString().isEmpty() && !editTextCPF.toString().isEmpty()
                && !editTextSenha.toString().isEmpty()){
            Cliente cliente = new Cliente(editTextNome.getText().toString(), editTextEmail.getText().toString(),
                    editTextCPF.getText().toString(), editTextSenha.getText().toString());
            Intent intent = new Intent();
            intent.putExtra("clientes", cliente);
            setResult(Activity.RESULT_OK, intent);
            Toast.makeText(this, "Cadastrado com sucesso", Toast.LENGTH_SHORT).show();
            finish();
        }else Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();


    }
    public void onVoltar(View view){
        finish();

    }
}
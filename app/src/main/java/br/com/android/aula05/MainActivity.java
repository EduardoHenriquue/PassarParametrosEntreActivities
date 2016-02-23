package br.com.android.aula05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Texto da activity
        texto = (TextView)findViewById(R.id.texto_bem_vindo);
        // Inicializa a intenção para a troca de tela
        Intent intent = new Intent();
        // Recupera os argumentos do map da intent que foram passados na activity anterior.
        Bundle args = getIntent().getExtras();
        // Obtém o parâmetro do map que contém a String "nome"
        String nome = args.getString("nome");
        // seta o texto da activity concatenando o texto anterior ao String obtido no map.
        texto.setText("Seja bem vindo, " + nome + "!");
    }
}

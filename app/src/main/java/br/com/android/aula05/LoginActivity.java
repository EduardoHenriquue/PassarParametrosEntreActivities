package br.com.android.aula05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText mLogin;
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLogin = (EditText)findViewById(R.id.login);
        mBtn = (Button)findViewById(R.id.btn);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logar();
            }
        });
    }

    private void logar() {
        mLogin.setError(null);
        String login = mLogin.getText().toString();
        View focusView = null;
        boolean cancel = false;

        if(TextUtils.isEmpty(login)){
            mLogin.setError("Este campo está vazio!");
            focusView = mLogin;
            cancel = true;
        }

        else{
            // Intenção para a troca de tela
            Intent intent = new Intent(this,MainActivity.class);
            // Inicializa um objeto do tipo Bundle
            Bundle params = new Bundle();
            // Adiciona parâmetros ao Bundle inicializado
            params.putString("nome", login);
            // Adiciona o map(Bundle) à intent.
            intent.putExtras(params);

            startActivity(intent);
            finish();
        }
    }
}

package com.example.rapid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }


    private static final String USUARIO = "agua@hotmail.com";
    private static final String SENHA = "natural";

//Teremos as duas constantes do tipo texto contendo valores padrões.


    private String Usuario= String.valueOf((R.id.email));
    private String Senha=String.valueOf((R.id.senha));

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

//Teremos também os atributos “Usuário” e “Senha” devidamente encapsulados.

    public void entrada() {

    }

//No método construtor não faremos nada de diferente.


    //CharSequence















    public boolean ValidarUsuario() {
        if (Usuario.equals("")) {
            Context contexto=getApplicationContext();

            String texto="Email Vazio";

            int dura =Toast.LENGTH_SHORT;

            Toast aviso= Toast.makeText(contexto,texto,dura);

            aviso.show();
            return false;
        } else if (Senha.equals("")) {
            Context contexto=getApplicationContext();

            String texto="Senha Vazia";

            int dura =Toast.LENGTH_SHORT;

            Toast aviso= Toast.makeText(contexto,texto,dura);

            aviso.show();


            return false;
        } else if (!Usuario.equals(USUARIO) || !Senha.equals(SENHA)) {
            Context contexto=getApplicationContext();

            String texto="Senha ou Usuário inválidos";

            int dura =Toast.LENGTH_SHORT;

            Toast aviso= Toast.makeText(contexto,texto,dura);

            aviso.show();
            return false;
        } else {
            Context contexto=getApplicationContext();

            String texto="Cadastro feito";

            int dura =Toast.LENGTH_SHORT;

            Toast aviso= Toast.makeText(contexto,texto,dura);

            aviso.show();

            return true;
        }
    }
}
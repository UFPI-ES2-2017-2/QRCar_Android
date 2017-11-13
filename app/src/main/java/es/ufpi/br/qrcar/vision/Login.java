package es.ufpi.br.qrcar.vision;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

import es.ufpi.br.qrcar.R;
import es.ufpi.br.qrcar.facade.Facade;

public class Login extends AppCompatActivity {
    private EditText user_input;
    private EditText password_input;
    private Button entrar_button;
    private static transient Facade facade;

    @Override
    protected void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_login);
        this.user_input = (EditText)findViewById(R.id.login_user_input);
        this.password_input = (EditText)findViewById(R.id.login_senha_input);
        this.entrar_button = (Button) findViewById(R.id.login_entrar_button);
        this.entrar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrar_onClick(view);
            }
        });
    }

    private void entrar_onClick(View view)
    {
        String user = this.user_input.getText().toString();
        String password = this.user_input.getText().toString();
        Intent intent = new Intent(this,Dashboard.class);
        intent.putExtra("user", user);
        intent.putExtra("password",password);
        facade = new Facade();
        intent.putExtra("Facade", (Serializable) facade);
        if(facade.searchUser(user, password) != null)
            startActivity(intent);
        else
            Toast.makeText(Login.this, "Incorrect email or password.",
                    Toast.LENGTH_LONG).show();
    }
}
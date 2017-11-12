package es.ufpi.br.qrcar.vision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import es.ufpi.br.qrcar.R;

/**
 * Class that represents a Login screen for the QRCar application
 */

public class Login extends AppCompatActivity {
    private EditText user_input;
    private EditText password_input;
    private Button entrar_button;

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
        startActivity(intent);
    }
}

package es.ufpi.br.qrcar.vision;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import es.ufpi.br.qrcar.R;

/**
 * Created by natasha on 11-11-2017.
 */

public class NovoCliente extends AppCompatActivity {
    private EditText name;
    private EditText cpf;
    private EditText tel;
    private EditText state;
    private EditText email;
    private EditText city;
    private EditText street;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_novo_cliente);

        this.name = (EditText)findViewById(R.id.novo_cliente_nomecliente_input);
        this.cpf = (EditText)findViewById(R.id.novo_cliente_CPF_input);
        this.tel = (EditText)findViewById(R.id.novo_cliente_telefone_input);
        this.state = (EditText)findViewById(R.id.novo_cliente_estado_input);
        this.email = (EditText)findViewById(R.id.novo_cliente_email_input);
        this.city = (EditText)findViewById(R.id.novo_cliente_cidade_input);
        this.street = (EditText)findViewById(R.id.novo_cliente_rua_input);
    }


}

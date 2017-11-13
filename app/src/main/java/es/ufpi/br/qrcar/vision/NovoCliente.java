package es.ufpi.br.qrcar.vision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import es.ufpi.br.qrcar.R;
import es.ufpi.br.qrcar.entity.Client;
import es.ufpi.br.qrcar.facade.Facade;

public class NovoCliente extends AppCompatActivity {
    private EditText name;
    private EditText cpf;
    private EditText tel;
    private EditText state;
    private EditText email;
    private EditText city;
    private EditText street;
    private Button add_button;
    private Facade facade;

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
        this.add_button = (Button) findViewById(R.id.novo_cliente_concluir_button);

        this.add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button_onClick(view);
            }
        });
        this.facade = (Facade) getIntent().getSerializableExtra("Facade");
    }

    private void add_button_onClick(View view) {
        Client c = new Client();

        c.setName(this.name.getText().toString());
        c.setAddress(this.street.getText().toString());
        c.setCpf(Integer.parseInt(this.cpf.getText().toString()));
        c.setEmail(this.email.getText().toString());

        int cID = (1);
        c.setId(cID);

        if(facade.insertClient(c)) {
            Intent intent = new Intent(this, Dashboard.class);
            facade = (Facade) getIntent().getSerializableExtra ("Facade");
            intent.putExtra("Facade", facade);
            startActivity(intent);
        }
    }
}
package es.ufpi.br.qrcar.vision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import es.ufpi.br.qrcar.R;
import es.ufpi.br.qrcar.entity.User;
import es.ufpi.br.qrcar.facade.Facade;

public class NovoFuncionario extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private EditText position;
    private EditText address;
    private EditText email;
    private EditText cpf;
    private EditText street;
    private Button add_button;
    private Facade facade;

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_novo_funcionario);

        this.name = (EditText) findViewById(R.id.novo_funcionario_nome_input);
        this.cpf = (EditText) findViewById(R.id.novo_funcionario_cpf_input);
        this.password = (EditText) findViewById(R.id.novo_funcionario_senha_input);
        this.position = (EditText) findViewById(R.id.novo_funcionario_posicao_input);
        this.email = (EditText) findViewById(R.id.novo_cliente_email_input);
        this.add_button = (Button) findViewById(R.id.novo_funcionario_concluir_button);

        this.add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button_onClick(view);
            }
        });
        this.facade = (Facade) getIntent().getSerializableExtra("Facade");
    }

    private void add_button_onClick(View view) {
        User c = new User();

        c.setName(this.name.getText().toString());
        c.setCpf(Integer.parseInt(this.cpf.getText().toString()));

        int cID = (1);
        c.setId(cID);

        if (facade.insertUser(c)) {
            Intent intent = new Intent(this, Dashboard.class);
            facade = (Facade) getIntent().getSerializableExtra("Facade");
            intent.putExtra("Facade", facade);
            startActivity(intent);
        }
    }
}
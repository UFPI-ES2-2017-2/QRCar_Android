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

public class NovoFuncionario extends AppCompatActivity{
    private EditText name;
    private EditText funcionario_cpf;
    private Button add_button;
    private Facade facade;

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_novo_funcionario);
        this.name = (EditText)findViewById(R.id.novo_funcionario_nome_input);
        this.funcionario_cpf = (EditText)findViewById(R.id.novo_funcionario_cpf_input);
        this.add_button = (Button) findViewById(R.id.novo_funcionario_concluir_button);
        this.add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button_onClick(view);
            }
        });
        facade = (Facade) getIntent().getSerializableExtra("Facade");
    }

    private void add_button_onClick(View view) {
        User u = new User();
        u.setCpf(Integer.parseInt(this.funcionario_cpf.getText().toString()));
        u.setName(this.name.getText().toString());
        if(facade.insertUser(u)) {
            Intent intent = new Intent(this, Dashboard.class);
            facade = (Facade) getIntent().getSerializableExtra ("Facade");
            intent.putExtra("Facade", facade);
            startActivity(intent);
        }
        /*

         */
    }
}
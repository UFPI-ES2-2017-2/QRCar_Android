package es.ufpi.br.qrcar.vision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.ufpi.br.qrcar.R;
import es.ufpi.br.qrcar.facade.Facade;

public class Dashboard extends AppCompatActivity {
    private Button clientes_button;
    private Button carros_button;
    private Button contratos_button;
    private Button funcionarios_button;
    private Button sobre_button;
    private Facade facade;

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_menu_principal);
        this.clientes_button = (Button)findViewById(R.id.clientes_button);
        this.carros_button = (Button)findViewById(R.id.carros_button);
        this.contratos_button = (Button)findViewById(R.id.contratos_button);
        this.funcionarios_button = (Button)findViewById(R.id.funcionarios_button);
        this.sobre_button = (Button)findViewById(R.id.sobre_button);
        this.clientes_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clientes_button_onclick(view);
            }
        });

        this.carros_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carros_button_onclick(view);
            }
        });

        this.contratos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contratos_button_onclick(view);
            }
        });

        this.funcionarios_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                funcionarios_button_onclick(view);
            }
        });

        this.sobre_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sobre_button_onclick(view);
            }
        });

        Toast.makeText(Dashboard.this, "Welcome!",
                Toast.LENGTH_LONG).show();
    }

    private void clientes_button_onclick(View view) {
        Intent intent = new Intent(this,ListarCliente.class);
        facade = (Facade) getIntent().getSerializableExtra ("Facade");
        intent.putExtra("Facade", facade);
        startActivity(intent);
    }

    private void carros_button_onclick(View view) {
        Intent intent = new Intent(this,ListarVeiculos.class);
        facade = (Facade) getIntent().getSerializableExtra ("Facade");
        intent.putExtra("Facade", facade);
        startActivity(intent);
    }

    private void contratos_button_onclick(View view) {
        Intent intent = new Intent(this,ListarContratos.class);
        facade = (Facade) getIntent().getSerializableExtra ("Facade");
        intent.putExtra("Facade", facade);
        startActivity(intent);
    }

    private void funcionarios_button_onclick(View view) {
        Intent intent = new Intent(this,NovoFuncionario.class);
        startActivity(intent);
    }

    private void sobre_button_onclick(View view) {
        Intent intent = new Intent(this,Sobre.class);
        startActivity(intent);
    }
}
package es.ufpi.br.qrcar.vision;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import es.ufpi.br.qrcar.R;
import es.ufpi.br.qrcar.entity.Contract;
import es.ufpi.br.qrcar.facade.Facade;

/**
 * Created by root on 12-11-2017.
 */

public class NovoContrato extends AppCompatActivity{
    private EditText start_date;
    private EditText end_date;
    private EditText price;
    private EditText client_cpf;
    private EditText plate_id;
    private Button criar;
    private Facade facade;
    @Override
    protected void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_novo_contrato);
        this.start_date = (EditText)findViewById(R.id.novo_contrato_start_date_input);
        this.end_date = (EditText)findViewById(R.id.novo_contrato_data_termino_input);
        this.price = (EditText)findViewById(R.id.novo_contrato_preco_input);
        this.client_cpf = (EditText)findViewById(R.id.novo_contrato_cpf_input);
        this.plate_id = (EditText)findViewById(R.id.novo_contrato_placa_input);
        this.criar = (Button)findViewById(R.id.novo_contrato_criar_button);
        facade = (Facade) getIntent().getSerializableExtra("Facade");
        this.criar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {}
        });
    }
}

package es.ufpi.br.qrcar.vision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;


import es.ufpi.br.qrcar.R;
import es.ufpi.br.qrcar.entity.Contract;
import es.ufpi.br.qrcar.facade.Facade;

public class NovoContrato extends AppCompatActivity{
    private EditText start_date;
    private EditText end_date;
    private EditText price;
    private EditText client_cpf;
    private EditText contract_id;
    private EditText plate_id;
    //private Button criar;
    private Button add_button;

    private Facade facade;

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_novo_contrato);
        this.start_date = (EditText)findViewById(R.id.novo_contrato_start_date_input);
        this.end_date = (EditText)findViewById(R.id.novo_contrato_data_termino_input);
        this.price = (EditText)findViewById(R.id.novo_contrato_preco_input);
        this.client_cpf = (EditText)findViewById(R.id.novo_contrato_cpf_input);
        this.plate_id = (EditText)findViewById(R.id.novo_contrato_placa_input);
//        this.criar = (Button)findViewById(R.id.novo_contrato_criar_button);
//        this.criar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                add_button_onClick(view);
//            }
//        });


        this.add_button = (Button) findViewById(R.id.novo_contrato_criar_button);
        this.add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button_onClick(view);
            }
        });
        facade = (Facade) getIntent().getSerializableExtra("Facade");
    }

    private void add_button_onClick(View view) {
        Contract cont = new Contract();

//        cont.setStart_date(DateFormat.parse(String));
//        cont.setEnd_data(Date);


//        SimpleDateFormat start_date = new SimpleDateFormat("YYYY-MM-DD");
//        cont.setStart_date(new Date(cont.getStart_date().getTime()));
//
//        SimpleDateFormat end_date = new SimpleDateFormat("YYYY-MM-DD");
//        cont.setEnd_date(new Date(cont.getEnd_date().getTime()));


        cont.setPrice(Float.parseFloat(this.price.getText().toString()));
        cont.setClient_cpf(Integer.parseInt(this.client_cpf.getText().toString()));
        cont.setContract_id(Integer.parseInt(this.contract_id.getText().toString()));
        //cont.setIs_available(true);

        int contratoID = (1);
        cont.setContract_id(contratoID);

        if(facade.insertContract(cont)) {
            Intent intent = new Intent(this, Dashboard.class);
            facade = (Facade) getIntent().getSerializableExtra ("Facade");
            intent.putExtra("Facade", facade);
            startActivity(intent);
        }
    }
}
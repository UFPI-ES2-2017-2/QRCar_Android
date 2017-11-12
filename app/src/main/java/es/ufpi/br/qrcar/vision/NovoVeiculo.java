package es.ufpi.br.qrcar.vision;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import es.ufpi.br.qrcar.R;

/**
 * Created by natasha on 11-11-2017.
 */

public class NovoVeiculo extends AppCompatActivity {
    private EditText model;
    private EditText manufacturer;
    private EditText plate_id;
    private EditText year;
    private EditText num_passengers;

    @Override
    protected void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_novo_carro);
        this.model = (EditText)findViewById(R.id.novo_carro_modelo_input);
        this.manufacturer = (EditText)findViewById(R.id.novo_carro_fabricante_input);
        this.plate_id = (EditText)findViewById(R.id.novo_carro_placa_input);
        this.year = (EditText)findViewById(R.id.novo_carro_ano_input);
        this.num_passengers = (EditText)findViewById(R.id.novo_carro_numero_passageiros_input);
    }

}

package es.ufpi.br.qrcar.vision;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.view.View;

import android.widget.ImageButton;
import es.ufpi.br.qrcar.R;
import es.ufpi.br.qrcar.entity.Vehicle;
import es.ufpi.br.qrcar.facade.Facade;

/**
 * Created by natasha on 11-11-2017.
 */

public class NovoVeiculo extends AppCompatActivity {
    private EditText model;
    private EditText manufacturer;
    private EditText plate_id;
    private EditText year;
    private EditText num_passengers;
    private ImageButton add_button;
    private Facade facade;

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
        this.add_button = (ImageButton)findViewById(R.id.novo_carro_cadastrar_button);
        this.add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button_onClick(view);
            }
        });
        this.facade = (Facade) getIntent().getSerializableExtra("facade");
    }

    private void add_button_onClick(View view)
    {
        Vehicle v = new Vehicle();

        v.setManufacturer(this.manufacturer);
        v.setModel(this.model);
        v.setNum_passengers(this.num_passengers);
        v.setPlate_id(this.plate_id);
        v.setYear(this.year);
        v.setIs_available(true);

        int carID = (facade.listVehicles().size() + 1);
        v.setCar_id(carID);

        facade.insertVehicle(v);

        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }

}

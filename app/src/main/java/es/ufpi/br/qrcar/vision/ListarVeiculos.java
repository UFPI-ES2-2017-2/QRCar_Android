package es.ufpi.br.qrcar.vision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;

import android.widget.ListView;
import android.R;

import es.ufpi.br.qrcar.entity.Vehicle;
import es.ufpi.br.qrcar.facade.Facade;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by natasha on 11-11-2017.
 */

public class ListarVeiculos extends AppCompatActivity {
    private ImageButton add_button;
    private ListView listView;
    private List<Vehicle> vehicles;
    private ArrayList<String> vehiclesModels ;
    private Facade facade;

    @Override
    protected void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_listar_carros);
        this.listView = (ListView)findViewById(R.layout.activity_carros_lista);
        this.add_button = (ImageButton)findViewById(R.id.listar_carros_add_button);
        this.add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button_onClick(view);
            }
        });
        this.vehicles = new LinkedList<Vehicle>();
        this.facade = (Facade) getIntent().getSerializableExtra("Facade");
        vehicles = facade.listVehicles();
        this.vehiclesModels = new ArrayList<String>();

        for(Vehicle v : this.vehicles)
        {
            vehiclesModels.add(v.getModel())
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search,menu);
        return true;
    }

    private void add_button_onClick(View view)
    {
        Intent intent = new Intent(this,NovoVeiculo.class);
        startActivity(intent);
    }

}

package es.ufpi.br.qrcar.vision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import es.ufpi.br.qrcar.R;
import es.ufpi.br.qrcar.entity.Contract;
import es.ufpi.br.qrcar.facade.Facade;

public class ListarContratos  extends AppCompatActivity {

    private ImageButton add_button_contratos;
    private ListView listView;
    private List<Contract> contratos;
    private ArrayList<String> ContratoNames;
    private ArrayList<String> ContractsIds;
    private Facade facade;
    private TextView aviso;
    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_listar_contratos);
        this.listView = (ListView)findViewById(R.id.listar_contratos_lista);
        this.add_button_contratos = (ImageButton)findViewById(R.id.listar_contratos_add_button);
        this.aviso = (TextView) findViewById(R.id.aviso);
        this.add_button_contratos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button_onClick(view);
            }
        });
        this.contratos = new LinkedList<Contract>();
        facade = (Facade) getIntent().getSerializableExtra("Facade");
        this.contratos = facade.listContracts();
        this.ContractsIds = new ArrayList<String>();
        String item = "";
        for(Contract c: this.contratos) {
            ContractsIds.add(Integer.toString(c.getContract_id()));
        }

        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ContractsIds);
        listView.setAdapter(listAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search,menu);
        return true;
    }

    private void add_button_onClick(View view) {
        Intent intent = new Intent(this, NovoContrato.class);
        startActivity(intent);
    }
}
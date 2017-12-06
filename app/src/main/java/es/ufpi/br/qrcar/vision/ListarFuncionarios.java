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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import es.ufpi.br.qrcar.R;
import es.ufpi.br.qrcar.entity.User;
import es.ufpi.br.qrcar.facade.Facade;

/**
 * Created by Railson on 15/11/2017.
 */

public class ListarFuncionarios extends AppCompatActivity {
    private ImageButton add_button;
    private ListView listView;
    private List<User> users;
    private ArrayList<String> usersNames;
    private Facade facade;

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_listar_funcionarios);
        this.listView = (ListView)findViewById(R.id.listar_funcionarios_lista);
        this.add_button = (ImageButton)findViewById(R.id.listar_funcionarios_add_button);
        this.add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button_onClick(view);
            }
        });
        this.users = new LinkedList<User>();
        facade = (Facade) getIntent().getSerializableExtra("Facade");
        users = facade.listUsers();
        usersNames = new ArrayList<String>();
        for (User c : users){
            usersNames.add(c.getName());
        }

        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, usersNames);
        listView.setAdapter(listAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search,menu);
        return true;
    }

    private void add_button_onClick(View view) {
        Intent intent = new Intent(this, NovoFuncionario.class);
        facade = (Facade) getIntent().getSerializableExtra ("Facade");
        intent.putExtra("Facade", facade);
        startActivity(intent);
    }
}


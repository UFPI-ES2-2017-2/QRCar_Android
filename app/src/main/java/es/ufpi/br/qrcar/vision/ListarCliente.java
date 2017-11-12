package es.ufpi.br.qrcar.vision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;

import es.ufpi.br.qrcar.R;

/**
 * Created by root on 12-11-2017.
 */

public class ListarCliente extends AppCompatActivity {
    private ImageButton add_button;

    @Override
    protected void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_listar_clientes);
        this.add_button = (ImageButton)findViewById(R.id.listar_clientes_add_button);
        this.add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_button_onClick(view);
            }
        });
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
        Intent intent = new Intent(this, NovoCliente.class);
        startActivity(intent);
    }
}

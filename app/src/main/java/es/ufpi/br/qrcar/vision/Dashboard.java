package es.ufpi.br.qrcar.vision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.Result;

import es.ufpi.br.qrcar.R;
import es.ufpi.br.qrcar.facade.Facade;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class Dashboard extends AppCompatActivity implements ZXingScannerView.ResultHandler{
    private Button clientes_button;
    private Button carros_button;
    private Button contratos_button;
    private Button funcionarios_button;
    private Button qr_code_button;
    private Button sobre_button;
    private Facade facade;
    private ZXingScannerView mScannerView;

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_menu_principal);
        this.clientes_button = (Button)findViewById(R.id.clientes_button);
        this.carros_button = (Button)findViewById(R.id.carros_button);
        this.contratos_button = (Button)findViewById(R.id.contratos_button);
        this.funcionarios_button = (Button)findViewById(R.id.funcionarios_button);
        this.qr_code_button = (Button)findViewById(R.id.qr_code_button);
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
        this.qr_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qr_code_button_onclick(view);
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
        Intent intent = new Intent(this, NovoContrato.class);
        facade = (Facade) getIntent().getSerializableExtra ("Facade");
        intent.putExtra("Facade", facade);
        startActivity(intent);
    }
    private void qr_code_button_onclick(View view) {
        mScannerView = new ZXingScannerView(this);
        setContentView(mScannerView);
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }

    private void sobre_button_onclick(View view) {
        Intent intent = new Intent(this,Sobre.class);
        startActivity(intent);
    }

    @Override
    public void handleResult(Result result) {
        Log.v("handlerResult", result.getText());
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Scan");
        builder.setMessage(result.getText());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
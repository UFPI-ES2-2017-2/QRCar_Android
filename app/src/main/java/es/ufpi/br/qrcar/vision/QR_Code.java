package es.ufpi.br.qrcar.vision;

/**
 * Created by natas on 20/11/2017.
 */

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.zxing.Result;
import me.dm7.barcodescanner.zxing.ZXingScannerView;


public class QR_Code extends Activity implements ZXingScannerView.ResultHandler {

    private ZXingScannerView mScannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mScannerView = new ZXingScannerView(this);
        setContentView(mScannerView);
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mScannerView.stopCamera();
    }

    @Override
    public void handleResult(Result result) {
                 //Do anything with result here :D
                         Log.w("handleResult", result.getText());
                 AlertDialog.Builder builder = new AlertDialog.Builder(this);
                 builder.setTitle("Scan result");
                 builder.setMessage(result.getText());
                 AlertDialog alertDialog = builder.create();
                 alertDialog.show();
                        //Resume scanning
                        mScannerView.resumeCameraPreview(this);
                        // put the String to pass back into an Intent and close this activity
                        Intent intent = new Intent();
                intent.putExtra("carKey", result.getText());
                    setResult(RESULT_OK, intent);
                finish();
    }

}
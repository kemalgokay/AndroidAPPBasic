package com.example.kemal.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.R;
import com.example.kemal.splashscreen.OcrCaptureActivity;
import com.google.android.gms.common.api.CommonStatusCodes;
import android.R;

public class odevKontrol extends Activity implements View.OnClickListener {

    
    private CompoundButton autoFocus;
    private CompoundButton useFlash;
    private TextView statusMessage;
    private TextView textValue;


    private static final int RC_OCR_CAPTURE = 9003;
    private static final String TAG = "odevKontrol";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odev_kontrol);

        statusMessage = (TextView)findViewById(R.id.status_message);
        textValue = (TextView)findViewById(R.id.text_value);

        autoFocus = (CompoundButton) findViewById(R.id.auto_focus);
        useFlash = (CompoundButton) findViewById(R.id.use_flash);

        findViewById(R.id.read).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.read) {
            // launch Ocr capture activity.
            Intent intent = new Intent(odevKontrol.this, OcrCaptureActivity.class);
            intent.putExtra(OcrCaptureActivity.AutoFocus, autoFocus.isChecked());
            intent.putExtra(OcrCaptureActivity.UseFlash, useFlash.isChecked());

            startActivityForResult(intent, RC_OCR_CAPTURE);
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == RC_OCR_CAPTURE) {
            if (resultCode == CommonStatusCodes.SUCCESS) {
                if (data != null) {
                    String text = data.getStringExtra(OcrCaptureActivity.TextBlockObject);
                    statusMessage.setText(R.string.ocr_success);
                    textValue.setText(text);
                    //Log.d(TAG, "Text read: " + text);
                    Toast.makeText(getApplicationContext(),"text okundu",Toast.LENGTH_LONG).show();
                } else {
                    statusMessage.setText(R.string.ocr_failure);
                   // Log.d(TAG, "No Text captured, intent data is null");
                    Toast.makeText(getApplicationContext(),"text okunamadı intent data null",Toast.LENGTH_LONG).show();
                }
            } else {
                statusMessage.setText(String.format(getString(R.string.ocr_error),
                        CommonStatusCodes.getStatusCodeString(resultCode)));
            }
        }
        else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}

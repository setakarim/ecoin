package dev.setakarim.ecoin.Menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import dev.setakarim.ecoin.Loop.NFCActivity;
import dev.setakarim.ecoin.Loop.QRCodeActivity;
import dev.setakarim.ecoin.Loop.QRCodeReaderActivity;
import dev.setakarim.ecoin.R;

public class MyIDActivity extends AppCompatActivity {

    private ImageView img_qrcode, img_nfc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_id);

        img_qrcode = findViewById(R.id.img_qrcode);
        img_nfc = findViewById(R.id.img_nfc);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TextView textView = findViewById(R.id.toolbar_title);

        textView.setText("USER ID");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        img_qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyIDActivity.this, QRCodeActivity.class);
                startActivity(intent);
            }
        });

        img_nfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyIDActivity.this, NFCActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}

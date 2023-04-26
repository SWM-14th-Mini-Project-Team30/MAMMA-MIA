package org.swm.mammamia.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

import org.swm.mammamia.R;
import org.swm.mammamia.ui.home.WritingItem;

public class detailActivity extends AppCompatActivity {

    TextView titleTv_text;
    String titleTv;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_item);
        Intent intent = getIntent();
        WritingItem items = getIntent().getParcelableExtra("item");



        backButton = findViewById(R.id.back_detail);
        titleTv_text = findViewById(R.id.textName);

        titleTv = intent.getStringExtra("title");

        titleTv_text.setText(titleTv);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}







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
    TextView content_text;
    ImageView detail_pic_img;

    String titleTv;
    String content;
    int detail_pic;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_item);
        Intent intent = getIntent();
        WritingItem items = getIntent().getParcelableExtra("item");



        backButton = findViewById(R.id.back_detail);
        titleTv_text = findViewById(R.id.textName);
        content_text = findViewById(R.id.textCost);
        detail_pic_img = findViewById(R.id.baby_pic);

        titleTv = intent.getStringExtra("title");
        content = intent.getStringExtra("content");
        detail_pic = intent.getExtras().getInt("detail_pic");

        titleTv_text.setText(titleTv);
        content_text.setText(content);
        detail_pic_img.setImageResource(detail_pic);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}







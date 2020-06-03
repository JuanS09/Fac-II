package com.example.rview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView mTitleView, mDescriptionView,mProfesorview,mDiaview,mHoraview,mFechaentview;
    ImageView mImageView;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ActionBar actionBar=getSupportActionBar();

        mTitleView=findViewById(R.id.titleview);
        mDescriptionView=findViewById(R.id.descripcionview);
        mImageView=findViewById(R.id.imageview);
        mProfesorview=findViewById(R.id.profesorview);
        mDiaview=findViewById(R.id.diaview);
        mHoraview=findViewById(R.id.horaview);
        mFechaentview=findViewById(R.id.fechaentregaview);

        Intent intent=getIntent();
        String mTitle=intent.getStringExtra("iTitle");
        String mDes=intent.getStringExtra("iDesc");
        String mPro=intent.getStringExtra("iProfesor");
        String mDi=intent.getStringExtra("iDia");
        String mHor=intent.getStringExtra("iHora");
        String mFecha=intent.getStringExtra("iFechentrega");


        byte[] mBytes=getIntent().getByteArrayExtra("iImage");
        Bitmap bitmap= BitmapFactory.decodeByteArray(mBytes,0,mBytes.length);

        actionBar.setTitle(mTitle);
        mTitleView.setText(mTitle);
        mDescriptionView.setText(mDes);
        mImageView.setImageBitmap(bitmap);
        mProfesorview.setText(mPro);
        mDiaview.setText(mDi);
        mHoraview.setText(mHor);
        mFechaentview.setText(mFecha);


    }
}

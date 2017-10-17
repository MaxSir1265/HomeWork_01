package com.mak.homework_01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSet(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.button13:
                intent = new Intent(Main.this, AppActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonCall:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"));
                startActivity(intent);
                break;
            case R.id.buttonSend:
                intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", "0675655490", null));
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}

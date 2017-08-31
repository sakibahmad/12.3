package com.example.aanammalik.a123;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button Btone=(Button)findViewById(R.id.Btone);
        Btone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("DELETE")
                        .setMessage("Do you want to delete the particular file")
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                Toast.makeText(getApplicationContext(), "YES", Toast.LENGTH_LONG).show();
                                finish();

                            }
                        });


                alertDialog .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "NO", Toast.LENGTH_LONG).show();

                        dialog.cancel();//destroy dialog UI

                    }
                })
                        .setIcon(R.drawable.delete)
                        .show();

            }
        });
    }
}

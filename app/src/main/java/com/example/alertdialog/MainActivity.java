package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void abrirDialog(View v) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle("Título da dialog");
        dialog.setMessage("Mensagem da Dialog");

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "executar ação do sim bnt",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "executar ação do nao bnt",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
        dialog.create();
        dialog.show();
    }

}
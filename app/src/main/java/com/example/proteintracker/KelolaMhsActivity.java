package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class KelolaMhsActivity extends AppCompatActivity {

    String[] mhs = {"Riyan Mozes Sahetapy","Brian Eldrin Sombuk", "Elias Aru F. Langer", "Aditya Halimawan",
            "Immanuel Harold Maga", "Eben Haezer Gultom", "Yosua Erick Gunawan", "Nana Eka Wulandari", "Eva Kristina", "Jonathan Prajna Marga Parama",
            "Emma Norren Cahya Putri", "Michael Gerardi Adji", "Cynthia Kumalasari", "Nikolaus Aryawan Ravato Wijaya", "Daniel Surya Nugraha",
            "Lionrico Sanjay Exauvida Jeipy", "Jonathan Alvin Ananto", "Monica Carista", "Didimus Candra Gased", "Valeriana Tanesha Indra S",
            "Ivan Bernov", "Friska F. Nainggolan", "Grace Hutabarat", "Beni Mulia Tabarus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelola_mhs);

        ListView lv = findViewById(R.id.lvMhs);

        lv.setAdapter(new ArrayAdapter<String>(KelolaMhsActivity.this, android.R.layout.simple_list_item_1, mhs));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) { //int i untuk tau urutan item
                Toast.makeText(KelolaMhsActivity.this, "Anda memilih " + mhs[i], Toast.LENGTH_SHORT).show(); //length short durasi krg lbh 2 dtk
                //javascript:Alert, C#:MessageBox, JavaAndroid: Toast
            }
        });

        Button addMhsBtn = (Button)findViewById(R.id.btnTambahMhs);
        addMhsBtn.setOnClickListener(addMhsButtonListener);

        Button editBtn = (Button)findViewById(R.id.btnUpdateMhs);
        editBtn.setOnClickListener(editMhsButtonListener);
    }


    private View.OnClickListener addMhsButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(KelolaMhsActivity.this,MahasiswaAddActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener editMhsButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(KelolaMhsActivity.this,MahasiswaEditActivity.class);
            startActivity(intent);
        }
    };
}

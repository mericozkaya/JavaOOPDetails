package com.mericozkaya.javaoopdetails;



import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Kedi kedi =new Kedi("Kedi1","Sari","Kahverengi");
        Kedi kedi2=new Kedi();
        kedi2.isim ="Kedi 2";
        System.out.println(kedi2.isim);
        //System.out.println(turIsmi);
        System.out.println(Kedi.turIsmi);

        kedi.konusKedi();
        Kedi.konusKediStatic();

        Kopek kopek =new Kopek();
        Kopek kopek2=new Kopek("Barley","Sari","Sari");

        System.out.println(kopek2.tuyRengi);
        Hayvan hayvan=new Hayvan();



    }

    public void test(){

    }


}
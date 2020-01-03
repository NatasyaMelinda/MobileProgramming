package com.natasya.melinda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMylist(){

     ArrayList<Model> models = new ArrayList<>();

     Model model = new Model();
     model.setTitle("Fiesta Nugget");
     model.setDescription("Terbuat dari daging dada ayam cincang");
     model.setImg(R.drawable.fiesta);
     models.add(model);

     model = new Model();
     model.setTitle("Champ Nugget");
     model.setDescription("Nugget ayam dari olahan daging ayam pilihan");
     model.setImg(R.drawable.champ);
     models.add(model);

     model = new Model();
     model.setTitle("Tempura Minaku");
     model.setDescription("Produk Olahan seafood dari MINAKU dengan pilihan seafood yang super");
     model.setImg(R.drawable.tempura);
     models.add(model);

     model = new Model();
     model.setTitle("Sosis Besto");
     model.setDescription("Sosis ini cocok untuk di bakar, tinggal di oles saus barbeque atau lada");
     model.setImg(R.drawable.besto);
     models.add(model);

     model = new Model();
     model.setTitle("Sosis Kanzler");
     model.setDescription("Jenis sosis terfavorit di Jerman. Dikenal karena kaya akan tekstur. Bumbu rempah dan potongan daging premium lebih terlihat ");
     model.setImg(R.drawable.kanzler);
     models.add(model);

     model = new Model();
     model.setTitle("Fiesta Chessy Lover");
     model.setDescription("Terbuat dari daging ayam cincang. Berbentuk HEART / HATI. Bagian dalam berisi keju dan smoked chicken breast yang dibalut dengan tepung roti.");
     model.setImg(R.drawable.cheesy);
     models.add(model);

     model = new Model();
     model.setTitle("Chicken Karage Fiesta");
     model.setDescription("Terbuat dari Daging Paha Ayam Yang diola");
     model.setImg(R.drawable.karage);
     models.add(model);

     model = new Model();
     model.setTitle("Kentang Frozen Land");
     model.setDescription("FROZEN LAND batter coated kentang keju 500gr");
     model.setImg(R.drawable.kentang);
     models.add(model);
     return models;
    }
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profil:
                Intent activity1 = new Intent(this, Toolbar.class);
                startActivity(activity1);
                return true;
            default:
                return true;
        }
    }
}

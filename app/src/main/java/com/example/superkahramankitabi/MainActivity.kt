package com.example.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //Veri Hazırlıgı
        var superKahramanIsimleri=ArrayList<String>()
        superKahramanIsimleri.add("batman")
        superKahramanIsimleri.add("superman")
        superKahramanIsimleri.add("iron man")
        superKahramanIsimleri.add("aquaman")
        superKahramanIsimleri.add("spiderman")

        //Verimsiz tanımlamalar
       /* val batmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val ironmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val aquamanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val spidermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
        var superKahramanGorselleri=ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(ironmanBitmap)
        superKahramanGorselleri.add(aquamanBitmap)
        superKahramanGorselleri.add(spidermanBitmap)
        */
        //Verimli Tanımlamalar
        val batmanDrawableId=R.drawable.batman
        val supermanDrawableId=R.drawable.superman
        val ironmanDrawableId=R.drawable.ironman
        val aquamanDrawableId=R.drawable.aquaman
        val spidermanDrawableId=R.drawable.spiderman
        val superKahramanDrawbeListesi=ArrayList<Int>()
        superKahramanDrawbeListesi.add(batmanDrawableId)
        superKahramanDrawbeListesi.add(supermanDrawableId)
        superKahramanDrawbeListesi.add(ironmanDrawableId)
        superKahramanDrawbeListesi.add(aquamanDrawableId)
        superKahramanDrawbeListesi.add(spidermanDrawableId)


       //adapter
        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager


        val adapter=RecyclerAdapter(superKahramanIsimleri,superKahramanDrawbeListesi)
           recyclerView.adapter=adapter
    }
}
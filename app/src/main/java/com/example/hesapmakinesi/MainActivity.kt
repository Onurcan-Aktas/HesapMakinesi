package com.example.hesapmakinesi

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hesapmakinesi.databinding.ActivityMainBinding
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    var birinciGirdi:Double?=null
    var ikinciGirdi:Double?=null
    var sonuc:Double?=null
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }





        binding.toplaButonu.setOnClickListener {
            topla()
        }

        binding.cikarButon.setOnClickListener {
            cikar()
        }

        binding.bolButon.setOnClickListener {
            bol()
        }

        binding.carpButon.setOnClickListener {
            carp()
        }


    }


    fun topla(){
        val birinciGirdi=binding.sayiGir1.text.toString().toDoubleOrNull()
        val ikinciGirdi=binding.sayiGir2.text.toString().toDoubleOrNull()

        if (birinciGirdi!=null&&ikinciGirdi!=null){
            sonuc=birinciGirdi!!+ikinciGirdi!!
            binding.sonucGoster.setText("İşlem Sonucu:${sonuc}")
        }else{
            binding.sonucGoster.setText("İşlem yapmak istediğiniz sayıları giriniz!")
        }

    }

    fun cikar(){
        val birinciGirdi=binding.sayiGir1.text.toString().toDoubleOrNull()
        val ikinciGirdi=binding.sayiGir2.text.toString().toDoubleOrNull()

        if (birinciGirdi!=null&&ikinciGirdi!=null){
            sonuc=birinciGirdi!!-ikinciGirdi!!
            binding.sonucGoster.setText("İşlem Sonucu:${sonuc}")
        }else{
            binding.sonucGoster.setText("İşlem yapmak istediğiniz sayıları giriniz!")
        }


    }

    fun bol(){
        val birinciGirdi=binding.sayiGir1.text.toString().toDoubleOrNull()
        val ikinciGirdi=binding.sayiGir2.text.toString().toDoubleOrNull()

        if (birinciGirdi!=null&&ikinciGirdi!=null){
            sonuc=birinciGirdi!!/ikinciGirdi!!
            binding.sonucGoster.setText("İşlem Sonucu:${sonuc}")
        }else{
            binding.sonucGoster.setText("İşlem yapmak istediğiniz sayıları giriniz!")
        }


    }
    fun carp(){
        val birinciGirdi=binding.sayiGir1.text.toString().toDoubleOrNull()
        val ikinciGirdi=binding.sayiGir2.text.toString().toDoubleOrNull()

        if (birinciGirdi!=null&&ikinciGirdi!=null){
            sonuc=birinciGirdi!!*ikinciGirdi!!
            binding.sonucGoster.setText("İşlem Sonucu:${sonuc}")
        }else{
            binding.sonucGoster.setText("İşlem yapmak istediğiniz sayıları giriniz!")
        }


    }


}
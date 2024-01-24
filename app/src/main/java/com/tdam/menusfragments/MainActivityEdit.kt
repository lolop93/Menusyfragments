package com.tdam.menusfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivityEdit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_edit)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_edit, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == R.id.action_save){
            //Aqui haremos lo que queramos hacer
            if(item.itemId == R.id.action_save){
                //Aqui haremos lo que queramos hacer

                //luego podemos finalizar la actividad actual y volver a la anterior
                finish() //se destruye
            }

        }

        return super.onOptionsItemSelected(item)
    }
}
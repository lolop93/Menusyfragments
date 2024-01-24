package com.tdam.menusfragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webPage = Uri.parse("https://www.udemy.com/user/alain-nicolas-tello/")
        val intent = Intent(Intent.ACTION_VIEW, webPage)

        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == R.id.action_edit){
            //Aqui haremos lo que queramos hacer en nuestra accion o app

            //en este caso iniciamos la de editar
            startActivity(Intent(this, MainActivityEdit::class.java))
            
        }

        return super.onOptionsItemSelected(item)
    }

}
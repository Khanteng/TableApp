package com.example.tableapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.annotation.NavigationRes
import androidx.annotation.StringRes
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var drawerLayout: DrawerLayout
    lateinit var toolbarLayout: Toolbar
    lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        init()

    }
    private fun initViews(){
        drawerLayout = findViewById(R.id.drawerLayout)
        toolbarLayout = findViewById(R.id.toolbar)
        navView = findViewById(R.id.navView)
    }

    private fun init(){
        val toggle = ActionBarDrawerToggle(this,drawerLayout,toolbarLayout,
            R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        when(item.itemId){

            R.id.id_my_ads -> {
                Toast.makeText(this,"qwdqwdwqd",Toast.LENGTH_LONG)
            }
            R.id.id_car -> {

            }
            R.id.id_pc -> {

            }
            R.id.id_smart -> {

            }
            R.id.id_dm -> {

            }
            R.id.ac_sign_up -> {

            }
            R.id.ac_sign_in -> {

            }
            R.id.ac_sign_out -> {

            }



        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
package com.nexx.nexxassistant.nexxauthenticator.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.nexx.nexxassistant.nexxauthenticator.R

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController //get the navController for global configs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController) //this puts the back button and the fragment tag
    }

    //override the method to do the functionality of the back button.
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController,null)
    }
}

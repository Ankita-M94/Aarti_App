package god.arti.app.activity

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import god.arti.app.R
import god.arti.app.databinding.ActivityHomeBinding
import god.arti.app.toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener {
    lateinit var activityHomeBinding:ActivityHomeBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityHomeBinding=DataBindingUtil.setContentView(this,R.layout.activity_home)
        setSupportActionBar(toolbar)
        navController = Navigation.findNavController(this, R.id.fragment_home)
        setupDrawerLayout()
        toolbar.setTitle("The Aarti App")
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(
            navController,
            drawer_layout)
    }

    private fun setupDrawerLayout() {
        NavigationUI.setupWithNavController(nav_view,navController)
        NavigationUI.setupActionBarWithNavController(this, navController,drawer_layout)
        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {

       when(menuItem.itemId){

            R.id.aboutUsScreen ->{
                toast("aboutUsScreen clicked")
            }

           R.id.recomendationScreen ->{
               toast("recomendationScreen clicked")
           }

           R.id.businessScreen ->{
               toast("businessScreen clicked")
           }

           R.id.rateUsScreen ->{
               toast("rateUsScreen clicked")
           }
       }

        menuItem.setChecked(true);
        drawer_layout.closeDrawer(GravityCompat.START);
        return true;
    }
}

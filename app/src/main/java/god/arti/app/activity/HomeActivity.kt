package god.arti.app.activity

import android.R.id.message
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView
import com.google.android.play.core.review.ReviewManagerFactory
import god.arti.app.R
import god.arti.app.databinding.ActivityHomeBinding
import god.arti.app.openUrl
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
        setStatusBarColor()
        toolbar.setTitle("The Aarti App")



    }

    private fun setStatusBarColor() {
        val window: Window = this.getWindow()
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.colorPrimary))
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
                openUrl(this,"http://godinc.in/")
//                toast("aboutUsScreen clicked")
            }

           R.id.recomendationScreen ->{
               val intent = Intent(
                   Intent.ACTION_SENDTO, Uri.fromParts(
                       "mailto", "godinc2017@gmail.com", null
                   )
               )
               intent.putExtra(Intent.EXTRA_SUBJECT, "God Inc Ads Work")
               intent.putExtra(Intent.EXTRA_TEXT, message)
               startActivity(Intent.createChooser(intent, "Choose an Email client :"))
           }

           R.id.businessScreen ->{
               openUrl(this,"http://businessnetworks.in/")

           }

           R.id.rateUsScreen ->{

               inAppReview()

              /* val manager = ReviewManagerFactory.create(this)
               val request = manager.requestReviewFlow()
               request.addOnCompleteListener { request ->
                   if (request.isSuccessful) {
                       // We got the ReviewInfo object
                       val reviewInfo = request.result

                       val flow = manager.launchReviewFlow(this, reviewInfo)
                       flow.addOnCompleteListener { _ ->
                           // The flow has finished. The API does not indicate whether the user
                           // reviewed or not, or even whether the review dialog was shown. Thus, no
                           // matter the result, we continue our app flow.
                       }
                   } else {
                       // There was some problem, continue regardless of the result.
                   }
               }*/

           }
       }
        menuItem.setChecked(true);
        drawer_layout.closeDrawer(GravityCompat.START);
        return true;
    }


    fun inAppReview() {
        val reviewManager = ReviewManagerFactory.create(this)
        val requestReviewFlow = reviewManager.requestReviewFlow()
        requestReviewFlow.addOnCompleteListener { request ->
            if (request.isSuccessful) {
                // We got the ReviewInfo object
                val reviewInfo = request.result
                val flow = reviewManager.launchReviewFlow(this, reviewInfo)
                flow.addOnCompleteListener {
                    // The flow has finished. The API does not indicate whether the user
                    // reviewed or not, or even whether the review dialog was shown. Thus, no
                    // matter the result, we continue our app flow.
                }
            } else {
                Log.d("Error: ", request.exception.toString())
                // There was some problem, continue regardless of the result.
            }
        }
    }


}

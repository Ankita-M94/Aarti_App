package god.arti.app.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import god.arti.app.R
import god.arti.app.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var activityHomeBinding: ActivityHomeBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityHomeBinding=DataBindingUtil.setContentView(this,R.layout.activity_home)
        navController = Navigation.findNavController(this, R.id.fragment_home)

    }
}
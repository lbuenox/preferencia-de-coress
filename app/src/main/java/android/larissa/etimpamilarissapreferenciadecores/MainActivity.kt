package android.larissa.etimpamilarissapreferenciadecores

import android.app.Activity
import android.content.SharedPreferences
import android.graphics.Color
import android.larissa.etimpamilarissapreferenciadecores.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()
        window.statusBarColor = Color.WHITE
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)




        }

    }
}


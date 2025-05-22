package android.larissa.etimpamilarissapreferenciadecores

import android.app.Activity
import android.content.SharedPreferences
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var preferencias :SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)


        setContentView(binding.root)
        var cor =""
        binding.btnCor1.setOnClick1stener{
            binding.
        }
    }
}
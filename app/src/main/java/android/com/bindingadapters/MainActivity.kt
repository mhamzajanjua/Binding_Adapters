package android.com.bindingadapters

import android.com.bindingadapters.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val postObj = Post("https://muhammadhamzajanjua.000webhostapp.com/images/hj1.png","Muhammad Hamza","+92-3495423302")
        binding.post = postObj
    }
}
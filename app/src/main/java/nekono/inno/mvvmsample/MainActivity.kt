package nekono.inno.mvvmsample

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import nekono.inno.mvvmsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.setLifecycleOwner(this)


        binding.model = viewModel
    }
}


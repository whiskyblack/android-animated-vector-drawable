package inlight.pro.animationvectordrawable

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import inlight.pro.animationvectordrawable.databinding.ActivityMainBinding
import kotlinx.coroutines.NonCancellable.start

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var reverse = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnChangeImage.setOnClickListener {
            it.isEnabled = false
            if (!reverse) binding.avdIcon.setImageResource(R.drawable.avd_music)
            else binding.avdIcon.setImageResource(R.drawable.avd_music_reverse)

            val drawable = binding.avdIcon.drawable as AnimatedVectorDrawable
            drawable.start()
            reverse = !reverse
            Handler(Looper.getMainLooper()).postDelayed({
                it.isEnabled = true
            }, 1000)
        }
    }
}
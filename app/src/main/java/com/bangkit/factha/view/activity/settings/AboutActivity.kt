package com.bangkit.factha.view.activity.settings

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.bangkit.factha.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        binding.ivLinkedin1.setOnClickListener { goToUrl("https://www.linkedin.com/in/mhmddzaka/") }
        binding.ivLinkedin2.setOnClickListener { goToUrl("https://www.linkedin.com/in/mohammad-izamul-fikri-fahmi/") }
        binding.ivLinkedin3.setOnClickListener { goToUrl("https://www.linkedin.com/in/fachrizala/") }
        binding.ivLinkedin4.setOnClickListener { goToUrl("https://www.linkedin.com/in/aisya-oxzanna-pitaloka/") }
        binding.ivLinkedin5.setOnClickListener { goToUrl("https://www.linkedin.com/in/sabila-nadia-islamia-027095220/") }
        binding.ivLinkedin6.setOnClickListener { goToUrl("https://www.linkedin.com/in/maretaaliana/") }
        binding.ivLinkedin7.setOnClickListener { goToUrl("https://www.linkedin.com/in/marchel-yusuf-rumlawang-arpipi/") }

        binding.ivGithub1.setOnClickListener { goToUrl("https://github.com/dzkmrn/") }
        binding.ivGithub2.setOnClickListener { goToUrl("https://github.com/zenosance/") }
        binding.ivGithub3.setOnClickListener { goToUrl("https://github.com/toingg/") }
        binding.ivGithub4.setOnClickListener { goToUrl("https://github.com/aisyaoxzanna/") }
        binding.ivGithub5.setOnClickListener { goToUrl("https://github.com/SabilaNadia02/") }
        binding.ivGithub6.setOnClickListener { goToUrl("https://github.com/Maretaaliana") }
        binding.ivGithub7.setOnClickListener { goToUrl("https://github.com/ysfrum/") }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }

    private fun goToUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
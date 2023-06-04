package com.mobile.livepresensiguru.views.forgotpass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.mobile.livepresensiguru.R
import com.mobile.livepresensiguru.databinding.ActivityForgotPasswordBinding
import com.orhanobut.hawk.Hawk.init

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)

        setContentView(binding.root)

        init()
    }
    private fun init(){
        setSupportActionBar(binding.tbForgotPassword)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
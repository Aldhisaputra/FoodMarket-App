package com.example.foodmarket.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodmarket.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }
}
//override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//
//        btnSignup.setOnClickListener {
//            val signup = Intent(activity, AuthActivity::class.java)
//            signup.putExtra("page_request", 2)
//            startActivity(signup)
//        }
//    }


// val pageRequest = intent.getIntExtra("page_request", 0)
//        if (pageRequest == 2) {
//            val navOptions = NavOptions.Builder()
//                .setPopUpTo(R.id.fragmentSignIn, true)
//                .build()
//
//            Navigation.findNavController(findViewById(R.id.authHostFragment))
//                .navigate(R.id.action_signup, null,navOptions)
//        }
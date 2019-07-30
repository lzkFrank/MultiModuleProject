package com.be.www.multimodelproject

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.frank.www.base_library.LibActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text:String= tv_main.text as String
        tv_main.text=text+com.frank.www.base_library.DateUtils.getCurrentTime()
        tv_main.setOnClickListener {
            startActivity(Intent(this,LibActivity::class.java))
        }
    }
}

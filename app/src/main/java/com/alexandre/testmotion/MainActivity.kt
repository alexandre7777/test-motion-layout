package com.alexandre.testmotion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main_activity.*
import android.content.Intent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        toCoordinator.setOnClickListener {
            val intent = Intent(this, CoordinatorActivity::class.java)
            startActivity(intent)
        }
    }
}

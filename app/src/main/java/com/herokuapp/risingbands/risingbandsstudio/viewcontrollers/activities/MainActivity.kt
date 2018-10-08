package com.herokuapp.risingbands.risingbandsstudio.viewcontrollers.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.herokuapp.risingbands.risingbandsstudio.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton.setOnClickListener{

            //TODO NavigationActivity
        }
    }
}

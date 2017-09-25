package com.slack.jeanpokou.mdcodelab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(tabs) {
            addTab(tabs.newTab().setText("Tab 1"))
            addTab(tabs.newTab().setText("Tab 2"))
            addTab(tabs.newTab().setText("Tab 3"))
        }
    }
}

package com.ericho.loadingdrawableexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        button.text = "redirect to 1."
        button.setOnClickListener({
            startActivity<SampleLoadAct>()
        })
        button2.text = "redirect to 2."
        button2.setOnClickListener({
            startActivity<SampleLoadAct>()
        })
    }
}

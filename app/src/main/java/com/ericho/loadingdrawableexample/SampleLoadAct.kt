package com.ericho.loadingdrawableexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import app.dinus.com.loadingdrawable.render.animal.FishLoadingRenderer
import kotlinx.android.synthetic.main.activity_sample_load.*

/**
 * Created by steve_000 on 24/11/2017.
 * for project LoadingDrawableExample
 * package name com.ericho.loadingdrawableexample
 */
class SampleLoadAct:AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_load)
        tv_1.text = "i loov MKV."
        img.setLoadingRenderer(
                FishLoadingRenderer.Builder(this).build()
        )
    }
}
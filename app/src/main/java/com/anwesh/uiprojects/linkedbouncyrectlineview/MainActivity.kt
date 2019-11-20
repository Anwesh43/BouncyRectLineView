package com.anwesh.uiprojects.linkedbouncyrectlineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.bouncyrectlineview.BouncyRectLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BouncyRectLineView.create(this)
    }
}

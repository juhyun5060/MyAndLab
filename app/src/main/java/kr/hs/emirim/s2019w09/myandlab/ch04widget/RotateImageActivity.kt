package kr.hs.emirim.s2019w09.myandlab.ch04widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kr.hs.emirim.s2019w09.myandlab.R

class RotateImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rotate_image)

        var ivRotate:ImageView = findViewById<ImageView>(R.id.ivRotate)

        findViewById<Button>(R.id.btnRotate).setOnClickListener {
            ivRotate.rotation = ivRotate.rotation + 10.0f
        }
    }
}
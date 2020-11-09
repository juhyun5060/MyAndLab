package kr.hs.emirim.s2019w09.myandlab.ch05layout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class NoXmlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )

        val baseLayout = LinearLayout(this)
        baseLayout.orientation = LinearLayout.VERTICAL
        baseLayout.setBackgroundColor(Color.rgb(0, 255, 0))
        setContentView(baseLayout, params)

        var btn = Button(this)
        btn.text = "버튼입니다"
        btn.setBackgroundColor(Color.MAGENTA)

        btn.setOnClickListener {
            Toast.makeText(applicationContext, "코드로 생성한 버튼입니다", Toast.LENGTH_SHORT).show()
        }
        baseLayout.addView(btn)
    }
}
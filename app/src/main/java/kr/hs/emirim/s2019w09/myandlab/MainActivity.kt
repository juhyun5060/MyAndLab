package kr.hs.emirim.s2019w09.myandlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    // 멤버변수는 변수앞에 m붙여
    lateinit var mProfile : ImageView
    lateinit var mbutton1 : Button
    lateinit var mbutton2 : Button
    lateinit var mbutton3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mProfile = findViewById(R.id.profile)
        mbutton1 = findViewById(R.id.button1)
        mbutton2 = findViewById(R.id.button2)
        mbutton3 = findViewById(R.id.button3)

        mbutton1.setOnClickListener {
            //Intent intent = new Intent(this, MainActivity.class);
            startActivity(Intent(this, FourbuttonActivity::class.java))
        }

        mbutton2.setOnClickListener {
            //val intent = Intent(this, Fourbutton2Activity::class.java)
            startActivity(Intent(this, Fourbutton2Activity::class.java))
        }

        mbutton3.setOnClickListener {
            // Fourbutton3Activity 로 안넘어감 -> 오류 수정
            startActivity(Intent(this, Fourbutton3Activity::class.java))
        }
    }
}
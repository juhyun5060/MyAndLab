package kr.hs.emirim.s2019w09.myandlab

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_fourbutton3.view.*

class Fourbutton3Activity : AppCompatActivity() {
    
    lateinit var mText : EditText
    lateinit var mButton1 : Button
    lateinit var mButton2 : Button
    lateinit var mRadioGroup: RadioGroup
    lateinit var mRadio1 : RadioButton
    lateinit var mRadio2 : RadioButton
    lateinit var mImageView : ImageView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourbutton3)

        mText = findViewById(R.id.editText)
        mButton1 = findViewById(R.id.button1)
        mButton2 = findViewById(R.id.button2)
        mRadioGroup = findViewById(R.id.radioGroup)
        mRadio1 = findViewById(R.id.radioButton1)
        mRadio2 = findViewById(R.id.radioButton2)
        mImageView = findViewById(R.id.imageView)

        mButton1.setOnClickListener {
            Toast.makeText(applicationContext, mText.text, Toast.LENGTH_SHORT).show()
        }

        mButton2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(mText.text.toString()));
            startActivity(intent)
        }

        mRadioGroup.setOnCheckedChangeListener { radioGroup, i ->
            when(i) {
                R.id.radioButton1 ->
                    mImageView.setImageResource(R.drawable.oreo)
                R.id.radioButton2 ->
                    mImageView.setImageResource(R.drawable.pie)
            }
        }
    }
}
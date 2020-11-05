package kr.hs.emirim.s2019w09.myandlab.ch04widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kr.hs.emirim.s2019w09.myandlab.R

class LovelyPetsActivity : AppCompatActivity() {

    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var chkAgree : CheckBox
    lateinit var rGroup1 : RadioGroup
    lateinit var rdoDog : RadioButton
    lateinit var rdoCat : RadioButton
    lateinit var rdoRabbit : RadioButton
    lateinit var btnOK : Button
    lateinit var imgPet : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lovely_pets)

        title = "애완 동물 사진 보기"

        text1 = findViewById(R.id.textView)
        text2 = findViewById(R.id.textView2)
        chkAgree = findViewById(R.id.chStart)
        rGroup1 = findViewById(R.id.radioGroup1)
        rdoDog = findViewById(R.id.rdDog)
        rdoCat= findViewById(R.id.rdCat)
        rdoRabbit = findViewById(R.id.rdRabbit)
        btnOK = findViewById(R.id.btnSelect)
        imgPet = findViewById(R.id.ImgPet)

        chkAgree.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                btnOK.visibility = android.view.View.VISIBLE
                imgPet.visibility = android.view.View.VISIBLE
            } else {
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                btnOK.visibility = android.view.View.INVISIBLE
                imgPet.visibility = android.view.View.INVISIBLE
            }
        }

        btnOK.setOnClickListener {
            when(rGroup1.checkedRadioButtonId) {
                R.id.rdDog -> imgPet.setImageResource(R.drawable.dog)
                R.id.rdCat -> imgPet.setImageResource(R.drawable.kitty)
                R.id.rdRabbit -> imgPet.setImageResource(R.drawable.rabbit)
                else -> Toast.makeText(applicationContext, "동물 먼저 선택하세요", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
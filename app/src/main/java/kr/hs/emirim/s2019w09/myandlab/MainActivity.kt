package kr.hs.emirim.s2019w09.myandlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kr.hs.emirim.s2019w09.myandlab.ch04widget.BasicWidgetActivity
import kr.hs.emirim.s2019w09.myandlab.ch04widget.CalActivity
import kr.hs.emirim.s2019w09.myandlab.ch04widget.LovelyPetsActivity
import kr.hs.emirim.s2019w09.myandlab.ch04widget.RotateImageActivity
import kr.hs.emirim.s2019w09.myandlab.ch05layout.NoXmlActivity
import kr.hs.emirim.s2019w09.myandlab.ch06advwidget.*
import kr.hs.emirim.s2019w09.myandlab.chap07menu.MyWidgetActivity
import kr.hs.emirim.s2019w09.myandlab.chap07menu.OptionMenuActivity
import kr.hs.emirim.s2019w09.myandlab.chap07menu.SnackbarActivity
import kr.hs.emirim.s2019w09.myandlab.chap08io.ReadWriteActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).setOnClickListener(this)
        findViewById<Button>(R.id.button2).setOnClickListener(this)
        findViewById<Button>(R.id.button3).setOnClickListener(this)
        findViewById<Button>(R.id.button4).setOnClickListener(this)
        findViewById<Button>(R.id.button5).setOnClickListener(this)
        findViewById<Button>(R.id.button6).setOnClickListener(this)
        findViewById<Button>(R.id.button7).setOnClickListener(this)
        findViewById<Button>(R.id.button8).setOnClickListener(this)
        findViewById<Button>(R.id.button9).setOnClickListener(this)
        findViewById<Button>(R.id.button10).setOnClickListener(this)
        findViewById<Button>(R.id.button11).setOnClickListener(this)
        findViewById<Button>(R.id.button12).setOnClickListener(this)
        findViewById<Button>(R.id.button13).setOnClickListener(this)
        findViewById<Button>(R.id.button14).setOnClickListener(this)
        findViewById<Button>(R.id.button15).setOnClickListener(this)
        findViewById<Button>(R.id.button16).setOnClickListener(this)
        findViewById<Button>(R.id.button17).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        var intent : Intent? = null
        when(v?.id) {
            R.id.button1 -> intent = Intent(this, FourbuttonActivity::class.java)
            R.id.button2 -> intent = Intent(this, Fourbutton2Activity::class.java)
            R.id.button3 -> intent = Intent(this, Fourbutton3Activity::class.java)
            R.id.button4 -> intent = Intent(this, CalActivity::class.java)
            R.id.button5 -> intent = Intent(this, BasicWidgetActivity::class.java)
            R.id.button6 -> intent = Intent(this, LovelyPetsActivity::class.java)
            R.id.button7 -> intent = Intent(this, RotateImageActivity::class.java)
            R.id.button8 -> intent = Intent(this, NoXmlActivity::class.java)
            R.id.button9 -> intent = Intent(this, DateTimeBookActivity::class.java)
            R.id.button10 -> intent = Intent(this, ViewFlipperActivity::class.java)
            R.id.button11 -> intent = Intent(this, TabWidgetActivity::class.java)
            R.id.button12 -> intent = Intent(this, TabFragmentActivity::class.java)
            R.id.button13 -> intent = Intent(this, WebViewActivity::class.java)
            R.id.button14 -> intent = Intent(this, OptionMenuActivity::class.java)
            R.id.button15 -> intent = Intent(this, SnackbarActivity::class.java)
            R.id.button16 -> intent = Intent(this, MyWidgetActivity::class.java)
            R.id.button17 -> intent = Intent(this, ReadWriteActivity::class.java)
            else -> return
        }
        startActivity(intent)
    }
}
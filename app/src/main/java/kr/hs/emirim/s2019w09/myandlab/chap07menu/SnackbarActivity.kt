package kr.hs.emirim.s2019w09.myandlab.chap07menu

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import kr.hs.emirim.s2019w09.myandlab.R

class SnackbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)

        findViewById<ConstraintLayout>(R.id.clickme).setOnClickListener {
            Snackbar.make(it, "과자 하나 줄까?", Snackbar.LENGTH_SHORT)
                .setAction("여기 클릭", View.OnClickListener {
                Toast.makeText(this, "나를 클릭하다니!", Toast.LENGTH_SHORT).show()
            }).show()
        }

        findViewById<Button>(R.id.showmethedialog).setOnClickListener {
            val dlg = AlertDialog.Builder(this)
            dlg.setTitle("Show me the money!")
            dlg.setMessage("용돈 좀 주세요~\n흑흑흑흑\biddgd")
            dlg.setIcon(R.drawable.kitty)
            dlg.setPositiveButton("긍정긍정", null)
            dlg.setNegativeButton("부정부정", null)
            dlg.setNeutralButton("이도저도", null)
            dlg.show()
        }
    }
}
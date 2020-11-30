package kr.hs.emirim.s2019w09.myandlab.chap07menu

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kr.hs.emirim.s2019w09.myandlab.R

class MyWidgetActivity : AppCompatActivity() {

    lateinit var tvName : TextView
    lateinit var tvEmail : TextView

    lateinit var dialogView : View
    lateinit var toastView : View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_widget)

        tvName = findViewById(R.id.tvName)
        tvEmail = findViewById(R.id.tvEmail)

        findViewById<Button>(R.id.button).setOnClickListener {
            dialogView = View.inflate(this@MyWidgetActivity, R.layout.dialog1, null)
            var dlg = AlertDialog.Builder(this@MyWidgetActivity)
            dlg.setTitle("사용자 정보 입력")
                .setIcon(R.mipmap.ic_launcher_round)
                .setView(dialogView)
                .setPositiveButton("확인", DialogInterface.OnClickListener {
                    dialog, which ->
                        tvName.text = dialogView.findViewById<EditText>(R.id.dlgEdt).text.toString()
                        tvEmail.text = dialogView.findViewById<EditText>(R.id.dlgEdt2).text.toString()
                })
                .setNegativeButton("취소", null)
                .show()

        }
    }
}
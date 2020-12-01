package kr.hs.emirim.s2019w09.myandlab.chap08io

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kr.hs.emirim.s2019w09.myandlab.R
import java.io.FileOutputStream
import java.io.IOException

class ReadWriteActivity : AppCompatActivity() {

    val FILENAME = "file.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_write)

        findViewById<Button>(R.id.btnWrite).setOnClickListener {
            val outFs = openFileOutput(FILENAME, Context.MODE_PRIVATE)
            val str = "Hello 쿡북 안드로이드"
            outFs.write(str.toByteArray())
            outFs.close()
            Toast.makeText(applicationContext, FILENAME+"가 생성됨", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnRead).setOnClickListener {
            try {
                val inFs = openFileInput(FILENAME)
                val txt = ByteArray(30)
                inFs.read(txt)  // 읽어서 txt에 넣어줌
                val str = txt.toString(Charsets.UTF_8)
                Toast.makeText(applicationContext, str, Toast.LENGTH_SHORT).show()
                inFs.close()
            } catch(e:IOException) {
                Toast.makeText(applicationContext, "파일 입출력 예외 발생!", Toast.LENGTH_SHORT).show()
            } catch(e:Exception) {
                Toast.makeText(applicationContext, "뭔가 알 수 없는 예외 발생!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
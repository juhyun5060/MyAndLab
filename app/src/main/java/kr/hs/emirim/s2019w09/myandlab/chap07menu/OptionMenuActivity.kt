package kr.hs.emirim.s2019w09.myandlab.chap07menu

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_option_menu.*
import kr.hs.emirim.s2019w09.myandlab.R

class OptionMenuActivity : AppCompatActivity() {

    lateinit var baseLayout : ConstraintLayout
    lateinit var btnThis : Button
    lateinit var vibrator : Vibrator

    enum class ITEM(val id:Int, title:String) {
        RED(1, "배경색(빨강)"),
        GREEN(1, "배경색(초록)"),
        BLUE(1, "배경색(파랑)"),
        ROTATE(4, "45도 회전하기"),
        SIZEUP(5, "2배 키우기")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu)
        vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        initFindViewById()

        registerForContextMenu(findViewById<Button>(R.id.button_background))
        registerForContextMenu(findViewById<Button>(R.id.button_btn))
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        var mInflater = this.menuInflater
        when(v!!.id) {
            R.id.button_background -> {
                menu!!.setHeaderTitle("배경색 변경")
                mInflater.inflate(R.menu.menu_backcolor, menu)
            }
            R.id.button_btn -> {
                menu!!.setHeaderTitle("버튼 변경")
                mInflater.inflate(R.menu.menu_button, menu)
            }
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        super.onContextItemSelected(item)
        vibrator.vibrate(longArrayOf(100, 300, 100, 300, 100, 10), -1)

        when(item.itemId) {
             R.id.itemRed -> {
                baseLayout.setBackgroundColor(Color.RED)
                return true
            }
            R.id.itemGreen -> {
                baseLayout.setBackgroundColor(Color.GREEN)
                return true
            }
            R.id.itemBlue -> {
                baseLayout.setBackgroundColor(Color.BLUE)
                return true
            }
            R.id.subRotate -> {
                button_btn.rotation = button_btn.rotation + 45f
                return true
            }
            R.id.subSize -> {
                button_btn.scaleX = button_btn.scaleX * 2f
                button_btn.scaleY = button_btn.scaleY * 2f
                return true
            }
        }
        return false
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1, menu)
//        menu!!.add(0, ITEM.RED.id, 0, ITEM.RED.name)
//        menu!!.add(0, ITEM.GREEN.id, 0, ITEM.GREEN.name)
//        menu!!.add(0, ITEM.RED.id, 0, ITEM.BLUE.name)
//        var sMenu : SubMenu = menu.addSubMenu("버튼 변경 >>")
//        sMenu!!.add(0, ITEM.ROTATE.id, 0, ITEM.ROTATE.name)
//        sMenu!!.add(0, ITEM.SIZEUP.id, 0, ITEM.SIZEUP.name)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        vibrator.vibrate(longArrayOf(100, 300, 100, 300, 100, 10), -1)

        when(item.itemId) {
            R.id.item1, R.id.itemRed, ITEM.RED.id -> {
                baseLayout.setBackgroundColor(Color.RED)
                if(item.isCheckable) {
                    item.setChecked(true)
                }
                return true
            }
            R.id.item2, R.id.itemGreen, ITEM.GREEN.id -> {
                baseLayout.setBackgroundColor(Color.GREEN)
                if(item.isCheckable) {
                    item.setChecked(true)
                }
                return true
            }
            R.id.item3, R.id.itemBlue, ITEM.BLUE.id -> {
                baseLayout.setBackgroundColor(Color.BLUE)
                if(item.isCheckable) {
                    item.setChecked(true)
                }
                return true
            }
            R.id.subRotate, ITEM.ROTATE.id -> {
                btnThis.rotation = btnThis.rotation + 45f
                return true
            }
            R.id.subSize, ITEM.SIZEUP.id -> {
                btnThis.scaleX = 2f
                return true
            }
        }
        return false
    }

    private fun initFindViewById() {
        baseLayout = findViewById(R.id.baseLayout)
        btnThis = findViewById(R.id.btnThis)
    }
}
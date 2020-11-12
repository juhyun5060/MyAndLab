package kr.hs.emirim.s2019w09.myandlab.ch06advwidget

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.View
import android.widget.*
import kr.hs.emirim.s2019w09.myandlab.R

lateinit var chrono : Chronometer
lateinit var btnStart : Button
lateinit var btnEnd : Button
lateinit var rdoCal : RadioButton
lateinit var rdoTime : RadioButton
lateinit var calView : CalendarView
lateinit var tPicker: TimePicker
lateinit var tvDateTime : TextView

class DateTimeBookActivity : AppCompatActivity() {

    val TAG = "DateTimeBookActivity"

    var selectYear : Int = 0
    var selectMonth : Int = 0
    var selectDay : Int = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_time_book)
        
        title = "시간 예약"

        btnStart = findViewById(R.id.btnStart)
        btnEnd = findViewById(R.id.btnEnd)
        chrono = findViewById(R.id.chronometer1)
        rdoCal = findViewById(R.id.rdoCal)
        rdoTime = findViewById(R.id.rdoTime)
        tPicker = findViewById(R.id.timePicker1)
        calView = findViewById(R.id.calendarView1)
        tvDateTime = findViewById(R.id.tvDatetime)

        tPicker.visibility = View.GONE
        calView.visibility = View.GONE

        rdoTime.setOnClickListener {
            calView.visibility = View.GONE
            tPicker.visibility = View.VISIBLE
            Log.d(TAG, "rdoTime 클릭됨")
        }

        rdoCal.setOnClickListener {
            calView.visibility = View.VISIBLE
            tPicker.visibility = View.GONE
            Log.d(TAG, "rdoCal 클릭됨")
        }

        btnStart.setOnClickListener {
            chrono.base = SystemClock.elapsedRealtime()
            chrono.start()
            chrono.setTextColor(Color.RED)
            Log.d(TAG, "btnStart 클릭됨")
        }

        btnEnd.setOnClickListener {
            chrono.stop()
            chrono.setTextColor(Color.BLUE)
            Log.d(TAG, "btnEnd 클릭됨")

            tvDateTime.text = "" + selectYear + "년 " + "" + selectMonth + "월 " + selectDay + "일" + "" + tPicker.hour + "시 " + tPicker.minute + "분 예약됨"
        }

        calView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            selectYear = year
            selectMonth = month + 1
            selectDay = dayOfMonth
            Log.d(TAG, "오늘은 : " + selectYear + "/" + selectMonth + "/" + selectDay)
        }

    }
}
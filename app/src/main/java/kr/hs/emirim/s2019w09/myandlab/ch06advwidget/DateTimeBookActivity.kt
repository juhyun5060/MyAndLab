package kr.hs.emirim.s2019w09.myandlab.ch06advwidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kr.hs.emirim.s2019w09.myandlab.R

class DateTimeBookActivity : AppCompatActivity() {
    
    lateinit var chrono : Chronometer
    lateinit var btnStart : Button
    lateinit var btnEnd : Button
    lateinit var rdoCal : RadioButton
    lateinit var rdoTime : RadioButton
    lateinit var calView : CalendarView
    lateinit var tPicker: TimePicker
    lateinit var tvDateTime : TextView

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

    }
}
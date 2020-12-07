package kr.hs.emirim.s2019w09.myandlab.ch09canvas

import android.content.Context
import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View

class CanvasActivity : AppCompatActivity() {

    val TAG = "마이그래픽뷰"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(MyGraphicView(this))
    }

    private class MyGraphicView(context: Context) : View(context) {
        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)
            val paint = Paint()
            paint.isAntiAlias = true
            paint.color = Color.GREEN
//            paint.strokeWidth = 5f
            canvas.drawLine(10f, 10f, 300f, 10f, paint)

            paint.color = Color.BLUE
            paint.strokeWidth = 5f // 선 두께
            canvas.drawLine(10f, 30f, 300f, 30f, paint)

            paint.color = Color.RED
            paint.strokeWidth = 0f // 선 두께

            paint.style = Paint.Style.FILL
            val rect1 = Rect(10, 50, 10+100, 50+100)
            canvas.drawRect(rect1, paint)

            paint.style = Paint.Style.STROKE
            val rect2 = Rect(130, 50, 130+100, 50+100)
            canvas.drawRect(rect2, paint)

            var rect3 = RectF(250f, 50f, 250f+100f, 50f+100f)
            canvas.drawRoundRect(rect3, 20f, 20f, paint)

            canvas.drawCircle(60f, 220f, 50f, paint)

            paint.strokeWidth = 5f
            val path1 = Path()
            path1.moveTo(10f, 290f)
            path1.lineTo(10f+50f, 290f+50f)
            path1.lineTo(10f+100f, 290f)
            path1.lineTo(10f+150f, 290f+50f)
            path1.lineTo(10f+200f, 290f)
            canvas.drawPath(path1, paint)

            paint.strokeWidth = 2f
            paint.textSize = 30f
            canvas.drawText("안드로이드", 10f, 390f, paint)

            paint.style = Paint.Style.FILL
            paint.textSize = 30f
            canvas.drawText("안드로이드", 10f, 420f, paint)

            paint.style = Paint.Style.FILL_AND_STROKE
            paint.textSize = 30f
            canvas.drawText("안드로이드", 10f, 450f, paint)

            paint.color = Color.BLACK
            paint.strokeWidth = 20f
            paint.strokeCap = Paint.Cap.BUTT
            canvas.drawLine(10f, 480f, 300f, 480f, paint)

            paint.strokeCap = Paint.Cap.ROUND
            canvas.drawLine(10f, 510f, 300f, 510f, paint)

            paint.strokeCap = Paint.Cap.SQUARE
            canvas.drawLine(10f, 540f, 300f, 540f, paint)

            paint.setColor(Color.argb(40, 250, 0, 0))
            canvas.drawOval(10f, 580f, 300f, 660f, paint)

            paint.setColor(Color.argb(40, 0, 150, 0))
            canvas.drawOval(60f, 630f, 350f, 710f, paint)
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when(event.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.e(TAG, "액션 다운")
            }
            MotionEvent.ACTION_UP -> {
                Log.e(TAG, "액션 업")
            }
            MotionEvent.ACTION_MOVE -> {
                Log.e(TAG, "액션 무브")
            }
            MotionEvent.ACTION_CANCEL -> {
                Log.e(TAG, "액션 취소")
            }
        }
        return true
    }
}
package com.example.smartlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.Button

class OnBoardSecondActivity : AppCompatActivity(), GestureDetector.OnGestureListener {

    lateinit var gestureDetector: GestureDetector //Объект
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.on_board_second_activity)
        gestureDetector = GestureDetector(this, this) //для свайпа
        var button = findViewById<Button>(R.id.btnMiss)
        button.setOnClickListener()
        {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return if(gestureDetector.onTouchEvent(event!!)){
            true
        }else{
            return super.onTouchEvent(event)
        }
    }

    override fun onDown(p0: MotionEvent): Boolean {
        return false
    }

    override fun onShowPress(p0: MotionEvent) {

    }

    override fun onSingleTapUp(p0: MotionEvent): Boolean {
        return false
    }

    override fun onScroll(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        return false
    }

    override fun onLongPress(p0: MotionEvent) {

    }

    override fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
        val diffY = e2.y - e1.y
        val diffX = e2.x - e1.x
        if(Math.abs(diffX) > Math.abs(diffY)){
            if(Math.abs(diffX) >100 && Math.abs(velocityX) > 100){
                //влево
                if(diffX<0){
                    val intent = Intent(this,OnBoardThirdActivity::class.java)
                    startActivity(intent)
                }
                //вправо
                else {
                    val intent = Intent(this,OnBoardFirstActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        return true
    }
}
package com.example.smartlab

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class OnBoardFirstActivity : AppCompatActivity(), GestureDetector.OnGestureListener {

    lateinit var gestureDetector: GestureDetector //Объект

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.on_board_first_activity)
        gestureDetector = GestureDetector(this, this) //для свайпа

        var button = findViewById<Button>(R.id.btnMiss)
        button.setOnClickListener()
        {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return if (gestureDetector.onTouchEvent(event!!)) {
            true
        } else {
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
        if (Math.abs(diffX) > Math.abs(diffY)) {
            if (Math.abs(diffX) > 100 && Math.abs(velocityX) > 100) {
                //влево
                if (diffX < 0) {
                    val intent = Intent(this, OnBoardSecondActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        return true
    }
}
    /*override fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
        val diffY = e2.y - e1.y
        val diffX = e2.x - e1.x
        //поиск изменяющихся элементов
        var button = findViewById<Button>(R.id.btnMiss)
        var title = findViewById<TextView>(R.id.textView)
        var description = findViewById<TextView>(R.id.textView2)
        var image = findViewById<ImageView>(R.id.imageBoardActivity)
        var switcherOne = findViewById<ImageView>(R.id.switcherOne)
        var switcherTwo = findViewById<ImageView>(R.id.switcherTwo)
        var switcherThree = findViewById<ImageView>(R.id.switcherThree)

        //лист с текстом кнопки
        var listOfButtonText = listOf(
            "Пропустить",
            "Пропустить",
            "Завершить"
        )
        //лист с заголовком
        var listOfTitle = listOf(
            "Анализы",
            "Уведомления",
            "Мониторинг"
        )
        //лист с описанием
        var listOfDescription = listOf(
            "Экспресс сбор и получение проб",
            "Вы быстро узнаете о результатах",
            "Наши врачи всегда наблюдают\nза вашими показателями здоровья"
        )
        var counter = 0 //счетчик для перелистывания

        if (Math.abs(diffX) > Math.abs(diffY)) {
            if (Math.abs(diffX) > 100 && Math.abs(velocityX) > 100) {
                //влево
                if (diffX < 0) {
                    counter += 1
                } else counter -= 1 //вправо
                if (counter < 0) counter = 0 else if (counter > 2) counter = 2
                if (counter == 0 || counter == 1 || counter == 2) {
                    button.setText(listOfButtonText[counter])
                    title.text = listOfTitle[counter]
                    description.text = listOfDescription[counter]
                    if (counter == 0) {
                        image.setImageResource(R.drawable.image_flasks)
                        switcherOne.setImageResource(R.drawable.switch_painted)
                        switcherTwo.setImageResource(R.drawable.switch_non_painted)
                        switcherThree.setImageResource(R.drawable.switch_non_painted)
                    } else if (counter == 1) {
                        image.setImageResource(R.drawable.image_onboard_second)
                        switcherOne.setImageResource(R.drawable.switch_non_painted)
                        switcherTwo.setImageResource(R.drawable.switch_painted)
                        switcherThree.setImageResource(R.drawable.switch_non_painted)
                    } else if (counter == 2) {
                        image.setImageResource(R.drawable.image_onboard_third)
                        switcherOne.setImageResource(R.drawable.switch_non_painted)
                        switcherTwo.setImageResource(R.drawable.switch_non_painted)
                        switcherThree.setImageResource(R.drawable.switch_painted)
                    }
                }
            }
        }
        return true
    }*/





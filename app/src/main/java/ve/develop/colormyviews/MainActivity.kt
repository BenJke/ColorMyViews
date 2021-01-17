package ve.develop.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val listOfBoxes =
            listOf(
                box_one_text,
                box_two_text,
                box_three_text,
                box_four_text,
                box_five_text,
                red_button,
                yellow_button,
                green_button
            )
        listOfBoxes.forEach {
            it.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view) {
            box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            box_two_text -> view.setBackgroundColor(Color.GRAY)
            box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            red_button -> box_three_text.setBackgroundColor(Color.RED)
            yellow_button -> box_four_text.setBackgroundColor(Color.YELLOW)
            green_button -> box_five_text.setBackgroundColor(Color.GREEN)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
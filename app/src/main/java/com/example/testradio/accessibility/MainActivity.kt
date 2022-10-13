package com.example.testradio.accessibility

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatCheckBox
import com.example.testradio.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val list = listOf("a", "b", "c", "d", "e")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCheck.isEnabled = !edtEmail.text.isNullOrEmpty()
        checkbox.setOnClickListener {
            if (checkbox.isChecked) {
                btnCheck.background = AppCompatResources.getDrawable(
                    this,
                    R.drawable.bg_button_app_default
                )
                btnCheck.isClickable = true
            } else {
                btnCheck.background = AppCompatResources.getDrawable(
                    this,
                    R.drawable.bg_button_app_disable_niceblue
                )
                btnCheck.isClickable = false
            }
        }

//        for (i in 1..2) {
//            Toast.makeText(this, "${System.currentTimeMillis()}", Toast.LENGTH_LONG).show()
//        }

        //  tvTest.text = list.joinToString(transform = { it.trackedLabel ?: "" }, postfix = ",")
        val text =
            getInformation().take(getInformation().size - 1)
                .joinToString(transform = { it.name }, postfix = ", ")
        val text2 = "and " + getInformation().last().name
        tvTest.text = text + text2
    }

    private fun getInformation(): List<Student> {
        return listOf(
            Student(1, "Nam"),
            Student(2, "An"),
            Student(3, "Lan"),
            Student(4, "Mai"),
            Student(5, "Nga")
        )
    }

    private fun toastChecked(checkBox: AppCompatCheckBox, checked: Boolean) {
        if (checked) {
            Toast.makeText(this, "checked", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "not checked", Toast.LENGTH_SHORT).show()
        }
    }


}
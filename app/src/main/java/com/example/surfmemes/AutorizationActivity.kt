package com.example.surfmemes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_autorization.*
import kotlinx.android.synthetic.main.activity_autorization.view.*
import kotlinx.android.synthetic.main.activity_autorization.view.password_field
import studio.carbonylgroup.textfieldboxes.ExtendedEditText

class AutorizationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autorization)
    }

    public fun onEnter(view: View) {
        when (login_text.text.toString()) {
            "" -> {
                login_field.setError("Поле не заполнено", true)
                if (password_text.text.toString() == "") {
                    password_field.setError("Поле не заполнено", true)
                }
            }
            else -> {
                if (password_text.text.toString() == "") {
                    password_field.setError("Поле не заполнено", true)
                }
                else getConnection()
            }
        }
    }

    fun getConnection() {

    }


}

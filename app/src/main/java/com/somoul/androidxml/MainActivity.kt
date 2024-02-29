package com.somoul.androidxml

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import com.google.android.material.button.MaterialButton

//GetView By ID
//->findViewById(R.id.fullName)

//TextField on Change
//fullNameEt.addTextChangedListener {
//
//}

// Action on button
//submitBtn.setOnClickListener {
//
//}

// Style
class MainActivity : AppCompatActivity() {
    private lateinit var fullPhoneTv: EditText
    private lateinit var ppassword: EditText
    private lateinit var totalSubmit: String
    private lateinit var submitBtn: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setupView()
        this.initListener()
//        this.initAction()
    }


    private fun setupView() {
        fullPhoneTv = findViewById(R.id.fullPhoneEt)
        ppassword = findViewById(R.id.PassWordEt)
//        submitBtn = findViewById(R.id.submitBtn)
    }

    private fun initListener() {
        fullPhoneTv.afterTextChanged { str ->
//            fullPhoneTv.text=str

        }

        ppassword.afterTextChanged { str->

        }



    }

    private fun initAction(): Unit {
        submitBtn.setOnClickListener {
//            totalSubmit= fullPhoneTv.toString() + ppassword.toString()
//            println("====== show data submit :${totalSubmit}")
                //.toString() + ppassword.toString()
//            fullNameTv.text = fullNameEt.text
        }
    }

}
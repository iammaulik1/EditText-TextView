package com.example.edittexttextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var editText: EditText
    lateinit var textView4: TextView
    lateinit var textView5:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button= findViewById(R.id.button)
        editText=findViewById(R.id.editText)
        textView4=findViewById(R.id.textView4)
        textView5=findViewById(R.id.textView5)

        button.setOnClickListener(){
            val inputValue:String = editText.text.toString()
            if (inputValue==null || inputValue.trim()==""){
                Toast.makeText(this,"please input data , edit text cannot be blank ",Toast.LENGTH_LONG).show()
            }else{
                textView4.setText(inputValue.toString())
            }
        }
        textView5.setOnClickListener(){
            if(textView4.text.toString()==null||textView4.text.toString().trim()==""){
                Toast.makeText(this,"clicked on reset textView \n output textview already reset",Toast.LENGTH_LONG).show()
            }else{
                textView4.setText("").toString()
            }
        }

        editText.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //TODO("Not yet implemented")
                Toast.makeText(applicationContext,"executed before making any change over edittext",Toast.LENGTH_SHORT).show()
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //TODO("Not yet implemented")
                Toast.makeText(applicationContext,"executed while making any change over edittext",Toast.LENGTH_SHORT).show()
            }

            override fun afterTextChanged(p0: Editable?) {
                //TODO("Not yet implemented")
                Toast.makeText(applicationContext,"executed after change made over edittext",Toast.LENGTH_SHORT).show()
            }
        })
    }
}
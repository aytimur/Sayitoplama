package ibrahim.aytimur.sayitoplama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTopla.setOnClickListener {
            if (editText1.text.isNotEmpty() && editText2.text.isNotEmpty()){
                textView.text = (editText1.text.toString().toInt() + editText2.text.toString().toInt()).toString()
            }
            else {
                Toast.makeText(applicationContext,"Sayı giriniz",Toast.LENGTH_SHORT).show()
            }
        }
    }
}

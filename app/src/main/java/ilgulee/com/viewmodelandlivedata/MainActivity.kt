package ilgulee.com.viewmodelandlivedata

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG: String? = MainActivity::class.java.simpleName
    }

//    lateinit var data: MainActivityDataGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ViewModelProviders.of(this).get(MainActivityDataGenerator::class.java)
        model.getNumber()
//        data = MainActivityDataGenerator()
        val myRandomNumber = model.getNumber()
        text_number.text = myRandomNumber
        Log.i(TAG, "Random number is set: " + myRandomNumber)

    }
}

package khalid.com.basketballcounterapp
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_basketball.*

class BasketBallActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basketball)
        val sportName = intent.getStringExtra(IntentNames.sportName)
        actionBar?.title = sportName
        one_point.setOnClickListener {
            increment(point_a, 1)
        }
        two_points.setOnClickListener {
            increment(point_a, 2)
        }
        three_point.setOnClickListener {
            increment(point_a, 3)
        }
    }
    fun handleFirstPoint(view : View){
      increment(point_b, 1)
    }
    fun handleSecondPoint(view : View){
        Log.d("Click", "It got here")
        increment(point_b, 2)

    }
    fun handleThirdPoint(view: View){
        increment(point_b, 3)

    }
    private fun splitString(string: String): List<String> {
        return string.split(" ")

    }
    @SuppressLint("SetTextI18n")
    fun increment(textView: TextView, no : Int){
        val pointTeamString = textView.text.toString()
        val splittedString = splitString(pointTeamString)
        val point = splittedString[0].toInt() + no
        textView.text = "$point points"
    }
}

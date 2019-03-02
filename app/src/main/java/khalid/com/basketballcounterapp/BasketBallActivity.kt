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
        //gets the intent and the string from the activity that launched it
        val sportName = intent.getStringExtra(IntentNames.sportName)
        //sets the click listener for the one point button of team a
        one_point.setOnClickListener {
            //increaments the point of team a by 1
            increment(point_a, 1)
        }
        //sets the click listener for the two point button of team a
        two_points.setOnClickListener {
            //increaments the point of team a by 2
            increment(point_a, 2)
        }
        //sets the click listener for the three point button of team a
        three_point.setOnClickListener {
            //increaments the point of team a by 3
            increment(point_a, 3)
        }
        //sets the click listener for the reset button
        reset_button.setOnClickListener {
            //sets both teams points to 0
            point_a.text = "0 points"
            point_b.text = "0 points"
        }
    }
    //sets the click listener for the one point button of team b
    fun handleFirstPoint(view : View){
        //increment point of team b by 1
      increment(point_b, 1)
    }
    //sets the click listener for the 2 point button of team b
    fun handleSecondPoint(view : View){
        /**illustrates the conceps of logs
         * log.d here means a debug log with a tag and a message to specify**/
        Log.d("Click", "It got here")
        //increment point of team b by 1
        increment(point_b, 2)

    }
    //sets the click listener for the 3 point button of team b
    fun handleThirdPoint(view: View){
        increment(point_b, 3)

    }
    private fun splitString(string: String): List<String> {
        return string.split(" ")

    }
    /*  helper function to help us increment  a score on a text view by a particular number
    * function takes a text view and an integer as a parameter**/
    @SuppressLint("SetTextI18n")
    fun increment(textView: TextView, no : Int){
        //get the text from the textview
        val pointTeamString = textView.text.toString()
        //split the text in the textview , this returns an array of  texts no and points
        val splittedString = splitString(pointTeamString)
        //get the text at index 0 which is a number and add the the result to he number you are incrementing  by
        val point = splittedString[0].toInt() + no
        //set the text of the text view to the new number + the word points
        textView.text = "$point points"
    }
}

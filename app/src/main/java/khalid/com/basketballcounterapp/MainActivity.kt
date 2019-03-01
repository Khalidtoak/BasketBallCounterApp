package khalid.com.basketballcounterapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        one_point.setOnClickListener {
            inCreamentPointAByNo(1)
        }
        two_points.setOnClickListener {
            inCreamentPointAByNo(2)
        }
        three_point.setOnClickListener {
            inCreamentPointAByNo(3)
        }
    }
    fun handleFirstPoint(view : View){
       increamentPointByANo(1)
    }
    fun handleSecondPoint(view : View){
        increamentPointByANo(2)

    }
    fun handleThirdPoint(view: View){
        increamentPointByANo(3)

    }
    fun inCreamentPointAByNo( valueOfIncreamentation : Int){
        val pointTeamA = point_a.text.toString().toInt()
        val inCreamentedPoint = pointTeamA + valueOfIncreamentation
        point_a.text = inCreamentedPoint.toString()
    }
    fun increamentPointByANo(valueOfIncreamentation: Int ){
        val pointTeamB = point_b.text.toString().toInt()
        val increamentationPoint = pointTeamB + valueOfIncreamentation
        point_b.text = increamentationPoint.toString()
    }
    fun splitString(string: String): List<String> {
        //0 points

        val strings  = string.split(" ")
        return strings

    }
}

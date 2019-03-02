package khalid.com.basketballcounterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lanucher.*

class LanucherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lanucher)

        basketBallButton.setOnClickListener {
            val intent = Intent(this@LanucherActivity,
                BasketBallActivity::class.java).apply {
                putExtra(IntentNames.sportName, "BasketBall")
            }
            startActivity(intent)

        }
    }
}

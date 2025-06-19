package vcmsa.ci.musicplaylistapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)


        val addtoplaylist: Button = findViewById(R.id.addtoplaylistbutton)
        val exitButton: Button = findViewById(R.id.exitButton)
        val nextscreenButton: Button = findViewById(R.id.nextscreenButton)


        // Set an OnClickListener for adding playlist button
        addtoplaylist.setOnClickListener {
            Toast.makeText(this, "adding to playlist", Toast.LENGTH_SHORT).show()

        }
        // set an OnClickListener for exiting button
        exitButton.setOnClickListener {
            Toast.makeText(this, "Exiting the app", Toast.LENGTH_SHORT).show()
        }

        // Set an OnClickListener for going to the next screen button
        nextscreenButton.setOnClickListener {
            Toast.makeText(this, "Going to the next screen", Toast.LENGTH_SHORT).show()


        }
    }
}


package vcmsa.ci.musicplaylistapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


            val startButton: Button = findViewById(R.id.startButton)
        // Set an OnClickListener for starting button
        startButton.setOnClickListener {
            Toast.makeText(this, "adding to playlist", Toast.LENGTH_SHORT).show()

        }



           
                
            }
        }


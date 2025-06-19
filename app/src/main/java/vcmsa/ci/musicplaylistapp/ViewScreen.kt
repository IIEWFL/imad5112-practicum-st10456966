package vcmsa.ci.musicplaylistapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vcmsa.ci.musicplaylistapp.R.id.returnButton

class ViewScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_screen)

            val displayButton: Button  = findViewById(R.id.displayButton)
            val calculateButton: Button = findViewById(R.id.calculateButton)
            val returnButton: Button = findViewById(returnButton)


        // Set an OnClickListener for the display button
        displayButton.setOnClickListener {
            Toast.makeText(this, "Display the list of songs",Toast.LENGTH_SHORT).show()

        }
        // set an OnClickListener for the calculations button
        calculateButton.setOnClickListener{
            Toast.makeText(this,"Show calculations of average songs",Toast.LENGTH_SHORT).show()
        }

        // Set an OnClickListener for the return button
        returnButton.setOnClickListener{
            Toast.makeText(this,"Returning to the main screen",Toast.LENGTH_SHORT).show()
            finish() // End the activity
        }


        
          private val songs = arrayOf(
            "Song A","Artist A",4, //Rap
            "Song B","Artist B",1,//Dance song
            "Song C","Artist C",2, //Best Love song
            "Song D","Artist D",3, //Memories

         )
        
        // Calculating average rating of the songs in the playlist
        var totalRating = 0
        for (song in playlist) {
            totalRating += song .rating
        }

        val average = totalRating.toDouble() / playlist.size
        calculateButton.Button = "Average Rating: %.2f".format(average)




        }

    }
    private fun displayRatingsMessage(rating:Int) {
        val message = when (rating) {
            4->"Top rated!"
            1-> "Lowest rated!"
            2-> "Second lowest rated."
            3-> "Third lowest rated."
            else -> "Unknown rating"
        }
    }

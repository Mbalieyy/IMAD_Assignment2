package com.example.assignmentno2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Score : AppCompatActivity() {
    private val questions = arrayOf(
        "The Treaty of Versailles was signed in 1919 to officially end World War I.",
        "The Cold War was a direct military conflict between the United States and the Soviet Union.",
        "Nelson Mandela became South Africa’s first Black president in 1994 ",
        "The Industrial Revolution began in the United States in the early 1700s.",
        " The Berlin Wall fell in 1989, symbolizing the collapse of communist regimes in Eastern Europe."
    )

    private val answers = arrayOf(true, false, true, false, true)

    @SuppressLint("MissingInflatedId" , "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        val exitButton = findViewById<Button>(R.id.Exit)
        val reviewButton = findViewById<Button>(R.id.Review)
        val resultText = findViewById<TextView>(R.id.resultText)
        val backButton = findViewById<Button>(R.id.Back) // <-- Add this to your XML layout

        val score = intent.getIntExtra("score", 0)

        // Show initial result message
        resultText.text = "You scored $score out of ${questions.size}.\n" +
                if (score >= 3) "Good job, Hard work pays off." else "Keep on practicing,Don't give up ."

        // Back button is hidden initially
        backButton.visibility = View.GONE

        // Review button logic
        reviewButton.setOnClickListener {
            val reviewText = StringBuilder("Review Answers:\n\n")
            for (i in questions.indices) {
                reviewText.append("${i + 1}. ${questions[i]}\nAnswer: ${if (answers[i]) "True" else "False"}\n\n")
            }
            resultText.text = reviewText.toString()

            // Toggle buttons
            reviewButton.visibility = View.GONE
            exitButton.visibility = View.GONE
            backButton.visibility = View.VISIBLE
        }

        // Back button logic: restores original score message and buttons
        backButton.setOnClickListener {
            resultText.text = "You scored $score out of ${questions.size}.\n" +
                    if (score >= 3) "Good job, Hard work pays off." else "Keep on practicing,Don't give up."

            backButton.visibility = View.GONE
            reviewButton.visibility = View.VISIBLE
            exitButton.visibility = View.VISIBLE
        }

        // Exit app
        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}

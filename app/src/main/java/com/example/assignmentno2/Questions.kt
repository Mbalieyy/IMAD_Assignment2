package com.example.assignmentno2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.TextView

class Questions : AppCompatActivity() {

    private val questions = arrayOf(
        "The Treaty of Versailles was signed in 1919 to officially end World War I.",
        "The Cold War was a direct military conflict between the United States and the Soviet Union.",
        "Nelson Mandela became South Africa’s first Black president in 1994.",
        "The Industrial Revolution began in the United States in the early 1700s.",
        " The Berlin Wall fell in 1989, symbolizing the collapse of communist regimes in Eastern Europe."
    )

    private val Answers = arrayOf(true, false, true, false, true)

    private var index = 0
    private var score = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val TrueButton = findViewById<Button>(R.id.TrueButton)
        val QuestTextView = findViewById<TextView>(R.id.QuestTextView)
        val Answer = findViewById<TextView>(R.id.Answer)
        val FalseButton = findViewById<Button>(R.id.FalseButton)
        val NxtButton2 = findViewById<Button>(R.id.NxtButton2)

        loadQuestions(QuestTextView, Answer)

        TrueButton.setOnClickListener {
            handleAnswer(true, Answer, QuestTextView)
        }

        FalseButton.setOnClickListener {
            handleAnswer(false, Answer, QuestTextView)
        }

        NxtButton2?.setOnClickListener {
            val intent = Intent(this, Score::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
        }
    }

    private fun loadQuestions(
        questTextView: TextView,
        answerTextView: TextView
    ) {
        questTextView.text = questions[index]
        answerTextView.text = ""
    }

    @SuppressLint("SetTextI18n")
    private fun handleAnswer(
        selectedAnswer: Boolean,
        answerTextView: TextView,
        questTextView: TextView
    ) {
        if (selectedAnswer == Answers[index]) {
            answerTextView.text = "Correct!"
            score++
        } else {
            answerTextView.text = " Incorrect,Better luck next time!"
        }

        Handler(Looper.getMainLooper()).postDelayed({
            index++
            if (index < questions.size) {
                loadQuestions(questTextView, answerTextView)
            } else {
                findViewById<Button>(R.id.NxtButton2).visibility = View.VISIBLE
                questTextView.text = "Quiz Complete"
                answerTextView.text = "Tap next to your view score."
                findViewById<Button>(R.id.TrueButton).visibility = View.GONE
                findViewById<Button>(R.id.FalseButton).visibility = View.GONE
            }
        }, 1000)
    }
}

class ScoreActivity3 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score) // Make sure this layout exists

        val score = intent.getIntExtra("score", 0)
        val scoreTextView = findViewById<TextView>(R.id.ScoreTextView)
        scoreTextView.text = "Your Score: $score"
    }
}






# IMAD_Assignment2
📚 History Flashcard Quiz App 

Welcome to the History Flashcard Quiz App, a native Android application built using Kotlin in Android Studio. This app provides an engaging and educational experience for students who want to review history topics through a fun and fast-paced flashcard quiz — perfect for learning on the go. 

Youtbe link: [
](https://youtube.com/shorts/Mcp-7GgDKz4)
 

🎯 Objective 

This app was developed to help students revise historical facts in an interactive way. Using a set of five True/False flashcards, users can test their knowledge, receive instant feedback, and track their progress with a score summary at the end. 

 

✅ Features 

🖥️ User Interface 

Welcome Screen 

A warm welcome message and a brief description of the app. 

A "Start" button to begin the quiz. 

Flashcard Question Screen 

Displays one history question at a time. 

Two answer buttons: "True" and "False". 

A "Next" button to proceed to the next flashcard. 

Instant feedback after each question (e.g., "Correct!" or "Incorrect"). 

Score Screen 

Displays the user's final score out of 5. 

Personalized feedback based on the performance: 

🎉 Great job! (Score ≥ 3) 

📝 Keep practising! (Score < 3) 

A "Review" button to see all questions with correct answers. 

An "Exit" button to close the app. 

 

🔄 Application Logic 

Welcome Screen 

Clicking the Start button transitions to the Flashcard Question screen. 

Flashcard Logic 

Utilizes two parallel arrays: 

One for questions. 

One for corresponding True/False answers. 

A loop iterates through each of the five questions: 

Displays the current question. 

Awaits user input (True/False). 

Provides immediate feedback. 

Updates the score accordingly. 

Advances to the next flashcard. 

Score Screen 

After the fifth question, the app shows: 

Total correct answers. 

Feedback based on the score. 

The Review button opens a screen displaying: 

All flashcards with correct answers. 

The Exit button terminates the app. 

 

🛠️ Development Tools & Requirements 

Language: Kotlin 

IDE: Android Studio 

Version Control: Git & GitHub 

CI/CD: GitHub Actions 

Target: Android Native Application 

 

🚀 Why This App Is Helpful for Students 

Students often have busy schedules. This app provides a fast and enjoyable way to revise historical facts: 

Simple and mobile-friendly design. 

Quick flashcard format ideal for learning in short bursts. 

Motivational feedback to encourage continued learning. 

Designed to make studying feel less like a chore and more like a game. 

 

💬 Example Question 

Nelson Mandela was the president in 1994 
 Options: True / False 
 Feedback: “Correct!” (if True is selected) 

 

🧑‍💻 Code Documentation 

The Kotlin code includes inline comments for clarity and maintainability. Each function and logic block is explained to help other developers understand and build upon the codebase. 

 

🔗 Repository 

Ensure this app is maintained in a GitHub repository with the following: 

Source code. 

ReadMe file (this document). 

GitHub Actions CI/CD configurations. 

 

Enjoy studying history the fun way! 🎓📖 

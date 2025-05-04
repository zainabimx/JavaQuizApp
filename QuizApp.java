import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "Which language is used for Android development?",
            "What is 2 + 2?",
            "Who wrote 'Romeo and Juliet'?"
        };

        String[][] options = {
            {"A. Berlin", "B. Madrid", "C. Paris", "D. Rome"},
            {"A. Python", "B. Java", "C. Swift", "D. C++"},
            {"A. 3", "B. 4", "C. 5", "D. 6"},
            {"A. Charles Dickens", "B. J.K. Rowling", "C. William Shakespeare", "D. Mark Twain"}
        };

        char[] answers = {'C', 'B', 'B', 'C'};

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! The correct answer is " + answers[i]);
            }
        }

        System.out.println("\nYou got " + score + " out of " + questions.length + " correct.");

        scanner.close();
    }
}

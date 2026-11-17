import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player 1 Name: ");
        StudentPlayer p1 =
            new StudentPlayer(sc.nextLine());

        System.out.print("Enter Player 2 Name: ");
        StudentPlayer p2 =
            new StudentPlayer(sc.nextLine());

        Quiz quiz = new Quiz();

        for (int i = 0; i < quiz.questions.length; i++) {

            System.out.println("\n" + quiz.questions[i]);

            System.out.print(p1.name + " answer: ");
            String a1 = sc.nextLine();

            if (a1.equalsIgnoreCase(quiz.answers[i])) {
                p1.addScore();
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }

            System.out.print(p2.name + " answer: ");
            String a2 = sc.nextLine();

            if (a2.equalsIgnoreCase(quiz.answers[i])) {
                p2.addScore();
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\n===== FINAL RESULT =====");
        System.out.println(p1.name + ": " + p1.score);
        System.out.println(p2.name + ": " + p2.score);

        if (p1.score > p2.score) {
            System.out.println(p1.name + " Wins!");
        } else if (p2.score > p1.score) {
            System.out.println(p2.name + " Wins!");
        } else {
            System.out.println("Match Draw!");
        }

        sc.close();
    }
}
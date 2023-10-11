import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which party are you affiliated with? [D, R, I, or other]: ");

        char partyAfil = scanner.next().charAt(0);

        if (partyAfil == 'D' || partyAfil == 'd'){
            System.out.println("You're a Democrat, you get a donkey!");
        } else if (partyAfil == 'R' || partyAfil == 'r') {
            System.out.println("You're a Republican, you get an elephant!");
        } else if (partyAfil == 'I' || partyAfil == 'i') {
            System.out.println("You're an Independent, you get a random person!");
        } else {
            System.out.println("You chose other, here's a gold star!");
        }

    }
}
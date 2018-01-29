import java.util.Scanner;

public class Ecker_ZahlenDreher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int calculatingNumber;
        int digitCount = 0;
        int reversedNumber = 0;
        int digit;
        int pow = 1;



        do {
            System.out.print("Geben Sie eine Ganzahl ein: ");
            number = scanner.nextInt();
            calculatingNumber = number;

            if (number <= 0){
                System.out.println("ERROR 404 'Zahl darf nicht unter oder gleich 0 sein'");
            }

        } while (number <= 0);

            while (calculatingNumber > 0) {
                pow = (int) (Math.pow(10, digitCount));

                digitCount++;
                calculatingNumber /= 10;
            }

            calculatingNumber = number;

            for (int i = digitCount; i > 0; i--) {
                digit = calculatingNumber % 10;
                calculatingNumber /= 10;

                reversedNumber += digit * pow;
                pow /= 10;
            }

            if (reversedNumber < number) {
                System.out.printf("%d ist kleiner als %d \n", reversedNumber, number);
            } else if (number < reversedNumber) {
                System.out.printf("%d ist größer als %d \n", reversedNumber, number);
            } else if (number == reversedNumber) {
                System.out.printf("%d ist gleich %d \n", reversedNumber, number);
            } else {
                System.out.println("ERROR 404");
            }

            System.out.printf("Anzahl der Stellen: %d", digitCount);
    }
}

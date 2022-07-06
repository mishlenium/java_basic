import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int monthNumber;
        do {
            monthNumber = in.nextInt();
            String season = switch (monthNumber) {
                case 12, 1, 2 -> "Winter";
                case 3, 4, 5 -> "Spring";
                case 6, 7, 8 -> "Summer";
                case 9, 10, 11 -> "Autumn";
                default -> "no such month";
            };
            System.out.println("The season is: " + season);
        } while (monthNumber > 0);
    }
}

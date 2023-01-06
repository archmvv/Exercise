import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number for the size of the asterix rectangle: ");
        int input = in.nextInt();

        String asterix = "*";
        for (int i = 1; i<input; i++)
        {
            asterix = asterix + "*";
        }
        System.out.println(asterix);
        String asterix2 = "*";
        String empty = " ";
        for (int i =1; i<=input-2;i++)
        {
            System.out.print(asterix2);
            for (int k = 1; k<input-1;k++)
            {
                System.out.print(empty);
            }
            System.out.print(asterix2+"\n");
        }
        System.out.println(asterix);
    }
}
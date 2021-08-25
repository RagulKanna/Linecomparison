package Line;

import java.util.Scanner;

public class Linecomparison {
   public static int x1, x2, y1, y2;
    public static void main(String[] args) {
        System.out.println("    Welcome to  the LineComparison");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values of Coordinates x1,y1,x2,y2");
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        greater();

    }
    public static void greater()
    {
        if(x2==y2)
            System.out.println("The Line X is greater than Line Y");
        else
            System.out.println("The Line X is not greater than Line Y");
    }
}

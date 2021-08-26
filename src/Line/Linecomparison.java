package Line;

import java.util.Scanner;

public class Linecomparison {
   public static Integer x1, x2, y1, y2,a,b;
        public static void main(String[] args) {
        System.out.println("    Welcome to  the LineComparison");
        Scanner val = new Scanner(System.in);

            System.out.println("Enter values of Coordinates for  x1,y1,x2,y2 of  Line ");
            x1 = val.nextInt();
            y1 = val.nextInt();
            x2 = val.nextInt();
            y2 = val.nextInt();
            int Length=(int)(Math.sqrt(Math.pow( (x2-x1) ,2 ) + Math.pow( (y2-y1) , 2) ));
            System.out.println("Length of the Line is "+Length);
            
}

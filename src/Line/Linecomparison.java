package Line;

import java.util.Scanner;

public class Linecomparison {
   public static Integer x1, x2, y1, y2,a,b;
        public static void main(String[] args) {
        System.out.println("    Welcome to  the LineComparison");
        Scanner val = new Scanner(System.in);

            System.out.println("Enter values of Coordinates for  x1,y1,x2,y2 of 1 Line ");
            x1 = val.nextInt();
            y1 = val.nextInt();
            x2 = val.nextInt();
            y2 = val.nextInt();
            int Length1=(int)(Math.sqrt(Math.pow( (x2-x1) ,2 ) + Math.pow( (y2-y1) , 2) ));
            System.out.println("Length of the Line is "+Length1);
            System.out.println("Enter values of Coordinates for  x1,y1,x2,y2 of 1 Line ");
            x1 = val.nextInt();
            y1 = val.nextInt();
            x2 = val.nextInt();
            y2 = val.nextInt();
            int Length2=(int)(Math.sqrt(Math.pow( (x2-x1) ,2 ) + Math.pow( (y2-y1) , 2) ));
            a=Length1;
            b=Length2;

        equal();
    }
    public static void equal()
    {
        if(a.equals(b))
            System.out.println("The lines are Equal");
        else
            System.out.println("The lines are not Equal");
    }
}

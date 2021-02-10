import java.util.Scanner;

public class GeometryLine {
    public static void main(String[] args) {
        //Getting User Input
        Scanner n =new Scanner(System.in);

        System.out.println("Enter value of point X1");
        int Line1X1= n.nextInt();
        System.out.println("Enter value of point Y1");
        int Line1Y1= n.nextInt();
        System.out.println("Enter value of point X2");
        int Line1X2= n.nextInt();
        System.out.println("Enter value of point Y2");
        int Line1Y2= n.nextInt();
        System.out.println("Points of line 1 are  X="+"("+Line1X1+","+Line1X2+")"+"  Y=" + "("+Line1Y1+","+Line1Y2+")");
       //Formula

       double lengthLine1= Math.sqrt((Line1X2-Line1X1)^2+(Line1Y2-Line1Y1)^2);
        System.out.println("Length of line 1 is "+ lengthLine1);

        System.out.println("Enter value of point X1");
        int Line2X1= n.nextInt();
        System.out.println("Enter value of point Y1");
        int Line2Y1= n.nextInt();
        System.out.println("Enter value of point X2");
        int Line2X2= n.nextInt();
        System.out.println("Enter value of point Y2");
        int Line2Y2= n.nextInt();
        System.out.println("Points of line 2 are  X="+"("+Line2X1+","+Line2X2+")"+"  Y=" + "("+Line2Y1+","+Line2Y2+")");
        //Formula

        double lengthLine2= Math.sqrt((Line2X2-Line2X1)^2+(Line2Y2-Line2Y1)^2);
        System.out.println("Length of line 2 is "+ lengthLine2);

        if(lengthLine1==lengthLine2){
            System.out.println("Both The Lines are equal");
        }
        else{
            System.out.println("Lines are not equal");
        }

    }

}

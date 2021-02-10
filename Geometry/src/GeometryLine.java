import java.util.Scanner;

public class GeometryLine {
    public static void main(String[] args) {
        //Getting User Input
        Scanner n =new Scanner(System.in);

        System.out.println("Enter value of point X1");
        int X1= n.nextInt();
        System.out.println("Enter value of point Y1");
        int Y1= n.nextInt();
        System.out.println("Enter value of point X2");
        int X2= n.nextInt();
        System.out.println("Enter value of point Y2");
        int Y2= n.nextInt();
        System.out.println("Points are  X="+"("+X1+","+X2+")"+"  Y=" + "("+Y1+","+Y2+")");
       //Formula

       double length= Math.sqrt((X2-X1)^2+(Y2-Y1)^2);
        System.out.println("Length of line is "+ length);



    }

}

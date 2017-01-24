import java.util.Scanner;

public class Task1Ex3 {

    public static double Perimetr(double a, double b) {
        double c = Math.sqrt((a * a) + (b * b));
        double perimetr = a + b + c;
        System.out.println("Perimetr = " + perimetr);
        return perimetr;
    }
    public static double Area(double a, double b){
        double area = (a * b)/2;
        System.out.println("Area = " + area);
        return area;
    }

    public static boolean isDouble(String a) throws NumberFormatException {
        try {
            Double.parseDouble(a);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean check;
        check = true;

        double x = 0;
        do {
            System.out.println("Enter A = ");
            String a = sc.nextLine();
            if (isDouble(a)) {
                x = Double.parseDouble(a);
                check = false;
            } else {
                System.out.println("String not a number!!!");
                check = true;
            }
        } while(check);

        double y = 0;
        do {
            System.out.println("Enter B = ");
            String b = sc.nextLine();
            if (isDouble(b)) {
                y = Double.parseDouble(b);
                check = false;
            } else {
                System.out.println("String not a number!!!");
                check = true;
            }
        } while(check);

        Perimetr(x, y);
        Area(x, y);
    }
}

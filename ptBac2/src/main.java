import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a : ");
        double a = sc.nextDouble();
        System.out.println("nhập số b : ");
        double b = sc.nextDouble();
        System.out.println("nhập số c : ");
        double c = sc.nextDouble();
        QuadraticEquation pt = new QuadraticEquation(a,b,c);
        pt.getDiscriminant();
        pt.disPlay();
    }
}

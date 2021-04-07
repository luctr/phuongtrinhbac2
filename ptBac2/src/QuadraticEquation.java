public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b*b - 4 * a * c;
    }

    double getRoot1() {
        double delta = this.getDiscriminant();
      double  r1 =(-b + Math.sqrt(delta)) / (2*a);
      return r1;
    }
    double getRoot2(){
        double delta = this.getDiscriminant();
        double r2 = ( -b - Math.sqrt(delta)) / (2*a);
        return r2;
    }
    void disPlay(){
        double delta = this.getDiscriminant();
        if (delta > 0){
            System.out.println("phương trình có 2 nghiệm : "+ getRoot1() + " và "+ getRoot2());
        }else if (delta == 0){
            System.out.println("phương trình có nghiệm kép là " + getRoot2());
        }else{
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

package AsisPBO2Enkapsulasi;

import java.util.Scanner;

/**
 *
 * @author Johanna
 */
public class LinearEquationMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Input   : ");
        Scanner input = new Scanner(System.in);
        
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        LinearEquation g = new LinearEquation(a, b, c, d, e, f);
        g.printEquation();
        g.equation(a, b, e);
        g.equation(c, d, f);
        g.CekSolusi();   
    }
}
class LinearEquation{
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    public LinearEquation(){
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        f=0;
    }
    public LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    public void setA(double a){
        this.a=a;
    }
    public double getA(){
        return a;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getB(){
        return b;
    }
    public void setC(double c){
        this.c=c;
    }
    public double getC(){
        return c;
    }
    public void setD(double d){
        this.d=d;
    }
    public double getD(){
        return d;
    }
    public void setE(double e){
        this.e=e;
    }
    public double getE(){
        return e;
    }
    public void setF(double f){
        this.f=f;
    }
    public double getF(){
        return f;
    }
    public double getX(){
        return (((e*d)-(b*f))/((a*d)-(b*c)));
    }
    public double getY(){
        return (((a*f)-(e*c))/((a*d)-(b*c)));
    }
    public void equation(double g, double h, double i){
        if(h<0){
            System.out.println(g+"x"+h+"y = "+i);
        }
        else if(h>=0){
            System.out.println(g+"x+"+h+"y = "+i);
        }
    }
    public void printEquation(){
        System.out.println();
        System.out.println("Output  : ");
        System.out.println("Sistem Persamaannya:");
    }
    public void CekSolusi(){
        System.out.println();
        System.out.println("Hasilnya :");
        if ((getA()*getD())-(getB()*getC())==0){
            System.out.println("Sistem tidak memiliki penyelesaian.");
        } else{
            System.out.printf("x = "+"%.2f",getX());
            System.out.printf(" , y = "+"%.2f",getY());
            }
        System.out.println();
    }
}

package ru.dataart.academy.java.figures;
import java.lang.Math;
abstract class Figure {
    protected abstract double perimeter(double a, double b);
    protected abstract double square(double a, double b);
}
class Circle extends Figure{
    @Override
    protected double perimeter(double a, double b) {
        return 2*Math.PI*a;
    }
    @Override
    protected double square(double a, double b) {
        return Math.PI*a*b;
    }
}
class Rectangle extends Figure{
    @Override
    protected double perimeter(double a, double b) {
        return (a+b)*2;
    }
    @Override
    protected double square(double a, double b) {
        return a*b;
    }
}
public class Calculator{
    public void inputer(int[][] num){
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();
        double square1,perimeter1,a,b;
        for(int i=0;i<num.length;i++){
            if(num[i][0]==1){
                a=num[i][1];
                b=num[i][2];
                perimeter1=rectangle.perimeter(a,b);
                System.out.print("Perimeter of rectangle=");
                System.out.println(perimeter1);
                square1=rectangle.square(a,b);
                System.out.print("Square of rectangle=");
                System.out.println(square1);
            }
            else{
                a=num[i][1];
                perimeter1=circle.perimeter(a,a);
                System.out.print("Perimeter of circle=");
                System.out.println(perimeter1);
                square1=circle.square(a,a);
                System.out.print("Square of circle=");
                System.out.println(square1);
            }
        }
    }
}
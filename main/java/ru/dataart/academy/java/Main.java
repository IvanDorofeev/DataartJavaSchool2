package ru.dataart.academy.java;
import java.util.Scanner;
import ru.dataart.academy.java.figures.Calculator;

public class Main{
    public static void main(String[] args) {
        System.out.println("Task for Java OOP");
        Scanner console=new Scanner(System.in);
        int n=console.nextInt();
        int[][] num =new int[n][3];
        System.out.println("Input 1 if you want to calculate rectangle then space then input sides with space");
        System.out.println("Input 2 if you want to calculate circle then space then input radius");
        System.out.println("One of your input will be for example 1 2 4, or 2 5");
        for(int i=0;i<n;i++){
            num[i][0]=console.nextInt();
            if(num[i][0]==1){
                num[i][1]=console.nextInt();
                num[i][2]=console.nextInt();
            }
            else{
                num[i][1]=console.nextInt();
                num[i][2]=0;
            }
        }
        Calculator calculator= new Calculator();
        calculator.inputer(num);
    }
}
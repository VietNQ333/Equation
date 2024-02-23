package Controller;

import Model.LinearEquation;
import Model.QuadraticEquation;
import java.util.Scanner;


public class Manager {

    private final Scanner in = new Scanner(System.in);
    
    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }

        }
    }
    
    public Double inputDouble(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        while (true) {
            double rs = sc.nextDouble();
            if (rs < 0) {
                System.out.println("Invalid type. Please enter again!!");
                continue;
            }
            return rs;
        }
    }

    public void checkOdd(double n) {
        if (n % 2 == 1 && n > 0) {
           System.out.println(n);
        
        }
    }

    public void checkEven(double n) {
        if (n % 2 == 0 && n > 0) {
            System.out.println(n);
        }
    }

    public void checkSquareNumber(double n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
             System.out.println(n);
        }
            
    }
    
    public void getLinearEquationInput() {
        System.out.print("Enter coefficient A: ");
        double a = checkInputDouble();
        System.out.print("Enter coefficient B: ");
        double b = checkInputDouble();
        LinearEquation linear = new LinearEquation(a, b);
        
        System.out.println("Number is odd: ");
        checkOdd(linear.getA());
        checkOdd(linear.getB());
        checkOdd(linear.solve());
        
        System.out.println("Number is even: ");
        checkEven(linear.getA());
        checkEven(linear.getB());
        checkEven(linear.solve());
        
        System.out.println("Number is perfect square: ");
        checkSquareNumber(linear.getA());
        checkSquareNumber(linear.getB());
        checkSquareNumber(linear.solve());
        
    }


    public void getQuadraticEquationInput() {
        System.out.print("Enter coefficient A: ");
        double a = checkInputDouble();
        System.out.print("Enter coefficient B: ");
        double b = checkInputDouble();
        System.out.print("Enter coefficient C: ");
        double c = checkInputDouble();
    
        QuadraticEquation quad = new QuadraticEquation(a, b, c);
    
        System.out.println("Number is odd: ");
        checkOdd(quad.getA());
        checkOdd(quad.getB());
        checkOdd(quad.getC());
        checkOdd(quad.getDelta());
    
        Double[] roots = quad.getRoots();
        if (roots.length >= 1) {
            checkOdd(roots[0]);
        }
        if (roots.length >= 2) {
            checkOdd(roots[1]);
        }
    
        System.out.println("Number is even: ");
        checkEven(quad.getA());
        checkEven(quad.getB());
        checkEven(quad.getC());
        checkEven(quad.getDelta());
    
        if (roots.length >= 1) {
            checkEven(roots[0]);
        }
        if (roots.length >= 2) {
            checkEven(roots[1]);
        }

        System.out.println("Number is perfect square: ");
        checkSquareNumber(quad.getA());
        checkSquareNumber(quad.getB());
        checkSquareNumber(quad.getC());
        checkSquareNumber(quad.getDelta());
    
        if (roots.length >= 1) {
            checkSquareNumber(roots[0]);
        }
        if (roots.length >= 2) {
            checkSquareNumber(roots[1]);
        }
    }   
}
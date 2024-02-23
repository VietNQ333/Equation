package View;

import Controller.Manager;


public class View extends Menu<String> {
    static String[] menu = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
    Manager mn = new Manager();
    public View() {
        super("Calculator", menu);
    }

    @Override
    public void execute(int n) {
            switch (n) {
                case 1:
                    mn.getLinearEquationInput();
                    break;
                case 2:
                    mn.getQuadraticEquationInput();
                    break;
                case 3:
                    return;
            }
        
    }
    public static void main(String[] args) {
        View mn = new View();
        while (true){
            mn.run();
        }
    }
    
}

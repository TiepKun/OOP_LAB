import javax.swing.JOptionPane;

public class Equations {
    public static void main(String[] args) {
        String[] options = { "The first-degree equation with one variable",
                "The system of first-degree equation with two variables",
                "The second-degree equation with one variable" };
        int decision = JOptionPane.showOptionDialog(null,
                "Choose your equation",
                "Equations",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);
        switch (decision) {
            case 0:
                solveFirstDegreeEquation();
                break;
            case 1:
                solveSystemFirstDegreeEquation();
                break;
            case 2:
                solveSecondDegreeEquation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid decision");
        }
    }

    public static void solveFirstDegreeEquation() {
        String sa = JOptionPane.showInputDialog("Enter a: ");
        String sb = JOptionPane.showInputDialog("Enter b: ");
        double a = Double.parseDouble(sa);
        double b = Double.parseDouble(sb);

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "Infinite solutions!");
            } else {
                JOptionPane.showMessageDialog(null, "No solutions!");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "x = " + x);
        }
    }

    public static void solveSystemFirstDegreeEquation() {
        String sa_11 = JOptionPane.showInputDialog("Enter a11: ");
        String sa_12 = JOptionPane.showInputDialog("Enter a12: ");
        String sb_1 = JOptionPane.showInputDialog("Enter b1: ");
        String sa_21 = JOptionPane.showInputDialog("Enter a21: ");
        String sa_22 = JOptionPane.showInputDialog("Enter a22: ");
        String sb_2 = JOptionPane.showInputDialog("Enter b2: ");

        double a11 = Double.parseDouble(sa_11);
        double a12 = Double.parseDouble(sa_12);
        double b1 = Double.parseDouble(sb_1);
        double a21 = Double.parseDouble(sa_21);
        double a22 = Double.parseDouble(sa_22);
        double b2 = Double.parseDouble(sb_2);

        double D = a11 * a22 - a12 * a21;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "Infinite solutions!");
            } else {
                JOptionPane.showMessageDialog(null, "No solutions!");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "x1 = " + x1 + " and x2 = " + x2);
        }
    }

    public static void solveSecondDegreeEquation() {
        String sa = JOptionPane.showInputDialog("Enter a: ");
        String sb = JOptionPane.showInputDialog("Enter b: ");
        String sc = JOptionPane.showInputDialog("Enter c: ");

        double a = Double.parseDouble(sa);
        double b = Double.parseDouble(sb);
        double c = Double.parseDouble(sc);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "This is not a second-degree equation.");
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null,
                        "The equation has two distinct roots: x1 = " + x1 + " and x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has a double root: x = " + x);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no real roots.");
            }
        }
    }
}

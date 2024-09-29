import javax.swing.JOptionPane;

public class CalculationWithTwoNumbers {
    public static void main(String[] args) {
        String snum1 = JOptionPane.showInputDialog(null, "Please enter the first number: ");
        String snum2 = JOptionPane.showInputDialog(null, "Please enter the second number: ");
        double s1 = Double.parseDouble(snum1);
        double s2 = Double.parseDouble(snum2);
        double sum = s1 + s2;
        double difference = s1 - s2;
        double product = s1 * s2;
        String resultMessage = "Result: \n";
        resultMessage += "Sum: " + sum + "\n";
        resultMessage += "Difference" + difference + "\n";
        resultMessage += "Product" + product + "\n";
        if (s2 != 0) {
            double quotient = s1 / s2;
            resultMessage += "Quotient" + quotient + "\n";
        } else {
            resultMessage += "Cannot divide by 0";
        }
        JOptionPane.showMessageDialog(null, resultMessage, "Results of Calculation", 0);
        System.exit(0);
    }
}
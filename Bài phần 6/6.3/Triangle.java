import javax.swing.JOptionPane;

public class Triangle {
    public static void main(String args[]) {
        String height = JOptionPane.showInputDialog("Enter the height: ");
        int n = Integer.parseInt(height);
        String triangle = "";
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n - i; ++j) {
                triangle += " ";
            }
            for (int j = 1; j <= 2 * i - 1; ++j) {
                triangle += "*";
            }
            triangle += "\n";
        }
        JOptionPane.showMessageDialog(null, triangle);
    }
}

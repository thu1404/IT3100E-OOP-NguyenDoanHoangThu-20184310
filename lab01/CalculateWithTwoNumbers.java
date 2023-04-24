import javax.swing.JOptionPane;

public class CalculateWithTwoNumbers {
    public static void main(String[] args) {
        int num1, num2, sum, diff, product;
        float quotient;
        String result;

        String strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        String strNum2 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        num1 = Integer.parseInt(strNum1);
        num2 = Integer.parseInt(strNum2);

        sum = num1 + num2;
        diff = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;

        result = " Sum of " + num1 + " and " + num2 + " is: " + sum
                + "\n Difference of" + num1 + " and " + num2 + " is: " + diff
                + "\n Product of " + num1 + " and " + num2 + " is: " + product
                + "\n Quotitent of" + num1 + " and " + num2 + " is: " + quotient;
        JOptionPane.showMessageDialog(null, result, "Calculate with two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

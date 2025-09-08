import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {

        String user_name;
        int output;

        do{
            user_name = JOptionPane.showInputDialog(null, "What is your name?");
            output = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            
            
        } while (output == 1);
            JOptionPane.showMessageDialog(null, "Hello, " + user_name + "!");
            
    }
}

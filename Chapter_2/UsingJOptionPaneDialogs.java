import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {

        String username;
        int result;

        do{
            username = JOptionPane.showInputDialog(null, "What is your name?");
            result = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            
            
        } while (result == 1);
            JOptionPane.showMessageDialog(null, "Hello, " + username + "!");
            
    }
}

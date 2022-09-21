import javax.swing.*;
/**
 * InputOutput
 */
public class InputOutput {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "belajar java ");
        JOptionPane.showMessageDialog(null, "Sangat mudah sekali");
        JOptionPane.showMessageDialog(null, "Dan menyenangkan");
        
        String inputkalimat = JOptionPane.showInputDialog("Anda sedang belajar apa?");

        JOptionPane.showMessageDialog(null,"belajar "+inputkalimat+" sangat mudah");
    }

    
}
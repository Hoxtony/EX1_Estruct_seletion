import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tvidade {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));

        String mensagem;
        mensagem = idade >= 18 ? "Você, é de maior segundo a legislação brasileira!" : "Você, é de menor segundo a legislação brasileira!";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

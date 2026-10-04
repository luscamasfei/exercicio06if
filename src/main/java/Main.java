import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;

        nome = JOptionPane.showInputDialog("Digite o nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));

        if (idade >= 15 && idade <= 25) {
            JOptionPane.showMessageDialog(null, nome + " - ACEITA");
        } else {
            JOptionPane.showMessageDialog(null, nome + " - NÃO ACEITA");
        }
    }
}
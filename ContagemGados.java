import javax.swing.JOptionPane;

public class ContagemGados{
    public static void main(String[] args) {
        // Declaração de arrays para armazenar gados em pastos par e ímpar
        int[] par = new int[42];
        int[] impar = new int[42];
        int N, i;

        // Solicita ao usuário a quantidade de gados usando JOptionPane e converte a entrada para inteiro
        String input = JOptionPane.showInputDialog("Quantos gados você deseja realocar? OBS: Máx. 42 gados.");
        N = Integer.parseInt(input);

        // Verifica se a quantidade de gados é maior que o permitido
        if (N > 42) {
            JOptionPane.showMessageDialog(null, "Quantidade de gados inexistente, por favor tente novamente.");
        } else {
            // Loop para alocar os gados em pastos par e ímpar
            for (i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    par[i / 2] = i;
                } else {
                    impar[(i - 1) / 2] = i;
                }
            }

            i = 2;
            // Constrói a mensagem para os gados no pasto par
            StringBuilder parMessage = new StringBuilder("Número de gados que vão para o pasto 1. (PAR)\n");
            for (i = 2; i <= N; i += 2) {
                parMessage.append(par[i / 2]).append(" ");
            }

            i = 1;
            // Constrói a mensagem para os gados no pasto ímpar
            StringBuilder imparMessage = new StringBuilder("\nNúmero de gados que vão para o pasto 2. (ÍMPAR)\n");
            for (i = 1; i <= N; i += 2) {
                imparMessage.append(impar[(i - 1) / 2]).append(" ");
            }

            // Exibe as mensagens usando JOptionPane
            JOptionPane.showMessageDialog(null, parMessage.toString() + imparMessage.toString());
        }
    }
}
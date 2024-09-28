// IMPORTS

import javax.swing.JOptionPane;

public class Exercicio26 {

   public static void main(String[] args) {
      // CONFIG
      int qtde = 3;
      int vetor[] = new int[qtde];

      // GET DATA
      for (int i = 0; i < qtde; i++) {
         vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número :" + i));
      }

      // SORT
      for (int i = 0; i < qtde - 1; i++) {
         for (int j = i + 1; j < qtde; j++) {
            if (vetor[j] < vetor[i]) {
               int aux = vetor[i];
               vetor[i] = vetor[j];
               vetor[j] = aux;
            }
         }
      }

      // OUTPUT
      for (int i = 0; i < qtde; i++) {
         System.out.println("Vetor i: " + vetor[i]);
      }
   }

}

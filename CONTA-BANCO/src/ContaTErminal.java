import java.util.Scanner;


public class ContaTerminal {

      public static void main (String[] args) {
//TODO: conhecer e importar a class scanner
         Scanner scanner = new Scanner(System.in);
         double saldo = 0;
//exibir as mensagens para o usuario
         System.out.println("digite o numero da conta !");
         int numeroConta = scanner.nextInt();

         System.out.println("digite o numero da Agência !");
         String numeroAgencia  = scanner.next();

         System.out.println("digite seu nome completo ! ");
         String nome = scanner.next();

         System.out.println("digite seu saldo !");

        if (scanner.hasNextDouble()) {
        saldo = scanner.nextDouble();

        } else {
            System.out.println("Entrada invalida ! por favor, insira numeros [.] e não [,] ");
        saldo = scanner.nextDouble();

        } 
        


//obter pelo scanner os valores digitados no terminal



//exibir a mensagem conta criada




    }


}

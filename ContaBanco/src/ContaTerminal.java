import java.math.BigDecimal;
import java.util.Scanner; 

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por gentileza, digite o número da conta!");
        int conta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por gentileza, digite o número da agência!");
        String agência = scanner.nextLine();

        System.out.println("Por gentileza, digite o nome do cliente!");
        String nomeDoCliente = scanner.nextLine();

        System.out.println("Por gentileza, digite seu saldo!");
        Long saldo = scanner.nextLong();
        
        scanner.close();

        System.out.println("Olá " 
                           + nomeDoCliente 
                           + ", obrigado por criar uma conta em nosso banco, sua agência é "
                           + agência 
                           + ", conta " 
                           + conta
                           + " e seu saldo "
                           + saldo
                           + " já está disponível para saque.");
    }    
}

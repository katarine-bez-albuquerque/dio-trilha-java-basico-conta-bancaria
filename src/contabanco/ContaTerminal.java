package contabanco;

import java.util.Scanner;

/**
 *
 * @author Katarine Albuquerque
 */
public class ContaTerminal {
    /**
     * @param args Os argumentos da linha de comando
     */
    public static void main(String[] args) {
        
        // Classe Scanner para leitura e escrita no terminal.
        Scanner sc = new Scanner(System.in);
        
        // Inicialização de variáveis
        int numeroConta;
        String agencia, nomeCliente;
        /*
        * O valor do saldo não pode ser solicitado ao cliente, devido ser um dado da conta bancária. 
        * Ele pode ser alterado no futuro através de depósito ou saque. 
        * Então ele no momento ficará com valor fixo somente leitura.
        */
        double saldo = 237.48;
        
        // Armazenando dados nas variáveis
        System.out.println("-------- Banco do Futuro --------\n");
        System.out.println("Informe os Dados Bancários:");
        
        System.out.print("Númeo da Conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Númeo da Agência: ");
        agencia = sc.nextLine();
        System.out.print("Nome do Cliente: ");
        nomeCliente = sc.nextLine();
        System.out.println("");
        
        // Exibindo os dados armazenados nas variáveis para o usuário
        System.out.println("* * * * *\n");
        System.out.println("Olá "
                .concat(nomeCliente.toUpperCase())
                .concat(",\nobrigado por criar uma conta em nosso banco, \nsua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numeroConta))
                .concat(" e seu saldo R$ ")
                .concat(String.format("%.2f", saldo))
                .concat(" já está disponível para saque."));
        System.out.println("\n* * * * *\n");
    }
}

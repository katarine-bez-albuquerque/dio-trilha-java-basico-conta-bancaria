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
        
        // Inicializa��o de vari�veis
        int numeroConta;
        String agencia, nomeCliente;
        /*
        * O valor do saldo n�o pode ser solicitado ao cliente, devido ser um dado da conta banc�ria. 
        * Ele pode ser alterado no futuro atrav�s de dep�sito ou saque. 
        * Ent�o ele no momento ficar� com valor fixo somente leitura.
        */
        double saldo = 237.48;
        
        // Armazenando dados nas vari�veis
        System.out.println("-------- Banco do Futuro --------\n");
        System.out.println("Informe os Dados Banc�rios:");
        
        System.out.print("N�meo da Conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("N�meo da Ag�ncia: ");
        agencia = sc.nextLine();
        System.out.print("Nome do Cliente: ");
        nomeCliente = sc.nextLine();
        System.out.println("");
        
        // Exibindo os dados armazenados nas vari�veis para o usu�rio
        System.out.println("* * * * *\n");
        System.out.println("Ol� "
                .concat(nomeCliente.toUpperCase())
                .concat(",\nobrigado por criar uma conta em nosso banco, \nsua ag�ncia � ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numeroConta))
                .concat(" e seu saldo R$ ")
                .concat(String.format("%.2f", saldo))
                .concat(" j� est� dispon�vel para saque."));
        System.out.println("\n* * * * *\n");
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in); //create scanner object
    System.out.println("Enter username"); // input username
    String username = sc.nextLine(); //read input name
    System.out.println("Enter agency"); // input username
    Integer agencia = sc.nextInt(); //read input agencia
    System.out.println("Enter bank number"); // input username
    Integer numero = sc.nextInt(); //read input agencia
    System.out.println("Enter balance"); // input username
    Double saldo = sc.nextDouble(); //read input agencia

    System.out.println("Olá " +username+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo "+saldo+" já está disponível para saque");

        
    }
}

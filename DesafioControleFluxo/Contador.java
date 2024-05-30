package DesafioControleFluxo;

import java.util.Scanner;

public class Contador{
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        
		try {

           contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosExceptions e) {
			System.out.println(e);
		}
		
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosExceptions {
		
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosExceptions("O Segundo número deve ser maior que o primeiro");
        }
		
        for(int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
		
	}

}

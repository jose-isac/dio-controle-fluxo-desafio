package contador;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

/** 
 * <h1>Desafio contador</h1>
 * <p>Esta classe tem como propósito utilizar o método contar.</p>
 * 
 * @author isac
 * @since 2024-05-02
 * */

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		terminal.close();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Este método calcula a diferença entre o segundo e primeiro paramêtro.
	 * Depois utiliza um loop for para iterar sobre os números de 1 até o valor da diferença.
	 * Imprime uma mensagem na tela para cada numero.
	 * 
	 * @param parametroUm
	 * @param parametroDois
	 * */
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int diferenca = parametroDois - parametroUm;

		System.out.println();
		for (int c = 1; c <= diferenca; c++) {
			System.out.printf("Imprimindo o número %d %n", c);
		}
	}

}

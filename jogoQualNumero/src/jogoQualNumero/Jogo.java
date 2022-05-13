package jogoQualNumero;
import java.util.Scanner;
import java.util.Random;

public class Jogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		String opcao;
		int computador;
		int usuario;
		
		System.out.println("Digite seu nome:");
		String nome = scan.nextLine();
		System.out.printf("%s vamos jogar? %nDigite: s/n %n", nome);
		opcao = scan.nextLine();
		
		if(opcao.equalsIgnoreCase("n")) {
			System.out.println("Aguardo você numa próxima oportunidade!");
			
		}else if (opcao.equalsIgnoreCase("s")) {
			System.out.println("\t Vamos lá! \nVocê irá digitar um valor de 0 a 10\n"
					+ "e tem que acertar que número que eu escolher.\n"
					+ "Vamos começar!");
			
			computador = gerador.nextInt(11);
			
			System.out.println(nome + "eu já escolhi!\nDigite um número de 0 a 10");
			usuario = scan.nextInt();
			int soma = 1;
			while (usuario != computador) {
				soma = soma + 1;
				System.out.println(nome+ " Você errou!\n Tente novamente");
				usuario = scan.nextInt();
				
			System.out.println("Parabéns, Você acertou com " + soma + " tentativas");	
				
			}	
		}
		
		scan.close();
	}

}

package Classes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NovoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		doadorFisico doadorPf = new doadorFisico();
		doadorJuridico doadorPj = new doadorJuridico();
		Cadastro novoCadastro = new Cadastro();
		NovaDoacao novoCadastroDoacao = new NovaDoacao();
		// doacoes novaDoacao = new doacoes();
		Scanner ler = new Scanner(System.in);
		int doar;

		System.out.println("\n\t\t\tSistema de Doa��es do Natal Solid�rio");
		System.out.println("\nGostaria de fazer uma doa��o?");
		System.out.println("\nEscolha: \n(1) Para sim. \n(2) Para n�o.");
		doar = ler.nextInt();

		if (doar == 1) {
			novoCadastro.cadastro();
			novoCadastroDoacao.cadastroDoacao();

			System.out.println("Cadastro e doa��o registrados! Obrigado!");
		}

	}

}

package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class doadorJuridico extends Pessoas {

	// Atributos
	private String razaoSocial;
	private String cnpj;

	public doadorJuridico() {
		super();
	}

	public doadorJuridico(int id, String nome, String telefone, String email, String endereco, String cnpj) {
		super(id, nome, telefone, email, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	// Metodo de doa��o Pessoa Juridica
	/*public static void doacaoPj(doadorJuridico pj) {
		int escolha, idPessoa;
		double quantidade;
		String descricao;
		boolean sair = false;
		Random randow = new Random();
		Scanner leia = new Scanner(System.in);
		doacoes doacao = new doacoes();
		while (sair == false) {
			System.out.println("\nlegal " + pj.getNome() + ", Agora estamos no menu de doa��es.");
			System.out.println("O que voc� deseja doar ?" + "\n1 - Brinquedos" + "\n2 - Alimento" + "\n3 - Roupa"
					+ "\n4 - Utens�lios dom�sticos" + "\n5 - Outros");
			escolha = leia.nextInt();
			switch (escolha) {
			case 1:
				int numero = randow.nextInt(1000);
				doacao.setId(numero);
				idPessoa = (int) pj.getId();
				doacao.setIdPessoa(idPessoa);
				doacao.setTipoPessoa("PJ");
				System.out.println("Brinquedos que legal, assim voc� fara muitas crian�as felizes.");
				doacao.setNome("Brinquedo");
				System.out.println(pj.getNome() + " digite para mim a quantidade de brinquedos que voc� deseja doar? ");
				quantidade = leia.nextDouble();
				doacao.setQuantidade(quantidade);
				System.out
						.println(pj.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
				System.out.print("Resposta: ");
				descricao = leia.next();
				doacao.setDescricao(descricao);
				sair = true;
				break;
			case 2:
				int numero2 = randow.nextInt(1000);
				doacao.setId(numero2);
				idPessoa = (int) pj.getId();
				doacao.setIdPessoa(idPessoa);
				doacao.setTipoPessoa("PJ");
				System.out.println("Alimento que legal, assim voc� fara muitas crian�as felizes.");
				doacao.setNome("Alimento");
				System.out.println(pj.getNome() + " digite para mim a quantidade de Alimento que voc� deseja doar? ");
				quantidade = leia.nextDouble();
				doacao.setQuantidade(quantidade);
				System.out
						.println(pj.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
				System.out.print("Resposta: ");
				descricao = leia.next();
				doacao.setDescricao(descricao);
				sair = true;
				break;
			case 3:
				int numero3 = randow.nextInt(1000);
				doacao.setId(numero3);
				idPessoa = (int) pj.getId();
				doacao.setIdPessoa(idPessoa);
				doacao.setTipoPessoa("PJ");
				System.out.println("Roupa que legal, assim voc� fara muitas crian�as felizes.");
				doacao.setNome("Roupa");
				System.out.println(pj.getNome() + " digite para mim a quantidade de Roupa que voc� deseja doar? ");
				quantidade = leia.nextDouble();
				doacao.setQuantidade(quantidade);
				System.out
						.println(pj.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
				System.out.print("Resposta: ");
				descricao = leia.next();
				doacao.setDescricao(descricao);
				sair = true;
				break;
			case 4:
				int numero4 = randow.nextInt(1000);
				doacao.setId(numero4);
				idPessoa = (int) pj.getId();
				doacao.setIdPessoa(idPessoa);
				doacao.setTipoPessoa("PJ");
				System.out.println("Utens�lios dom�sticos que legal, assim voc� fara muitas pessoas felizes.");
				doacao.setNome("Utens�lios dom�sticos");
				System.out.println(
						pj.getNome() + " digite para mim a quantidade de Utens�lios dom�sticos que voc� deseja doar? ");
				quantidade = leia.nextDouble();
				doacao.setQuantidade(quantidade);
				System.out
						.println(pj.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
				System.out.print("Resposta: ");
				descricao = leia.next();
				doacao.setDescricao(descricao);
				sair = true;
				break;
			case 5:
				int numero5 = randow.nextInt(1000);
				doacao.setId(numero5);
				idPessoa = (int) pj.getId();
				doacao.setIdPessoa(idPessoa);
				doacao.setTipoPessoa("PJ");
				System.out.println("Outros que legal, assim voc� fara muitas Pessoas felizes.");
				doacao.setNome("Outros");
				System.out.println(pj.getNome() + " digite para mim a quantidade de Outros que voc� deseja doar? ");
				quantidade = leia.nextDouble();
				doacao.setQuantidade(quantidade);
				System.out
						.println(pj.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
				System.out.print("Resposta: ");
				descricao = leia.next();
				doacao.setDescricao(descricao);
				sair = true;
				break;
			default:
				System.out.println("\nOp��o invalida");
			}
		}
		System.out.println("\nObrigado Pela sua contribui��o :)");
	}*/

}

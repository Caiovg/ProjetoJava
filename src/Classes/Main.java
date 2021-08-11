package Classes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	//Main
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		doadorFisico doadorFisido = new doadorFisico();
		doadorJuridico doadorJuridico = new doadorJuridico();
		Cadastro novoCadastro = new Cadastro();
		int tipoDePessoa;
		
		int esc;
		boolean sair = false;
		
		System.out.println("\n====== Sistema Natal Solidario =======\n");
		System.out.println("Sobre ---(Contar sobre n�s)\n"
				+ "Voc� pode contribuir como Pessoa Fisica ou Juridica");

		while(sair == false) {
			System.out.println("Deseja fazer uma contribui��o?\n"
					+ "1 - Sim.\n"
					+ "2 - N�o.");
			
			System.out.print("Digite uma das op��es: "); esc = leia.nextInt();
			switch(esc) {
				case 1:
					Cadastro.novoCadastro();
					sair = true;
					break;
				case 2:
					System.out.println("Obrigado pela sua aten��o.");
					sair = true;
					break;
				default:
					System.out.println("Op��o invalida.\n");
			}
		}
		
		
	}
	
	//Metodo de cadastramento das Pessoas Fisicas e as Pessoas Juridicas.
	private static void cadastro() {
		//ArrayList<String> pessoas = new ArrayList();
		Random randow = new Random();
		Scanner leia = new Scanner(System.in);
		int esc;
		boolean sair = false;
		String nome, telefone, email, endereco, cnpj;
		while(sair == false) {
			System.out.println("\nOtimo, mas antes de doar para nossa campanha, vamos realizar um pequeno cadastro.\n"
					+ "Vamos-l�!!!\n"
					+ "\n1) Com qual tipo de Pessoa voc� deseja doar ?\n"
					+ "1 - Sou uma Pessoa Juridica.\n"
					+ "2 - Sou uma Pessoa Fisica.");
			System.out.print("Digite uma das op��es: "); esc = leia.nextInt();
			switch(esc) {
				case 1:
					int numero = randow.nextInt(1000);
					pj.setId(numero);
					System.out.println("\nPrimeiramente, digite para mim o nome ou raz�o social: ");
					pj.setNome(nome = leia.next());
					System.out.println("\nOkay, agora digite para mim o CNPJ da empresa: ");
					pj.setCnpj(cnpj = leia.next());
					System.out.println("\nEm seguida, digite para mim o numero do telefone da empresa: ");
					pj.setTelefone(telefone = leia.next());
					System.out.println("\nEstamos quase acabando, agora digite para mim o email da empresa: ");
					pj.setEmail(email = leia.next());
					System.out.println("\nPara finalizarmos, agora digite para mim o endere�o da empresa: ");
					pj.setEndereco(endereco = leia.next());
					doadorJuridico.
					sair = true;
					break;
				case 2:
					doadorFisico pf = new doadorFisico();
					int numero2 = randow.nextInt(1000);
					pf.setId(numero2);
					System.out.println("\nPrimeiramente, digite para mim o seu nome: ");
					pf.setNome(nome = leia.next());
					System.out.println("\nOkay "+ nome +", agora digite para mim o seu CPF: ");
					pf.setCpf(cnpj = leia.next());
					System.out.println("\nEm seguida, digite para mim o seu numero de telefone: ");
					pf.setTelefone(telefone = leia.next());
					System.out.println("\nEstamos quase acabando, agora digite para mim o seu email: ");
					pf.setEmail(email = leia.next());
					System.out.println("\nPara finalizarmos, agora digite para mim o seu endere�o: ");
					pf.setEndereco(endereco = leia.next());
					doacaoPf(pf);
					sair = true;
					break;
				default:
					System.out.println("Op��o invalida.\n");
			}
		}
	}

	//Metodo de doa��o Pessoa Juridica
	/*private static void doacaoPj(doadorJuridico pj) {
		int esc, idPessoa;
		double quantidade;
		String descricao;
		boolean sair = false;
		Random randow = new Random();
		Scanner leia = new Scanner(System.in);
		doacoes doacao = new doacoes(); 
		while(sair == false) {
			System.out.println("\nlegal " + pj.getNome() + ", Agora estamos no menu de doa��es.");
			System.out.println("O que voc� deseja doar ?"
					+ "\n1 - Brinquedos"
					+ "\n2 - Alimento"
					+ "\n3 - Roupa"
					+ "\n4 - Utens�lios dom�sticos"
					+ "\n5 - Outros");
			esc = leia.nextInt();
			switch(esc) {
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
					System.out.println(pj.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
					System.out.print("Resposta: "); descricao = leia.next();
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
					System.out.println(pj.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
					System.out.print("Resposta: "); descricao = leia.next();
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
					System.out.println(pj.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
					System.out.print("Resposta: "); descricao = leia.next();
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
					System.out.println(pj.getNome() + " digite para mim a quantidade de Utens�lios dom�sticos que voc� deseja doar? ");
					quantidade = leia.nextDouble();
					doacao.setQuantidade(quantidade);
					System.out.println(pj.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
					System.out.print("Resposta: "); descricao = leia.next();
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
					System.out.println(pj.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
					System.out.print("Resposta: "); descricao = leia.next();
					doacao.setDescricao(descricao);
					sair = true;
					break;
				default:
					System.out.println("\nOp��o invalida");
			}
		}
		System.out.println("\nObrigado Pela sua contribui��o :)");
	}*/

	//Metodo de doa��o Pessoa Fisica
	/*private static void doacaoPf(doadorFisico pf) {
		int esc, idPessoa;
		double quantidade;
		String descricao;
		boolean sair = false;
		Random randow = new Random();
		Scanner leia = new Scanner(System.in);
		doacoes doacao = new doacoes(); 
		while(sair == false) {
			System.out.println("\nlegal " + pf.getNome() + ", Agora estamos no menu de doa��es.");
			System.out.println("O que voc� deseja doar ?"
					+ "\n1 - Brinquedos"
					+ "\n2 - Alimento"
					+ "\n3 - Roupa"
					+ "\n4 - Utens�lios dom�sticos"
					+ "\n5 - Outros");
			esc = leia.nextInt();
			switch(esc) {
				case 1:
					int numero = randow.nextInt(1000);
					doacao.setId(numero);
					idPessoa = (int) pf.getId();
					doacao.setIdPessoa(idPessoa);
					doacao.setTipoPessoa("PJ");
					System.out.println("Brinquedos que legal, assim voc� fara muitas crian�as felizes.");
					doacao.setNome("Brinquedo");
					System.out.println(pf.getNome() + " digite para mim a quantidade de brinquedos que voc� deseja doar? ");
					quantidade = leia.nextDouble();
					doacao.setQuantidade(quantidade);
					System.out.println(pf.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
					System.out.print("Resposta: "); descricao = leia.next();
					doacao.setDescricao(descricao);
					sair = true;
					break;
				case 2:
					int numero2 = randow.nextInt(1000);
					doacao.setId(numero2);
					idPessoa = (int) pf.getId();
					doacao.setIdPessoa(idPessoa);
					doacao.setTipoPessoa("PJ");
					System.out.println("Alimento que legal, assim voc� fara muitas crian�as felizes.");
					doacao.setNome("Alimento");
					System.out.println(pf.getNome() + " digite para mim a quantidade de Alimento que voc� deseja doar? ");
					quantidade = leia.nextDouble();
					doacao.setQuantidade(quantidade);
					System.out.println(pf.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
					System.out.print("Resposta: "); descricao = leia.next();
					doacao.setDescricao(descricao);
					sair = true;
					break;
				case 3:
					int numero3 = randow.nextInt(1000);
					doacao.setId(numero3);
					idPessoa = (int) pf.getId();
					doacao.setIdPessoa(idPessoa);
					doacao.setTipoPessoa("PJ");
					System.out.println("Roupa que legal, assim voc� fara muitas crian�as felizes.");
					doacao.setNome("Roupa");
					System.out.println(pf.getNome() + " digite para mim a quantidade de Roupa que voc� deseja doar? ");
					quantidade = leia.nextDouble();
					doacao.setQuantidade(quantidade);
					System.out.println(pf.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
					System.out.print("Resposta: "); descricao = leia.next();
					doacao.setDescricao(descricao);
					sair = true;
					break;
				case 4:
					int numero4 = randow.nextInt(1000);
					doacao.setId(numero4);
					idPessoa = (int) pf.getId();
					doacao.setIdPessoa(idPessoa);
					doacao.setTipoPessoa("PJ");
					System.out.println("Utens�lios dom�sticos que legal, assim voc� fara muitas pessoas felizes.");
					doacao.setNome("Utens�lios dom�sticos");
					System.out.println(pf.getNome() + " digite para mim a quantidade de Utens�lios dom�sticos que voc� deseja doar? ");
					quantidade = leia.nextDouble();
					doacao.setQuantidade(quantidade);
					System.out.println(pf.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
					System.out.print("Resposta: "); descricao = leia.next();
					doacao.setDescricao(descricao);
					sair = true;
					break;
				case 5:
					int numero5 = randow.nextInt(1000);
					doacao.setId(numero5);
					idPessoa = (int) pf.getId();
					doacao.setIdPessoa(idPessoa);
					doacao.setTipoPessoa("PJ");
					System.out.println("Outros que legal, assim voc� fara muitas Pessoas felizes.");
					doacao.setNome("Outros");
					System.out.println(pf.getNome() + " digite para mim a quantidade de Outros que voc� deseja doar? ");
					quantidade = leia.nextDouble();
					doacao.setQuantidade(quantidade);
					System.out.println(pf.getNome() + " para encerrarmos digite agora uma descri��o do objeto a ser doado.");
					System.out.print("Resposta: "); descricao = leia.next();
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
package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Departamento;
import entidades.Trabalhador;
import entities.enums.WorkLevel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do departamento: ");
		String nomeDp = sc.nextLine();
		System.out.println("Entre com os dados do trabahador: ");
		
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Level: ");
		String level = sc.nextLine();
		System.out.println("Base Salarial: ");
		double baseSalarial = sc.nextDouble();
		
		
		Departamento d1 = new Departamento(nomeDp);
		
		Trabalhador t1 = new Trabalhador(nome, WorkLevel.valueOf(level), baseSalarial, d1);
		
		
		System.out.println("Quantos contratos ele têm? ");
		int quantContratos = sc.nextInt();
		
		
		
		
		
		sc.close();

	}

}

package br.com.fiap.tads.rm.ddd.cellphone.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.tads.rm.ddd.cellphone.model.Celular;
import br.com.fiap.tads.rm.ddd.cellphone.model.Telefone;

public class AppList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos aparelhos deseja cadastrar?");

		byte qtd = sc.nextByte();

		List<Telefone> celulares = new ArrayList<>();

		for (int i = 0; i < qtd; i++) {
			System.out.println("Cadastrando o " + (i + 1) + "º aparelho.");

			String marca = null;
			sc.nextLine();
			do {
				System.out.println("Marca?");
				marca = sc.nextLine();
			} while (marca == null);

			String modelo = null;
			do {
				System.out.println("Modelo?");
				modelo = sc.nextLine();
			} while (modelo == null);

			float peso = 0;
			do {
				System.out.println("Peso?");
				peso = sc.nextFloat();
			} while (peso <= 0);

			float altura = 0;
			do {
				System.out.println("Altura?");
				altura = sc.nextFloat();
			} while (altura <= 0);

			float largura = 0;
			do {
				System.out.println("Largura?");
				largura = sc.nextFloat();
			} while (largura <= 0);

			celulares.add(new Celular(marca, modelo, peso, altura, largura));

		}

		// imprima os dados do vetor no console (os dados de cada Cellphone).

		for (Telefone t : celulares) {
			System.out.println(t);
		}
		sc.close();
	}
}

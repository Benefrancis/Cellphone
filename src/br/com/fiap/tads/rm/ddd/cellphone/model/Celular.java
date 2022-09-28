package br.com.fiap.tads.rm.ddd.cellphone.model;

public class Celular extends Telefone {
	/**
	 * Altura (Exemplo de um valor para esse atributo: 12,3)
	 * 
	 */

	private float altura;

	/**
	 * Largura (Exemplo de um valor para esse atributo: 6,8)
	 */
	private float largura;

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public Celular(String marca, String modelo, float peso, float altura, float largura) {
		super(marca, modelo, peso);
		this.altura = altura;
		this.largura = largura;
	}

	public Celular() {
		super();
	}

	public Celular(String marca, String modelo, float peso) {
		super(marca, modelo, peso);
	}

	@Override
	public String toString() {
		return "Celular [altura=" + altura + ", largura=" + largura + ", " + super.toString() + "]";
	}

}

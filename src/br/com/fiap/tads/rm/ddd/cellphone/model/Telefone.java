package br.com.fiap.tads.rm.ddd.cellphone.model;

public class Telefone {

	/**
	 * Marca (Exemplo de um valor para esse atributo: Motorola).
	 */
	private String marca;

	/**
	 * Modelo (Exemplo de um valor para esse atributo: Motorola Z3 Play).
	 */
	private String modelo;

	/**
	 * Peso (Exemplo de um valor para esse atributo: 3.5 ).
	 */
	private float peso;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Telefone(String marca, String modelo, float peso) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
	}

	public Telefone() {
		super();
	}

	@Override
	public String toString() {
		return "Telefone [marca=" + marca + ", modelo=" + modelo + ", peso=" + peso + "]";
	}

}

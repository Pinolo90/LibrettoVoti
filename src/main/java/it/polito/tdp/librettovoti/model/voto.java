package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class voto {

	private String nome;
	private int voto;
	private LocalDate data;

	public voto() {
		super();
	}

	public voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "nome= " + nome + ", voto= " + voto + ", data= " + data ;
	}

}

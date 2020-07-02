package com.ufpb.laboratorio1.model;

public class Disciplina {
	
	private int id;
	private String nome;
	private double nota;
	
	public Disciplina() {
		super();
	}
	
	public Disciplina(int id, String nome, double nota) {
		super();
		this.id = id;
		this.nome = nome;
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "Disciplina : "
				+nome 
				+", com id: " 
				+id
				+ ", cuja nota foi: " 
				+ nota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}
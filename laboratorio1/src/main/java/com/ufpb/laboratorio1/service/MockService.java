package com.ufpb.laboratorio1.service;

import java.util.ArrayList;
import java.util.List;

import com.ufpb.laboratorio1.exceptions.DisciplinaNotFoundException;
import com.ufpb.laboratorio1.model.Disciplina;

public class MockService {
	
	private List<Disciplina> disciplinas;

	public MockService() {
		super();
		this.disciplinas = new ArrayList<>();
	}
	
	public Disciplina inserir(Disciplina disciplina) {
		disciplina.setId(this.disciplinas.size() + 1);
		disciplinas.add(disciplina);
		System.out.println(disciplina);
		return disciplina;
	}
	
	public Disciplina buscarPorId(int id) {
		Disciplina disciplina = null;
		
		for (Disciplina d : this.disciplinas) {
			if(d.getId()== id) {
				disciplina = d;
			}
		}
		return disciplina;
	}

	public List<Disciplina> disciplinasCadastradas(){
		return this.disciplinas;
	}

	public Disciplina atualizarNome(int id, String nome) throws DisciplinaNotFoundException{		
		for(Disciplina disciplina: this.disciplinas) {
			if(disciplina.getId() == id) {
				disciplina.setNome(nome);
				return disciplina;

			}
		}
		throw new DisciplinaNotFoundException("Id não encontrado");
	}
	
	public void deletarDisciplina(int id){
		Disciplina disciplina = null;
	    for(Disciplina d : this.disciplinas) {
	    	if(d.getId() == id) {
		    	disciplina = d;
	    	}
	    }
	    
	    this.disciplinas.remove(disciplina);
	    
	}
}
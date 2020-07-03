package com.ufpb.laboratorio1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ufpb.laboratorio1.exceptions.DisciplinaNotFoundException;
import com.ufpb.laboratorio1.model.Disciplina;

@Service
public class DisciplinaService {
	
	MockService repo = new MockService();
	
	
	public Disciplina inserir(Disciplina disciplina) {
		return repo.inserir(disciplina);
	}
	
	public Disciplina buscarPorId(int id) {
		return repo.buscarPorId(id);
	}
	
	public List<Disciplina> disciplinasCadastradas(){
		return repo.disciplinasCadastradas();
	}
	
	public Disciplina atualizarNome(int id, String nome) throws DisciplinaNotFoundException{
		return repo.atualizarNome(id, nome);
	}

	public Disciplina atualizarNota(int id, double nota) throws DisciplinaNotFoundException{
		return repo.atualizarNota(id, nota);
	}
	
	public void deletarDisciplina(int id) throws DisciplinaNotFoundException {
		repo.deletarDisciplina(id);
	}

	public List<Disciplina> ranking(){
		return repo.ranking();
	}
}

package com.ufpb.laboratorio1.controller;

import java.util.List;

import com.ufpb.laboratorio1.exceptions.DisciplinaNotFoundException;
import com.ufpb.laboratorio1.model.Disciplina;
import com.ufpb.laboratorio1.service.DisciplinaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/api/disciplinas")
public class DisciplinaController {
	
	@Autowired
	DisciplinaService disciplinaService;
	
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity <Disciplina> inserir(@RequestBody final Disciplina disciplina) {
		return ResponseEntity.ok().body(disciplinaService.inserir(disciplina));
		
	}
	
	@RequestMapping (value = "/{id}", method = RequestMethod.GET, consumes = "application/json")
	public ResponseEntity <Disciplina> buscarporId(@PathVariable final int id) {
		return ResponseEntity.ok().body(disciplinaService.buscarPorId(id));
		
	}
	@RequestMapping (method = RequestMethod.GET, consumes = "application/json")
	public ResponseEntity<List<Disciplina>> disciplinasCadastradas() {
		return ResponseEntity.ok().body(disciplinaService.disciplinasCadastradas());
	}
	
	@RequestMapping (value = "/{id}/nome", method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<Disciplina> atualizarNome(@RequestBody final int id, final String nome){
		try {
			return new ResponseEntity<Disciplina>(disciplinaService.atualizarNome(id, nome),  HttpStatus.OK);
			
		}catch(final DisciplinaNotFoundException e){
			 return ResponseEntity.notFound().build();
			
		}
	}

	@RequestMapping (value = "/{id}/nota", method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<Disciplina> atualizarNota(@RequestBody final int id, final double nota){
		try {
			return new ResponseEntity<Disciplina>(disciplinaService.atualizarNota(id, nota),  HttpStatus.OK);
			
		}catch(final DisciplinaNotFoundException e){
			 return ResponseEntity.notFound().build();
			
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json")
    public ResponseEntity<?> deletarDiciplina(@PathVariable int id){
        this.disciplinaService.deletarDisciplina(id);
        return ResponseEntity.noContent().build();
    }

}

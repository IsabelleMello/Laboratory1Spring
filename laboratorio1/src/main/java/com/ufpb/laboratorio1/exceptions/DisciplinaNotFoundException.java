package com.ufpb.laboratorio1.exceptions;

public class DisciplinaNotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public DisciplinaNotFoundException() {
	 }

	 public DisciplinaNotFoundException(final String message) throws DisciplinaNotFoundException{
		 super(message);
	 }
}
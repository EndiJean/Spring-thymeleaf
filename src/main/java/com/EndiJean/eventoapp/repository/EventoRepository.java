package com.EndiJean.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.EndiJean.eventoapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{

	Evento findByCodigo(long cogido);
	
}
	

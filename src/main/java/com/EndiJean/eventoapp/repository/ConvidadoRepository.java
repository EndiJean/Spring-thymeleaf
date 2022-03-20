package com.EndiJean.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.EndiJean.eventoapp.models.Convidado;
import com.EndiJean.eventoapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}

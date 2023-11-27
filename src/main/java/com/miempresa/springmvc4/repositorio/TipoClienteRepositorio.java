package com.miempresa.springmvc4.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.miempresa.springmvc4.modelo.TipoCliente;

public interface TipoClienteRepositorio extends CrudRepository<TipoCliente, Integer> {

}

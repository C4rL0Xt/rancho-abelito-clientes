package com.elranchoabelito.clientes.repositories;

import com.elranchoabelito.clientes.models.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,String> {
}

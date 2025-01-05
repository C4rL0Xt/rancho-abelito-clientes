package com.elranchoabelito.clientes.services;

import com.elranchoabelito.clientes.models.dtos.ClienteDto;
import com.elranchoabelito.clientes.models.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteSevice{

    List<Cliente> listClients();
    Cliente registerClient(ClienteDto clienteDto);


}

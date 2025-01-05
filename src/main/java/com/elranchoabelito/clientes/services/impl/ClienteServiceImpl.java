package com.elranchoabelito.clientes.services.impl;

import com.elranchoabelito.clientes.mappers.ClienteMapper;
import com.elranchoabelito.clientes.models.dtos.ClienteDto;
import com.elranchoabelito.clientes.models.entities.Cliente;
import com.elranchoabelito.clientes.repositories.ClienteRepository;
import com.elranchoabelito.clientes.services.ClienteSevice;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteSevice {
    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public List<Cliente> listClients() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    @Transactional
    public Cliente registerClient(ClienteDto clienteDto) {
        Cliente cliente = ClienteMapper.toClienteEntity(clienteDto);
        return clienteRepository.save(cliente);
    }
}

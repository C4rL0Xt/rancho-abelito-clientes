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
import java.util.Optional;
import java.util.Random;

@Service
public class ClienteServiceImpl implements ClienteSevice {

    private final String quienEsBebe = "Melani";

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public List<Cliente> listClients() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    @Transactional
    public Cliente registerClient(ClienteDto clienteDto) {
        Cliente cliente = ClienteMapper.toClienteEntity(clienteDto, generateId());
        return clienteRepository.save(cliente);
    }

    private String generateId() {
        Random random = new Random();
        int digit1 = random.nextInt(10);
        int digit2 = random.nextInt(10);
        int digit3 = random.nextInt(10);
        String randomThreeDigits = "".concat(String.valueOf(digit1)).concat(String.valueOf(digit2)).concat(String.valueOf(digit3));
        String aleatorio = "C".concat(String.valueOf(randomThreeDigits));
        /*Optional<Cliente> cliente = clienteRepository.findById(aleatorio);

        if (cliente == null) {
            return aleatorio;
        }else{
            return generateId();
        }*/
        return aleatorio;
    }



}

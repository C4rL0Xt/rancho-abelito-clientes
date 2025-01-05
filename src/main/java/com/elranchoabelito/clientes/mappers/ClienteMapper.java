package com.elranchoabelito.clientes.mappers;

import com.elranchoabelito.clientes.models.dtos.ClienteDto;
import com.elranchoabelito.clientes.models.entities.Cliente;

public class ClienteMapper {

    public static Cliente toClienteEntity(ClienteDto clienteDto){
        Cliente cliente = new Cliente();
        cliente.setClienteId(clienteDto.getClienteId());
        cliente.setNombre(clienteDto.getNombre());
        cliente.setApellido(clienteDto.getApellido());
        cliente.setTelefono(clienteDto.getTelefono());
        cliente.setEmail(clienteDto.getEmail());
        cliente.setDni(clienteDto.getDni());
        cliente.setDireccion(clienteDto.getDireccion());
        return cliente;
    }
}

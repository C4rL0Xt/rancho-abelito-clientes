package com.elranchoabelito.clientes.mappers;

import com.elranchoabelito.clientes.models.dtos.ClienteDto;
import com.elranchoabelito.clientes.models.entities.Cliente;

public class ClienteMapper {

    public static Cliente toClienteEntity(ClienteDto clienteDto, String id){

        Cliente cliente = new Cliente();
        cliente.setClienteId(id);
        cliente.setNombre(clienteDto.getNombre());
        cliente.setApellido(clienteDto.getApellido());
        cliente.setTelefono(clienteDto.getTelefono());
        cliente.setEmail(clienteDto.getEmail());
        cliente.setDni(clienteDto.getDocumento());
        cliente.setDireccion(clienteDto.getDireccion());
        cliente.setCuentaId(clienteDto.getCuentaId());
        cliente.setFechaNacimiento(clienteDto.getFechaNacimiento());
        return cliente;
    }
}

package com.elranchoabelito.clientes.controllers;

import com.elranchoabelito.clientes.models.dtos.ClienteDto;
import com.elranchoabelito.clientes.models.entities.Cliente;
import com.elranchoabelito.clientes.services.ClienteSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteSevice clienteSevice;

    @GetMapping("/listar")
    public List<Cliente> listClients(){
        List<Cliente> clientes = clienteSevice.listClients();
        return clientes;
    }

    @PostMapping("/create")
    public ResponseEntity<Cliente> registerClient(@RequestBody ClienteDto clienteDto){
        Cliente cliente = clienteSevice.registerClient(clienteDto);
        return ResponseEntity.ok(cliente);
    }
}

package com.lab4.lab4.controllers

import com.lab4.lab4.models.Client
import com.lab4.lab4.requests.UpdateClientRequest
import com.lab4.lab4.services.ClientService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/clients")
class ClientController(private val clientService: ClientService) {
    @PostMapping("create")
    fun createClient(@RequestBody client: Client): Client {
        return clientService.createClient(client)
    }
    @PostMapping("/update/{id}")
    fun updateClient(@PathVariable id: Long, @RequestBody client: UpdateClientRequest): Client {
        return clientService.updateClient(id, client);
    }
    @GetMapping("/get/{id}")
    fun getClient(@PathVariable id: Long): Client {
        return clientService.getClient(id)
    }
    @GetMapping("/get/all")
    fun getAllClients() : List<Client>{
        return  clientService.getAllClients()
    }
}
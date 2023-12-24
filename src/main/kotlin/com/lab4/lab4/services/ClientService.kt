package com.lab4.lab4.services

import com.lab4.lab4.interfaces.repositories.IClientRepository
import com.lab4.lab4.models.Client
import com.lab4.lab4.requests.UpdateClientRequest
import org.springframework.stereotype.Service

@Service
class ClientService(private val clientRepository: IClientRepository) {
    fun createClient(client: Client): Client {
        return clientRepository.save(client)
    }
    fun getClient(id: Long): Client {
        return clientRepository.findById(id).orElseThrow { NoSuchElementException("Client not found with id: $id") }
    }
    fun getAllClients(): List<Client> {
        return clientRepository.findAll().toList()
    }
    fun updateClient(id: Long, client: UpdateClientRequest): Client {
        val existingClient = getClient(id)

        existingClient.name = client.name
        existingClient.phoneNumber = client.phoneNumber

        return clientRepository.save(existingClient)
    }
}

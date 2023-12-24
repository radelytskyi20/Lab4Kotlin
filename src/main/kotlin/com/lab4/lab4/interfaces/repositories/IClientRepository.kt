package com.lab4.lab4.interfaces.repositories

import com.lab4.lab4.models.Client
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
@Repository
interface  IClientRepository : CrudRepository<Client, Long> {

}
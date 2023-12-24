package com.lab4.lab4.models

import com.lab4.lab4.interfaces.IClient
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
@Entity(name = "clients")
data class Client(
    @Column(name = "name")
    override var name: String,
    @Column(name = "phonenumber")
    override var phoneNumber: String,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    override var id: Long = 0
) : IClient { constructor() : this("", "") }
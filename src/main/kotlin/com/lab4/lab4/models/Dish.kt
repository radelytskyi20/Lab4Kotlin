package com.lab4.lab4.models

import com.lab4.lab4.interfaces.IDish
import jakarta.persistence.*
@Entity(name = "dishes")
data class Dish(
    @Column(name = "name")
    override val name: String,

    @Column(name = "description")
    override val description: String,

    @OneToMany(mappedBy = "dish", cascade = [CascadeType.ALL], orphanRemoval = true)
    override val ingredients: MutableList<Ingredient> = mutableListOf(),

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long = 0
) : IDish
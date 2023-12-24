package com.lab4.lab4.models

import com.lab4.lab4.interfaces.IIngredient
import jakarta.persistence.*
@Entity(name = "ingredients")
data class Ingredient(
    @Column(name = "name")
    @get:Column(name = "name")
    override val name: String,

    @Column(name = "quantity")
    @get:Column(name = "quantity")
    override val quantity: Double,

    @Column(name = "unit")
    @get:Column(name = "unit")
    override val unit: String,

    @ManyToOne
    @JoinColumn(name = "dish_id")
    override val dish: Dish,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long = 0
) : IIngredient

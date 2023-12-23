package com.lab4.lab4.models

import com.lab4.lab4.interfaces.IOrderDish
import jakarta.persistence.*
@Entity(name = "order_dishes")
data class OrderDish(
    @ManyToOne
    @JoinColumn(name = "order_id")
    override val order: Order,

    @ManyToOne
    @JoinColumn(name = "dish_id")
    override val dish: Dish,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    override val id: Long = 0
) : IOrderDish
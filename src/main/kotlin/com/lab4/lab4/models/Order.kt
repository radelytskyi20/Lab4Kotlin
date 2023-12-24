package com.lab4.lab4.models

import com.lab4.lab4.enums.OrderStatus
import com.lab4.lab4.enums.PaymentMethod
import com.lab4.lab4.interfaces.IOrder
import jakarta.persistence.*
import java.math.BigDecimal

@Entity(name = "orders")
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    override val id: Long = 0,

    @Column(name = "total_price")
    override val totalPrice: BigDecimal,

    @Column(name = "order_status")
    @Enumerated(EnumType.STRING)
    override val orderStatus: OrderStatus,

    @OneToMany(mappedBy = "order", cascade = [CascadeType.ALL], orphanRemoval = true)
    override val dishes: MutableList<OrderDish> = mutableListOf(),

    @ManyToMany
    @JoinTable(
        name = "order_clients",
        joinColumns = [JoinColumn(name = "order_id")],
        inverseJoinColumns = [JoinColumn(name = "client_id")]
    )
    override val clients: MutableList<Client> = mutableListOf(),

    @Column(name = "table_number")
    override val tableNumber: Int,

    @Column(name = "payment_method")
    @Enumerated(EnumType.STRING)
    override val paymentMethod: PaymentMethod
) : IOrder

package com.lab4.lab4.interfaces

import com.lab4.lab4.enums.OrderStatus
import com.lab4.lab4.enums.PaymentMethod
import com.lab4.lab4.models.OrderDish
import java.math.BigDecimal

interface IOrder {
    val id: Long
    val totalPrice: BigDecimal
    val orderStatus: OrderStatus
    val dishes: MutableList<OrderDish>
    val clients: List<IClient>
    val tableNumber: Int
    val paymentMethod: PaymentMethod
}
package br.danilo.ecommerce.models;

import br.danilo.ecommerce.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "Order")
public class Order implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private UUID orderId;
    private LocalDateTime orderDate;
    private double totalAmount;
    private OrderStatus orderStatus;
}
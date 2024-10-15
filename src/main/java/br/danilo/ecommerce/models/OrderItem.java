package br.danilo.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@Table(name = "order_item")
public class OrderItem implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
}

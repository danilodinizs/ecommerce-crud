package br.danilo.ecommerce.models;

import br.danilo.ecommerce.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "payment")
public class Payment implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private UUID paymentId;
    private double amount;
    private LocalDateTime paymentDate;
    private PaymentStatus paymentStatus;
}

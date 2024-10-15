package br.danilo.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@Table(name = "customer")
public class Customer implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
}

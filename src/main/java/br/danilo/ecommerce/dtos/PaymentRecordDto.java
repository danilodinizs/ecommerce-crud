package br.danilo.ecommerce.dtos;

import br.danilo.ecommerce.enums.PaymentStatus;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record PaymentRecordDto(double amount, LocalDateTime paymentDate, PaymentStatus paymentStatus) {
}

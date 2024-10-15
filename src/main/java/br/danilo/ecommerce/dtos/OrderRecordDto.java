package br.danilo.ecommerce.dtos;

import br.danilo.ecommerce.enums.OrderStatus;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record OrderRecordDto(LocalDateTime orderDate, double totalAmount, OrderStatus orderStatus) {
}

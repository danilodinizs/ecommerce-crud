package br.danilo.ecommerce.dtos;

import lombok.Builder;

@Builder
public record OrderItemRecordDto(int quantity, double subtotal) {
}

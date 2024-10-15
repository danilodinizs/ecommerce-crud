package br.danilo.ecommerce.dtos;

import lombok.Builder;

@Builder
public record ProductRecordDto(String name, double price, String description, int stockQuantity) {
}

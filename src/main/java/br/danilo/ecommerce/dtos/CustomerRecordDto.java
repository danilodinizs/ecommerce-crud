package br.danilo.ecommerce.dtos;

import lombok.Builder;

@Builder
public record CustomerRecordDto(String name, String email, String address, String phone) {
}

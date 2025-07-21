package academy.devdojo.anime_service.dto;


import lombok.Builder;


@Builder
public record ProducerPostRequest(String name) {
}
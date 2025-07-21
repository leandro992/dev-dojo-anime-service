package academy.devdojo.anime_service.dto;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ProducerGetResponse(
     Long id,
     String name,
     LocalDateTime createdAt) {
}

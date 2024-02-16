package mate.academy.rickandmorty.dto.external;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CharacterResultDto(
        @JsonProperty("id")
        String externalId,
        String name,
        String status,
        String type,
        String gender,
        String image) {
}

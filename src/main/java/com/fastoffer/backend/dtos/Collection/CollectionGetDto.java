package com.fastoffer.backend.dtos.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class CollectionGetDto {
    private final UUID collectionId;
    private final UUID creator;
    private final String imageUrl;
    private final String name;
    private final String description;
    private final String timeCost;
    private final boolean isPublic;
    private final String category;
    private final String type;
}

package com.fastoffer.backend.dtos.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class CollectionGetDto {
    private UUID collectionId;
    private UUID creator;
    private String imageUrl;
    private String name;
    private String description;
    private String timeCost;
    private boolean isPublic;
    private String category;
    private String type;
}

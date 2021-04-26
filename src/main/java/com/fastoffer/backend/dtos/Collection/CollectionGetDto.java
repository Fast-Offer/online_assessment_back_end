package com.fastoffer.backend.dtos.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class CollectionGetDto {
    UUID collectionId;
    UUID creator;
    String imageUrl;
    String name;
    String description;
    String timeCost;
    boolean isPublic;
    String category;
    String type;
}

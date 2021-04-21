package com.fastoffer.backend.dtos;

import lombok.Data;

import java.util.UUID;

@Data
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
    private final UUID[] questionList;
}

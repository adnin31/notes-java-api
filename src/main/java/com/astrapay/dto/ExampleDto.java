package com.astrapay.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ExampleDto {
    @NotEmpty
    private String name;
    private String description;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getters (optional)
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
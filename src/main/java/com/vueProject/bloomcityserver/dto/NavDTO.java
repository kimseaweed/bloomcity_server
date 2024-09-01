package com.vueProject.bloomcityserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class NavDTO {
    private String subject;
    private String subjectPath;
    private List<MenuItemDTO> menuItems;
}


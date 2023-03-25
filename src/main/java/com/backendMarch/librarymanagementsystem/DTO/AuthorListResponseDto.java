package com.backendMarch.librarymanagementsystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorListResponseDto {

    private String name;

    private int age;

    private String mobNo;

    private String email;
}

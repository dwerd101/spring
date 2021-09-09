package ru.socialnetwork.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataOfUsers {

    //PK
    private Long id;
    private String name,lastname,middleName;
    private Integer age;
    private Countries countries;
    //FK
    private Users usersId;
}

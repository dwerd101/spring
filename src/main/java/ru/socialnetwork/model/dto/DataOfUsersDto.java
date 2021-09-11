package ru.socialnetwork.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.socialnetwork.model.Countries;
import ru.socialnetwork.model.Users;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DataOfUsersDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("countries")
    private Countries countries;
    @JsonProperty("usersId")
    private Long usersId;
}

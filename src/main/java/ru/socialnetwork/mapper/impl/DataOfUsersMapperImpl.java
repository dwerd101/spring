package ru.socialnetwork.mapper.impl;

import org.springframework.stereotype.Component;
import ru.socialnetwork.mapper.SocialNetworkMapper;
import ru.socialnetwork.model.DataOfUsers;
import ru.socialnetwork.model.Users;
import ru.socialnetwork.model.dto.DataOfUsersDto;

import javax.xml.crypto.Data;
@Component
public class DataOfUsersMapperImpl implements SocialNetworkMapper<DataOfUsers, DataOfUsersDto> {

    @Override
    public DataOfUsersDto toDTO(DataOfUsers dataOfUsers) {
        return DataOfUsersDto.builder()
                .age(dataOfUsers.getAge())
                .middleName(dataOfUsers.getMiddleName())
                .name(dataOfUsers.getName())
                .usersId(dataOfUsers.getUsersId().getId())
                .countries(dataOfUsers.getCountries())
                .build();
    }

    @Override
    public DataOfUsers toModel(DataOfUsersDto dataOfUsersDto) {
        return DataOfUsers.builder()
                .middleName(dataOfUsersDto.getMiddleName())
                .name(dataOfUsersDto.getName())
                .id(dataOfUsersDto.getId())
                .lastname(dataOfUsersDto.getLastname())
                .age(dataOfUsersDto.getAge())
                .countries(dataOfUsersDto.getCountries())
                .usersId(
                        Users.builder()
                                .id(dataOfUsersDto.getUsersId())
                                .build()
                )
                .build();
    }
}

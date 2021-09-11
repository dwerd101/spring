package ru.socialnetwork.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.socialnetwork.mapper.SocialNetworkMapper;
import ru.socialnetwork.model.DataOfUsers;
import ru.socialnetwork.model.dto.DataOfUsersDto;
import ru.socialnetwork.repository.DataOfUsersRepository;
import ru.socialnetwork.repository.SocicalNetworkService;
import ru.socialnetwork.service.DataOfUsersService;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class DataOfUsersServiceImpl implements DataOfUsersService {

    private final List<DataOfUsers> dataOfUsersList;
    private final JdbcTemplate jdbcTemplate;
    private final DataOfUsersRepository dataOfUsersRepository;
    private final SocialNetworkMapper<DataOfUsers, DataOfUsersDto> mapper;

    @Transactional
    @Override
    public DataOfUsersDto create(DataOfUsersDto dataOfUsersDto) {
        return mapper.toDTO(dataOfUsersRepository.save(mapper.toModel(dataOfUsersDto)));
    }

    @Transactional
    @Override
    public DataOfUsersDto update(DataOfUsersDto dataOfUsersDto, Long aLong) {
        dataOfUsersDto.setId(aLong);
        return mapper.toDTO(dataOfUsersRepository.save(mapper.toModel(dataOfUsersDto)));
    }

    @Transactional(readOnly = true)
    @Override
    public List<DataOfUsersDto> findAll() {
        return dataOfUsersRepository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public DataOfUsersDto delete(Long aLong) {
        dataOfUsersRepository.deleteById(aLong);
        return DataOfUsersDto.builder()
                .id(aLong)
                .build();
    }
/*
    @Override
    public DataOfUsers create(DataOfUsers dataOfUsers) {
        dataOfUsersList.add(dataOfUsers);
        return dataOfUsers;
    }

    // update date-of-users set name=Roman where id=aLong
    @Override
    public DataOfUsers update(DataOfUsers dataOfUsers, Long aLong) {
       DataOfUsers dataOfUsers1 = dataOfUsersList.get(aLong.intValue());
       DataOfUsers dataOfUsersResult = dataOfUsersMapper(dataOfUsers,dataOfUsers1);
       dataOfUsersList.set(aLong.intValue(),dataOfUsersResult);
        return dataOfUsers;
    }

    @Override
    public DataOfUsersDto create(DataOfUsersDto dataOfUsersDto) {
        return null;
    }

    @Override
    public DataOfUsersDto update(DataOfUsersDto dataOfUsersDto, Long aLong) {
        return null;
    }

    @Override
    public List<DataOfUsers> findAll() {
        return jdbcTemplate.query("select * from data_of_users",
                (rs, rowNum) -> DataOfUsers.builder()
                .name(rs.getString("name"))
                .middleName(rs.getString("middle_name"))
                .build());
    }



     @Override
     public DataOfUsers delete(Long aLong) {
         DataOfUsers dataOfUsers = dataOfUsersList.get(aLong.intValue());
         dataOfUsersList.remove(dataOfUsers);
         return dataOfUsers;
     }
    private DataOfUsers dataOfUsersMapper(DataOfUsers dataOfUsersFromRest, DataOfUsers dataOfUsersFromList) {
        dataOfUsersFromList.setUsersId(dataOfUsersFromRest.getUsersId());
        dataOfUsersFromList.setAge(dataOfUsersFromRest.getAge());
        dataOfUsersFromList.setCountries(dataOfUsersFromRest.getCountries());
        dataOfUsersFromList.setMiddleName(dataOfUsersFromRest.getMiddleName());
        dataOfUsersFromList.setLastname(dataOfUsersFromRest.getLastname());
        dataOfUsersFromList.setName(dataOfUsersFromRest.getName());
        dataOfUsersFromList.setUsersId(dataOfUsersFromRest.getUsersId());
        return dataOfUsersFromList;
    }*/
}

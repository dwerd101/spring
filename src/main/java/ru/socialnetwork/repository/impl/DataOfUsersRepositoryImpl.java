package ru.socialnetwork.repository.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.socialnetwork.model.DataOfUsers;
import ru.socialnetwork.model.Users;
import ru.socialnetwork.repository.DataOfUsersRepository;
import ru.socialnetwork.repository.UsersRepository;

import java.util.List;

@Component
@AllArgsConstructor
public class DataOfUsersRepositoryImpl implements DataOfUsersRepository {

    private final List<DataOfUsers> dataOfUsersList;

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
    public List<DataOfUsers> findAll() {
        return dataOfUsersList;
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
    }
}

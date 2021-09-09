package ru.socialnetwork.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.socialnetwork.model.DataOfUsers;
import ru.socialnetwork.repository.DataOfUsersRepository;
import ru.socialnetwork.service.DataOfUsersService;

import java.util.List;

@Component
@AllArgsConstructor
public class DataOfUsersServiceImpl implements DataOfUsersService {

    private final DataOfUsersRepository dataOfUsersRepository;

    @Override
    public DataOfUsers create(DataOfUsers dataOfUsers) {
        return dataOfUsersRepository.create(dataOfUsers);
    }

    @Override
    public DataOfUsers update(DataOfUsers dataOfUsers, Long aLong) {
        return dataOfUsersRepository.update(dataOfUsers,aLong);
    }

    @Override
    public List<DataOfUsers> findAll() {
        return dataOfUsersRepository.findAll();
    }

    @Override
    public DataOfUsers delete(Long aLong) {

        return dataOfUsersRepository.delete(aLong);
    }
}

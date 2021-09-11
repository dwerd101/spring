package ru.socialnetwork.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.socialnetwork.model.DataOfUsers;
import ru.socialnetwork.model.Users;
import ru.socialnetwork.repository.DataOfUsersRepository;
import ru.socialnetwork.repository.UsersRepository;
import ru.socialnetwork.service.UsersService;

import javax.persistence.Column;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Component
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Override
    public Users create(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public Users update(Users users, Long aLong) {
        users.setId(aLong);
        return usersRepository.save(users);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Users delete(Long aLong) {
         usersRepository.deleteById(aLong);
         return Users.builder()
                 .id(aLong)
                 .build();
    }

    @Override
    public Optional<Users> findByLogin(String login) {
        return usersRepository.findByLogin(login);
    }
}

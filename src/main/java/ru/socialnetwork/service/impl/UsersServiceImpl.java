package ru.socialnetwork.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.socialnetwork.exception.UsersBadRequestException;
import ru.socialnetwork.model.DataOfUsers;
import ru.socialnetwork.model.Users;
import ru.socialnetwork.repository.DataOfUsersRepository;
import ru.socialnetwork.repository.UsersRepository;
import ru.socialnetwork.service.UsersService;

import javax.persistence.Column;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Transactional
    @Override
    /*
    - Нет @Transactional
     controller-> create(Users users)
      - Есть @Transactional
     controller->
     spring code
     create(Users users)

     */


    public Users create(Users users) {
        return usersRepository.save(users);
    }

    @Transactional
    //- conttroller -> update() ->
    // spring code-> findAll()-> rep.findAll();
    @Override
    public Users update(Users users, Long aLong) {
        users.setId(aLong);
        return usersRepository.save(users);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Transactional
    @Override
    public Users delete(Long aLong) {
         usersRepository.deleteById(aLong);
         return Users.builder()
                 .id(aLong)
                 .build();
    }
    @Transactional(readOnly = true)
    @Override
    public Users findByLogin(String login) {
        return usersRepository.findByLogin(login).orElseThrow(UsersBadRequestException::new);
    }
}

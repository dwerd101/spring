package ru.socialnetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import ru.socialnetwork.model.Users;

import java.util.List;
import java.util.Optional;

@Component
public interface UsersRepository extends JpaRepository<Users,Long> {
    Optional<Users> findByLogin(String login);
    Optional<Users> findByLoginAndPassword(String login, String password);
    List<Users> findAllByAccountIsNotBlocked(Boolean accountIsBlocked);
}

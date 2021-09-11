package ru.socialnetwork.service;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.socialnetwork.model.Users;

import java.util.Optional;

public interface UsersService extends SocialNetworkService<Users,Long> {
    Users findByLogin(String login);
}

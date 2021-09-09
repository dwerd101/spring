package ru.socialnetwork.repository;

import ru.socialnetwork.model.Users;

import java.util.Optional;

public interface UsersRepository extends CRUD<Users,Long>{
   // Optional<Users> findByLogin();
}

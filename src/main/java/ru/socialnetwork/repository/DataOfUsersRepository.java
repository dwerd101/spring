package ru.socialnetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import ru.socialnetwork.model.DataOfUsers;

@Component
public interface DataOfUsersRepository  extends JpaRepository<DataOfUsers,Long> {
}

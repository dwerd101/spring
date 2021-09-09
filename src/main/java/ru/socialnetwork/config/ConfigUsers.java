package ru.socialnetwork.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.socialnetwork.model.Countries;
import ru.socialnetwork.model.DataOfUsers;
import ru.socialnetwork.model.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Configuration
public class ConfigUsers {

    @Bean
    public List<DataOfUsers> dataOfUsers() {
        DataOfUsers dataOfUsers = DataOfUsers.builder()
                .age(23)
                .countries(Countries.USA)
                .name("GEORGE")
                .lastname("BROWN")
                .id(1L)
                .usersId(
                        Users.builder()
                                .accountIsNotBlocked(true)
                                .accountIsNotExpired(true)
                                .login("root")
                                .password("$2a$12$PC1mGFgricakv8CsCDHGduFNxJU/gY5mlYB75sUeozXS.9mR/ssly")
                                .build()
                )
                .build();
        DataOfUsers dataOfUsers1 = DataOfUsers.builder()
                .age(22)
                .countries(Countries.RUSSIA)
                .name("Andrey")
                .lastname("Ivanov")
                .middleName("Glebovich")
                .id(2L)
                .usersId(
                        Users.builder()
                                .accountIsNotBlocked(true)
                                .accountIsNotExpired(true)
                                .login("root1")
                                .password("$2a$12$waV4QURaeGJLKYkZ6.FQ5eqmljLi.N3r.olBCbqMmz8HgNNccy0ZC")
                                .build()
                )
                .build();
        List<DataOfUsers> dataOfUsersList = new CopyOnWriteArrayList<>();
        dataOfUsersList.add(dataOfUsers);
        dataOfUsersList.add(dataOfUsers1);
        return dataOfUsersList;

    }
}

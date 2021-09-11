package ru.socialnetwork.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.socialnetwork.model.DataOfUsers;
import ru.socialnetwork.model.Users;
import ru.socialnetwork.service.UsersService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UsersController {
    private final UsersService usersService;
    @PostMapping("user/add")
    public Users addDataOfUsers(@RequestBody Users dataOfUsers) {
        return usersService.create(dataOfUsers);
    }
    @GetMapping("user/")
    public List<Users> findAll() {
        return usersService.findAll();
    }
    @GetMapping("user/login/{login}")
    public Users findByLogin(@PathVariable String login) {
        return usersService.findByLogin(login).get();
    }
}

package ru.socialnetwork.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.socialnetwork.model.DataOfUsers;
import ru.socialnetwork.model.Users;
import ru.socialnetwork.service.UsersService;

import java.util.List;
import java.util.concurrent.Callable;

@RestController
@AllArgsConstructor
public class UsersController {
    private final UsersService usersService;
    @PostMapping("user/add")
    public Callable<ResponseEntity<Users>> addDataOfUsers(@RequestBody Users dataOfUsers) {
        return () -> ResponseEntity.ok(usersService.create(dataOfUsers));
    }
    @GetMapping("user/")
    public Callable<ResponseEntity<List<Users>>> findAll() {
        return () -> ResponseEntity.ok(usersService.findAll());
    }
    @GetMapping("user/login/{login}")
    public Callable<ResponseEntity<Users>> findByLogin(@PathVariable String login) {
        return () -> ResponseEntity.ok(usersService.findByLogin(login));
    }
}

package ru.socialnetwork.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.socialnetwork.exception.DataOfUsersBadRequestException;
import ru.socialnetwork.model.DataOfUsers;
import ru.socialnetwork.model.dto.DataOfUsersDto;
import ru.socialnetwork.service.DataOfUsersService;
import ru.socialnetwork.service.impl.DataOfUsersServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class DataOfUsersController {

    private final DataOfUsersServiceImpl dataOfUsersService;

    @GetMapping("/")
    public List<DataOfUsersDto> findAll() {
        return dataOfUsersService.findAll();
    }
    @PostMapping("/add")
    public DataOfUsersDto addDataOfUsers(@RequestBody DataOfUsersDto dataOfUsers) {
        return dataOfUsersService.create(dataOfUsers);
    }
    @PutMapping("/update/{id}")
    public DataOfUsersDto updateDataOfUsers(@PathVariable String id,
                                            @RequestBody DataOfUsersDto dataOfUsers) {
        try {
           return dataOfUsersService.update(dataOfUsers, Long.parseLong(id));
        } catch (Exception e) {
            throw new DataOfUsersBadRequestException();
        }
    }
    @DeleteMapping("/{id}")
    public DataOfUsersDto deleteDataOfUsers(@PathVariable String id) {
        try {
            return dataOfUsersService.delete(Long.parseLong(id));
        } catch (Exception e) {
            throw new DataOfUsersBadRequestException();
        }
    }
}

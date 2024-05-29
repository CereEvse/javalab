package ru.evs.projects.Artifcatld.javabot.controller;


import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.evs.projects.Artifcatld.javabot.model.User;
import ru.evs.projects.Artifcatld.javabot.model.UserRegistrationShab;
import ru.evs.projects.Artifcatld.javabot.model.UserRole;
import ru.evs.projects.Artifcatld.javabot.model.UserShab;
import ru.evs.projects.Artifcatld.javabot.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class UserController {

    private final UserService userService;

    // GET /users/getAll?page=num_page - получение всех пользователей с пагинацией
    @GetMapping("/getAll")
    ResponseEntity<Page<User>> getAllUsers(@RequestParam int page) {
        return ResponseEntity.ok(userService.getAllUsers(page));
    }

    // GET /users/getAllRoles - получение всех ролей
    @GetMapping("/getAllRoles")
    ResponseEntity<List<UserRole>> getAllRoles() {
        return ResponseEntity.ok(userService.getAllRoles());
    }

    // POST /users/register - регистрация нового пользователя
    @PostMapping("/register")
    ResponseEntity<UserShab> registerUser(@RequestBody UserRegistrationShab shab) {
        return ResponseEntity.ok(userService.registerUser(shab));
    }

    // PUT /users/grant?userId=id&roleId=id - выдать роль пользователю
    @PutMapping("/grant")
    ResponseEntity<UserShab> grantRole(@RequestParam Long userId, @RequestParam Long roleId) {
        return ResponseEntity.ok(userService.grantRole(userId, roleId));
    }

    // PUT /users/revoke?userId=id&roleId=id - отозвать роль у пользователя
    @PutMapping("/revoke")
    ResponseEntity<UserShab> revokeRole(@RequestParam Long userId, @RequestParam Long roleId) {
        return ResponseEntity.ok(userService.revokeRole(userId, roleId));
    }

    // DELETE /users/userId - удаление пользователя
    @DeleteMapping("/{userId}")
    ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok().build();
    }
}

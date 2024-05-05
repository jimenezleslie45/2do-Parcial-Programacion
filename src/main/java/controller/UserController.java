package controller;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> listarUser() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User obtenerUser(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public void guardarUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @PutMapping("/{id}")
    public void actualizarUser(@PathVariable Long id, @RequestBody User user) {
        userService.modifyUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void eliminarUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}

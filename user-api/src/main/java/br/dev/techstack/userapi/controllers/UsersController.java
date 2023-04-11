package br.dev.techstack.userapi.controllers;

import br.dev.techstack.userapi.models.User;
import br.dev.techstack.userapi.models.CreateUserRequest;
import br.dev.techstack.userapi.models.Generation;
import br.dev.techstack.userapi.models.UpdateUserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UsersController {
    private final List<User> users = new ArrayList<>();

/*CREATE Users - Registro de Usuário*/
    @PostMapping
    public User createUser(@RequestBody CreateUserRequest request){
        User user = new User(
                UUID.randomUUID(),
                request.getName(),
                request.getAge(),
                request.getEmail(),
                Generation.calc(request.getAge()),
                Generation.desc(request.getAge())
        );

        users.add(user);

        return user;
    }


/*READ Users - Apresenta todos os usuários cadastrados*/
    @GetMapping
    public List<User> getUsers(){
        return users;
    }


/*READ User - Apresenta as informações do usuário com base no código de ID*/
    @GetMapping("/{id}")
    public ResponseEntity<Object> getUserById(
            @PathVariable UUID id
    ){
        Optional<User> existingUser = users.stream().filter(user -> user.getId().equals(id)).findFirst();

        if (existingUser.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(existingUser.get());
    }


/*UPDATE User - Atualiza as informações do usuário com base no código de ID*/
    @PutMapping("/update/{id}")
    public ResponseEntity<Object> updateUser(
            @PathVariable UUID id,
            @RequestBody UpdateUserRequest request
    ){
        Optional<User> existingUser = users.stream().filter(user -> user.getId().equals(id)).findFirst();

        if (existingUser.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        User userToUpdate = existingUser.get();

        userToUpdate.setName(request.getName());
        userToUpdate.setAge(request.getAge());
        userToUpdate.setEmail(request.getEmail());

        return ResponseEntity.ok(userToUpdate);
    }


/*DELETE User - Apaga o usuário com base no código de ID*/
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteUser(
            @PathVariable UUID id
    ){
        boolean wasDeleted = users.removeIf(user -> user.getId().equals(id));

        if (wasDeleted){

            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

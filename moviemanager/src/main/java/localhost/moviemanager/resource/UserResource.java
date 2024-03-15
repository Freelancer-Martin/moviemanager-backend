package localhost.moviemanager.resource;

import localhost.moviemanager.model.*;
import localhost.moviemanager.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") // Base path for user-related endpoints
@CrossOrigin("http://localhost:8081") // Allow CORS from frontend
public class UserResource {

  private final UserService userService;

  public UserResource(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/all")
  public ResponseEntity<List<Users>> getAllUsers() {
    List<Users> users = userService.getAllUsers();
    return new ResponseEntity<>(users, HttpStatus.OK);
  }

  @GetMapping("/find/{userId}")
  public ResponseEntity<Users> getUserById(@PathVariable("userId") Long userId) {
    Users user = userService.getUserById(userId);
    return new ResponseEntity<>(user, HttpStatus.OK);
  }

  @PostMapping("/register") // Clearer endpoint name for user registration
  public ResponseEntity<Users> registerUser(@RequestBody Users user) {
    Users registeredUser = userService.createUser(user);
    return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
  }

  @PutMapping("/update")
  public ResponseEntity<Users> updateUser(@RequestBody Users user) {
    Users updatedUser = userService.updateUser(user);
    return new ResponseEntity<>(updatedUser, HttpStatus.OK);
  }

  @DeleteMapping("/delete/{userId}")
  public ResponseEntity<?> deleteUser(@PathVariable("userId") Long userId) {
    userService.deleteUser(userId);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}

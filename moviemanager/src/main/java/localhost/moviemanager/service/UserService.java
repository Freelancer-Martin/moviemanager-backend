package localhost.moviemanager.service;

import jakarta.transaction.Transactional;
import localhost.moviemanager.exception.UserNotFoundException;
import localhost.moviemanager.model.Users;
import localhost.moviemanager.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Users createUser(Users user) {
    return userRepository.save(user);
  }

  public List<Users> getAllUsers() {
    return userRepository.findAll();
  }

  public Users getUserById(Long userId) {
    return userRepository.findById(userId)
      .orElseThrow(() -> new UserNotFoundException("User with id " + userId + " was not found"));
  }

  public Users updateUser(Users user) {
    return userRepository.save(user);
  }

  public void deleteUser(Long userId) {
    userRepository.deleteById(userId);
  }
}

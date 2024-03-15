package localhost.moviemanager.repo;

import localhost.moviemanager.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import localhost.moviemanager.model.Users;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {


  Optional<Movies> findMovieById(Long id);
}

package localhost.moviemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import localhost.moviemanager.model.Movies;

import java.util.Optional;

public interface MoviesRepo extends JpaRepository<Movies, Long> {
  void deleteMoviesById(Long id);
  Optional<Movies> findMovieById(Long id);

  // Additional methods based on your specific needs
  // (e.g., findByMovieCode, findByGenre)
}

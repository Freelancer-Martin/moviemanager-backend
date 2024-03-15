package localhost.moviemanager.service;

import jakarta.transaction.Transactional;
import localhost.moviemanager.exception.UserNotFoundException;
import localhost.moviemanager.model.Movies;
import localhost.moviemanager.repo.MoviesRepo;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
@Transactional
public class MoviesService {

  private final MoviesRepo moviesRepo;

  public MoviesService(MoviesRepo movieRepo) { // Constructor with proper naming
    this.moviesRepo = movieRepo;
  }

  public List<Movies> addMovie(List<Movies> movies) {
    // Consider generating unique movie code logic, if needed
    return moviesRepo.saveAll(movies);
  }

  public List<Movies> getAllMovies() {
    return moviesRepo.findAll();
  }

  public Movies updateMovie(Movies movie) {
    return moviesRepo.save(movie);
  }

  public Movies getMovieById(Long movieId) {
    return moviesRepo.findMovieById(movieId)
      .orElseThrow(() -> new UserNotFoundException("Movie with id " + movieId + " was not found"));
  }

  public void deleteMovie(Long movieId) {
    moviesRepo.deleteMoviesById(movieId);
  }
}

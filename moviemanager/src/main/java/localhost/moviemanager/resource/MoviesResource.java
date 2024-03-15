package localhost.moviemanager.resource;

import localhost.moviemanager.model.Movies;
import localhost.moviemanager.service.MoviesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
@CrossOrigin("http://localhost:8081")
public class MoviesResource {

  private final MoviesService movieService;

  public MoviesResource(MoviesService movieService) {
    this.movieService = movieService;
  }

  @GetMapping("/all")
  public ResponseEntity<List<Movies>> getAllMovies() {
    List<Movies> movies = movieService.getAllMovies();
    return new ResponseEntity<>(movies, HttpStatus.OK);
  }

  @GetMapping("/find/{movieId}")
  public ResponseEntity<Movies> getMovieById(@PathVariable("movieId") Long movieId) {
    Movies movie = movieService.getMovieById(movieId);
    return new ResponseEntity<>(movie, HttpStatus.OK);
  }

  @PostMapping("/add")
  public ResponseEntity<List<Movies>> addMovie(@RequestBody Movies movie) {
    List<Movies> newMovie = movieService.addMovie(Collections.singletonList(movie));
    return new ResponseEntity<>(newMovie, HttpStatus.CREATED);
  }

  @PutMapping("/update")
  public ResponseEntity<Movies> updateMovie(@RequestBody Movies movie) {
    Movies updatedMovie = movieService.updateMovie(movie);
    return new ResponseEntity<>(updatedMovie, HttpStatus.OK);
  }

  @DeleteMapping("/delete/{movieId}")
  public ResponseEntity<?> deleteMovie(@PathVariable("movieId") Long movieId) {
    movieService.deleteMovie(movieId);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}

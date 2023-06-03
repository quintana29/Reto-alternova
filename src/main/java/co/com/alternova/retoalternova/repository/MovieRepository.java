package co.com.alternova.retoalternova.repository;

import co.com.alternova.retoalternova.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}

package co.com.alternova.retoalternova.service;

import co.com.alternova.retoalternova.model.Movie;
import co.com.alternova.retoalternova.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {


    @Autowired
    private MovieRepository movieRepository;


    @Transactional(readOnly = true)
    public List<Movie> findAll() {
        return (List<Movie>) movieRepository.findAll();
    }


}

package co.com.alternova.retoalternova.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String genre;

    private String type;

    private Integer viewsNumber;

    private Float score;


}

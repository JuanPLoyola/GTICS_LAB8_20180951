package com.example.demo.Dao;


import com.example.demo.Entity.Peliculas;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PeliculasDao {

    public List<Peliculas> listar(){
     List<Peliculas> lista = new ArrayList<>();

     String token="eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJlODhlMTQ2YzcwZDgyMWZjYzYzNzA5NzViNWZlMzRiYyIsInN1YiI6IjY2NjkwMjc4MTcwMGEwMGFhNTFkZGFkOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.1UdT-TDzIUQD4E7n0ED8O9C4YDI68Flm1QNCmq5_-JM";

     RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
    headers.set("Authorization","Bearer " + token);

    HttpEntity<Peliculas[]> peliculas = new HttpEntity<>(headers);

    String api = "https://api.themoviedb.org/3/movie/now_playing?language=en-US&page=1";
    ResponseEntity<Peliculas[]> response = restTemplate.exchange(api, HttpMethod.GET,peliculas,Peliculas[].class);


    return Arrays.asList(response.getBody());
}

}

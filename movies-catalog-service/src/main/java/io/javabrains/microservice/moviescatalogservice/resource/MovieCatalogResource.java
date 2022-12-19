package io.javabrains.microservice.moviescatalogservice.resource;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import io.javabrains.microservice.moviescatalogservice.models.CatalogItem;
import io.javabrains.microservice.moviescatalogservice.models.Movie;
import io.javabrains.microservice.moviescatalogservice.models.Rating;
import io.javabrains.microservice.moviescatalogservice.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private WebClient.Builder webClientBuilder;

	private Collection<CatalogItem> rating;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userId) {


	//get all rated movie IDs

		UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/" + userId, UserRating.class);

		return ratings.getUserRating().stream().map(rating -> {
//			For each movie ID, call movie info service and get details
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/ " + rating.getMovieId(),Movie.class);

//			Put them all together
			return new CatalogItem(movie.getName(), "Desc", rating.getRating());
			})
				.collect(Collectors.toList());



	}

}
  /* Movie movie = webClientBuilder.build()
            .get()
            .uri("http://localhost:8082/movies/ " + rating.getMovieId())
            .retrieve()
            .bodyToMono(Movie.class)
            .block();
   */

package cl.springmachine.jokes

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class JokesSpringBootApplication

fun main(args: Array<String>) {
	runApplication<JokesSpringBootApplication>(*args)
}

@JsonIgnoreProperties
data class Joke(val joke:String, val lang:String)

@RestController
@RequestMapping("/api")
class JokeController {

	@GetMapping("/jokes")
	fun sayJoke(): Joke? {
		return Joke(joke = "its all good man", lang = "english")
	}
}

package tech.chillo.sa;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "sa",  produces=MediaType.APPLICATION_JSON_VALUE)
public class SaController {

	@GetMapping
	public List<Object> search() {
		return List.of(new Sa(1L, "belle formation", "1"));
	}

}

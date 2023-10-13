package csrng.clientserverng;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/rng")
public class DeckApi {
	@GetMapping("/id")
	@Operation(summary = "Busca a proxima carta do baralho.")
	@ResponseBody
	public Double acharProcesso(@RequestParam Long id) {
		// return servico.achaPorIdETipoDocs(id, docs, bens, rpfs);
		return Math.random();
	}
}
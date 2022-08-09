package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
    // o indice é a posição
    List<String> pokemons = new ArrayList<>();
    @GetMapping
    public String home(){
        return "Bem vindos a API Pokemon" +
                "\n Total de cadastros: "+pokemons.size();
    }
    @GetMapping("/cadastrar/{pokemon}")
    public String cadastrar(@PathVariable String pokemon){
        pokemons.add(pokemon);
        return String.format("Pokemon %s cadastrado!", pokemon);
    }
    @GetMapping("/recuperar/{indice}")
    public String recuperar(@PathVariable int indice){
        if (indice < 0 || indice >= pokemons.size()){
            return "Pokemon não encontrado";
        }
        return pokemons.get(indice);
    }
    @GetMapping("/excluir/{indice}")
    public String atualizar(@PathVariable int indice){
        if (indice < 0 || indice >= pokemons.size()){
            return "Pokemon não encontrado";
        }
        pokemons.remove(indice);
        return "Excluido!";
    }
    @GetMapping("/atualizar/{indice}/{novoNome}")
    public String atualizar(@PathVariable int indice, @PathVariable String novoNome){
        if (indice < 0 || indice >= pokemons.size()){
            return "Pokemon não encontrado";
        }
        pokemons.set(indice,novoNome);
        return "Atualizado!";
    }

}

package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois")
public class HeroiController {
    private List<Heroi> herois = new ArrayList<>(List.of(
            new Heroi("Batatinhas", "Batatão",100.0,true),
            new Heroi("Batatinhas", "Batatão",100.0,true),
            new Heroi("Batatinhas", "Batatão",100.0,true)
    ));
    @GetMapping("/favorito")
    public Heroi heroiFavorito(){
        Heroi heroiFavorito = new Heroi("Batatinhas", "Batatão",100.0,true);
        return heroiFavorito;
    }

    @GetMapping("/herois")
    public List<Heroi> getHerois(){
        return herois;
    }

    @GetMapping("/{indice}")
    public Heroi indice(@PathVariable int indice){
        if (indice >= 0 && indice < herois.size()){
            return herois.get(indice);
        }
        return null;
    }

    @GetMapping("/cadastrar/{nome}/{poder}/{forca}/{vivo}")
    public Heroi cadastrar(@PathVariable String nome,@PathVariable String poder,@PathVariable double forca, @PathVariable boolean vivo){
        Heroi novoHeroi = new Heroi(nome,poder,forca,vivo);
        herois.add(novoHeroi);
        return novoHeroi;
    }

    @GetMapping("/atualizar/{indice}/{nome}/{poder}/{forca}/{vivo}")
    public Heroi atualizar(@PathVariable int indice,@PathVariable String nome,@PathVariable String poder,@PathVariable double forca, @PathVariable boolean vivo){
        if (indice >= 0 && indice < herois.size()){
            Heroi heroiAtualizado = new Heroi(nome,poder,forca,vivo);
            herois.set(indice,heroiAtualizado);
            return heroiAtualizado;
        }
        return null;
    }

}

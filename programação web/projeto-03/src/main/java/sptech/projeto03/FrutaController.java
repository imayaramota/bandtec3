package sptech.projeto03;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/frutas")
public class FrutaController {
    private List<Fruta> listaFrutas = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Fruta>> getFruta(){
        // empty == se estiver vazio
        if (listaFrutas.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(listaFrutas);
    }
    @PostMapping("/favorita")
    public ResponseEntity<Fruta> favorita(){
        Fruta frutaFav = new Fruta("Uva",9.99);
        listaFrutas.add(frutaFav);
        return ResponseEntity.status(201).body(frutaFav);
    }
    @GetMapping("/{posicao}")
    public ResponseEntity<Fruta> getposicao(@PathVariable int posicao){
            if (posicao >= 0 && posicao < listaFrutas.size()){
                return ResponseEntity.status(200).body(listaFrutas.get(posicao));
            }
            return ResponseEntity.status(404).build();
    }
    @PostMapping
    public ResponseEntity post(@RequestBody Fruta novaFruta){
        if (novaFruta.getNome()==null || novaFruta.getNome().isBlank()){
            return ResponseEntity.status(400).body("Nome deve ter pelo menos uma 1 letra");
        }
        if (novaFruta.getPreco()!=null || novaFruta.getPreco() < 0.0){
            return ResponseEntity.status(400).body("Preço deve ser > 0.00");
        }
        listaFrutas.add(novaFruta);
        return ResponseEntity.status(201).body(novaFruta);
    }

}

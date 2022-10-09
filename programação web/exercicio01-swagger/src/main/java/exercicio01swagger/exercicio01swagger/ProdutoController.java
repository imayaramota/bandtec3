package exercicio01swagger.exercicio01swagger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private List<Produto> produtos = new ArrayList<>();

    @PostMapping
    public ResponseEntity postUsuario(@RequestBody Produto novoProduto) {
        if (novoProduto.isValido()) {
            produtos.add(novoProduto);
            return ResponseEntity.status(201).body(novoProduto);
        }
        return ResponseEntity.status(400)
                .body("nome deve ter 2+ letras,  precoUnitario e quantidadeEstoque deve ser maior que 0.01");
    }
    @GetMapping
    public ResponseEntity<List<Produto>> getProdutos() {
        return produtos.isEmpty()
                ? ResponseEntity.status(204).build()
                : ResponseEntity.status(200).body(produtos);
    }
    @DeleteMapping("/{posicao}")
    public ResponseEntity<Produto> delete(@PathVariable int posicao) {
        if (posicao >= 0 && posicao < produtos.size()){
            Produto guardaProduto = produtos.get(posicao);
            produtos.remove(posicao);
            return ResponseEntity.status(200).body(guardaProduto);
        }
        return ResponseEntity.status(404).build();
    }


}

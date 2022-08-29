package sptech.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {
    public List<Investimento> investimentos = new ArrayList<>();

    @GetMapping // método:GET --> URI /investimentos
    public List<Investimento> getInvestimentos() {
        return investimentos;
    }

    @PostMapping // método:POST --> URI /investimentos
    public Investimento postInvestimento(@RequestBody Investimento novoInvestimento){
        investimentos.add(novoInvestimento);
        return novoInvestimento;
    }

    @GetMapping ("/{posicao}")// método:GET
    public Investimento get(@PathVariable int posicao){
        return investimentos.get(posicao);
    }

    @DeleteMapping ("/{posicao}")// método:DELETE
    public Investimento delete(@PathVariable int posicao){
        return investimentos.remove(posicao);
    }

    @PutMapping ("/{posicao}")// método:PUT
    public Investimento put(@PathVariable int posicao, @RequestBody Investimento novoInvestimento){
        investimentos.set(posicao,novoInvestimento);
        return novoInvestimento;
    }
}

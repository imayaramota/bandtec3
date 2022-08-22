package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/revisao")
public class RevisaoController {
    @GetMapping("/pode-votar/{idade}")
    public boolean podeVotar(@PathVariable int idade){

        return idade >= 16;
    }

    @GetMapping("/imc/{peso}/{altura}")
    public double imc(@PathVariable double peso, @PathVariable double altura){

        return peso / Math.pow(altura,2);
    }

    @GetMapping("/analise-campanha/{vitorias}/{empates}/derrotas")
    public String analiseCampanha(@PathVariable int vitorias, @PathVariable int empates, @PathVariable int derrotas){
        int pontosPossiveis = (vitorias + empates + derrotas) * 3;
        int pontosObtidos = vitorias * 3 + empates;
        double aproveitamentos = (double)pontosObtidos / pontosPossiveis * 100;
        return String.format("A campanha do time foi de %d", aproveitamentos);
    }



}

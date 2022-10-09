package com.example.treinamentoprova01;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/grifes")
public class GrifesController {
    private List<Grifes> grifes = new ArrayList<>();

    @PostMapping
    public Grifes post(@RequestBody Grifes novaGrife) {
        grifes.add(novaGrife);
        return novaGrife;
    }

    @GetMapping
    public List<Grifes> getTodasGrifes(){
        return grifes;
    }

    @PutMapping("/{posicao}")
    public Grifes put(@PathVariable int posicao, @RequestBody Grifes grifeAtualizada) {
        if (posicao >= 0 && posicao < grifes.size()) {
            grifes.set(posicao, grifeAtualizada);
            return grifeAtualizada;
        }
        return null;
    }

    @DeleteMapping("/{posicao}")
    public String delete(@PathVariable int posicao) {
        if (posicao >= 0 && posicao < grifes.size()) {
            grifes.remove(posicao);
            return "Grife excluída";
        }
        return "Não encontrada";
    }


}


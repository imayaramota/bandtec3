package sptech.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cantores")
public class CantoresController {
    public List<Cantores> cantores = new ArrayList<>();

    @GetMapping // método:GET --> URI /cantores
    public List<Cantores> getCantores() {
        return cantores;
    }

    @PostMapping // método:POST
    public Cantores postCantor(@RequestBody Cantores novoCantor){
        novoCantor.setId(cantores.size()+1);
        cantores.add(novoCantor);
        return novoCantor;
    }
    @GetMapping ("/{id}")// método:GET
    public Cantores getBuscaId(@PathVariable int id){
        return cantores.get(id);
    }
    @GetMapping ("/celebridades")// método:GET
    public List<Cantores> getCelebridade(){
        List<Cantores> celebridades = new ArrayList<>();
        for (Cantores cantorDaVez: cantores) {
            if (cantorDaVez.getCache() > 100_00) {
                celebridades.add(cantorDaVez);
            }
        }
        return celebridades;
    }
}

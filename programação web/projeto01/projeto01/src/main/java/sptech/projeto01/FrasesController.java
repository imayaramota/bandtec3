package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class FrasesController {
    @GetMapping
    public String cumprimentar(){
        return "somos uma api rest";
    }
    @GetMapping("/despedida")
    public String despedir(){
        return "bye bye";
    }
    @GetMapping("/elogio")
    public String elogio(){
        return "você fez o minimo!";
    }
    @GetMapping("/soma/{n1}/{n2}")
    public String somar(@PathVariable int n1, @PathVariable int n2){
        return String.format("%d + %d + é igual a %d", n1, n2, n1 + n2);
    }
    //exercicios
    @GetMapping("/maior/{n1}/{n2}")
    public String maiorNumero(@PathVariable double n1, @PathVariable double n2){
        double maiorNum;
        if (n1 > n2){
            maiorNum=n1;
        }
        else{
            maiorNum=n2;
        }
        return String.format("este é o número de valor mais alto: %s", maiorNum);
    }
    @GetMapping("/sorteio/{n1}")
    public String sorteio(@PathVariable int n1){
       if (ThreadLocalRandom.current().nextInt(0,10) == n1){
            return "parabéns, que sorte!";
       }
        return String.format("deu ruim!!");
    }


}

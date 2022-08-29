 public abstract class FuncionarioBonus {
        private String nome;
        private int quantAulasSemanal;
        private double valorHoraPorAula;

     public FuncionarioBonus(String nome, int quantAulasSemanal, double valorHoraPorAula) {
         this.nome = nome;
         this.quantAulasSemanal = quantAulasSemanal;
         this.valorHoraPorAula = valorHoraPorAula;
     }

     public String getNome() {
         return nome;
     }

     public int getQuantAulasSemanal() {
         return quantAulasSemanal;
     }

     public double getValorHoraPorAula() {
         return valorHoraPorAula;
     }

     public abstract Double getValorBonus();

     @Override
     public String toString() {
         return "FuncionarioBonus{" +
                 "nome:'" + nome + '\'' +
                 ", quantAulasSemanal:" + quantAulasSemanal +
                 ", valorHoraPorAula:" + valorHoraPorAula +
                 '}';
     }
 }

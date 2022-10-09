public class App {
    public static void main(String[] args) {
        // Criação dos objetos
        Engenheiro eng = new Engenheiro("1234","Fulado de Alcantara",15000.0);
        Vendedor vend = new Vendedor("4321","Cilhano de Almeida",30000.0,0.10);
        Horista horist = new Horista("5678","Beutrano de Carvalho",40,100.0);

        Empresa emp = new Empresa();

        emp.addFuncionarios(eng);
        emp.addFuncionarios(vend);
        emp.addFuncionarios(horist);
        emp.exibeTodos();
        emp.exibeTotalSalario();
        emp.exibeHoristas();
    }
}

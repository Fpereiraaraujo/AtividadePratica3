
class Estagiario extends Funcionario implements Trabalhavel {
    private int horasTrabalhadas;
    private String supervisor;

    
    public Estagiario(String nome, int matricula, int horasTrabalhadas, String supervisor) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.supervisor = supervisor;
    }


    @Override
    public double calcularSalario() {
       
        return 0; 
    }

    
    @Override
    public void trabalhar() {
        
    }

    @Override
    public void relatarProgresso() {
       
    }
}

// Interface Trabalhavel
interface Trabalhavel {
    void trabalhar();
    void relatarProgresso();
}
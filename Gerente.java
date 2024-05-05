// Classe Gerente
class Gerente extends Funcionario implements Trabalhavel {
    private double bonusAnual;
    private String equipe;

  
    public Gerente(String nome, int matricula, double bonusAnual, String equipe) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;
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

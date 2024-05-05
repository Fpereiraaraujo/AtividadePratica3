// Classe Desenvolvedor
class Desenvolvedor extends Funcionario implements Trabalhavel {
    private ArrayList<String> tecnologias;

   
    public Desenvolvedor(String nome, int matricula, ArrayList<String> tecnologias) {
        super(nome, matricula);
        this.tecnologias = tecnologias;
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
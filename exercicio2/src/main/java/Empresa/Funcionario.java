package Empresa;

class Funcionario {
    protected String nome;
    protected int matricula;
    protected float salarioBase;
    protected int dataAdmissao;

    public Funcionario(String nome, int matricula, float salarioBase, int dataAdmissao){
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }

    public float calcularSalario(){
        return salarioBase;
    }

    public float calcularDesconto(){
        float desconto = 8 % salarioBase;
        return desconto;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salarioBase=" + salarioBase +
                ", dataAdmissao=" + dataAdmissao +
                '}';
    }
}

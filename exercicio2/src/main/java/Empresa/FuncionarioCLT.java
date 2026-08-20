package Empresa;

public class FuncionarioCLT extends Funcionario{
    protected float valeTransporte;
    protected float valeAlimentacao;

    public FuncionarioCLT(float valeTransporte, float valeAlimentacao, String nome, int matricula, float salarioBase, int dataAdmissao) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    @Override
    public float calcularSalario() {
        return super.salarioBase + valeTransporte + valeAlimentacao;
    }

    @Override
    public float calcularDesconto() {
        return (super.calcularDesconto() + 50);
    }
}

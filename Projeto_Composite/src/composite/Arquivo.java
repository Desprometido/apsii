package composite;

public class Arquivo implements ComponenteArquivo {

    private final String nome;
    private final long tamanhoEmBytes;

    public Arquivo(String nome, long tamanhoEmBytes) {
        if (tamanhoEmBytes < 0) {
            throw new IllegalArgumentException("O tamanho do arquivo não pode ser negativo.");
        }
        this.nome = nome;
        this.tamanhoEmBytes = tamanhoEmBytes;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public long getTamanho() {
        return this.tamanhoEmBytes;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.printf("%s[ARQ] %s (%d bytes)%n", prefixo, this.nome, this.tamanhoEmBytes);
    }
}

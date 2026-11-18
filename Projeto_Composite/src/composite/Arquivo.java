package composite;

/**
 * Classe Leaf (Folha): representa um objeto folha na composição em árvore.
 * Um elemento folha não possui filhos; ele executa o trabalho concreto diretamente.
 * 
 * No contexto do sistema de arquivos, um Arquivo possui nome e tamanho fixo.
 */
public class Arquivo implements ComponenteArquivo {

    private final String nome;
    private final long tamanhoEmBytes;

    /**
     * Construtor do Arquivo.
     * 
     * @param nome Nome do arquivo (ex.: "documento.pdf").
     * @param tamanhoEmBytes Tamanho do arquivo em bytes.
     */
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

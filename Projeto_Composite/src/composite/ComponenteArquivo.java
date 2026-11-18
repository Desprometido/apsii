package composite;

/**
 * Interface Component: define as operações comuns tanto para objetos simples (folhas)
 * quanto para objetos compostos (composites).
 * 
 * O cliente interage com a árvore utilizando esta interface unificada,
 * tratando folhas e nós compostos de maneira transparente.
 */
public interface ComponenteArquivo {

    /**
     * Retorna o nome do componente (arquivo ou diretório).
     * @return Nome do componente.
     */
    String getNome();

    /**
     * Retorna o tamanho em bytes do componente.
     * Para arquivos, é o tamanho individual.
     * Para diretórios, é o somatório do tamanho de todos os seus filhos.
     * 
     * @return Tamanho em bytes.
     */
    long getTamanho();

    /**
     * Exibe a estrutura hierárquica do componente com recuo/identação visual.
     * 
     * @param prefixo Prefixo textual para alinhamento em árvore.
     */
    void exibir(String prefixo);
}

package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe Composite: representa um contêiner (Diretório) que agrupa
 * componentes do tipo ComponenteArquivo (podendo ser folhas ou outros diretórios).
 * 
 * Demonstra a essência do padrão Composite: delega o cálculo e a exibição
 * para seus filhos recursivamente, permitindo tratar coleções e itens individuais
 * sob a mesma interface.
 */
public class Diretorio implements ComponenteArquivo {

    private final String nome;
    private final List<ComponenteArquivo> filhos;

    /**
     * Construtor do Diretório.
     * 
     * @param nome Nome do diretório.
     */
    public Diretorio(String nome) {
        this.nome = nome;
        this.filhos = new ArrayList<>();
    }

    /**
     * Adiciona um componente à lista de filhos.
     * 
     * @param componente Elemento a ser adicionado (Arquivo ou Diretório).
     */
    public void adicionar(ComponenteArquivo componente) {
        if (componente == null) {
            throw new IllegalArgumentException("O componente não pode ser nulo.");
        }
        if (componente == this) {
            throw new IllegalArgumentException("Um diretório não pode conter a si mesmo.");
        }
        this.filhos.add(componente);
    }

    /**
     * Remove um componente da lista de filhos.
     * 
     * @param componente Elemento a ser removido.
     */
    public void remover(ComponenteArquivo componente) {
        this.filhos.remove(componente);
    }

    /**
     * Retorna uma visão imutável dos filhos deste diretório.
     * 
     * @return Lista não-modificável de componentes filhos.
     */
    public List<ComponenteArquivo> getFilhos() {
        return Collections.unmodifiableList(this.filhos);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    /**
     * Calcula o tamanho total do diretório de forma recursiva.
     * Percorre todos os nós filhos e soma os seus respectivos tamanhos.
     * 
     * @return Somatório em bytes de todo o conteúdo do diretório.
     */
    @Override
    public long getTamanho() {
        long total = 0;
        for (ComponenteArquivo filho : filhos) {
            total += filho.getTamanho(); // Chamada polimórfica e recursiva
        }
        return total;
    }

    /**
     * Exibe o diretório e seus elementos filhos de maneira estruturada.
     * 
     * @param prefixo Recuo/indentação textual.
     */
    @Override
    public void exibir(String prefixo) {
        System.out.printf("%s[DIR] %s/ (Total: %d bytes)%n", prefixo, this.nome, this.getTamanho());
        for (ComponenteArquivo filho : filhos) {
            filho.exibir(prefixo + "    ");
        }
    }
}

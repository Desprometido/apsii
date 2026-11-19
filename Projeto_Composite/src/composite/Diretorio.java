package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Diretorio implements ComponenteArquivo {

    private final String nome;
    private final List<ComponenteArquivo> filhos;

    
    public Diretorio(String nome) {
        this.nome = nome;
        this.filhos = new ArrayList<>();
    }

    
    public void adicionar(ComponenteArquivo componente) {
        if (componente == null) {
            throw new IllegalArgumentException("O componente não pode ser nulo.");
        }
        if (componente == this) {
            throw new IllegalArgumentException("Um diretório não pode conter a si mesmo.");
        }
        this.filhos.add(componente);
    }

    
    public void remover(ComponenteArquivo componente) {
        this.filhos.remove(componente);
    }

    
    public List<ComponenteArquivo> getFilhos() {
        return Collections.unmodifiableList(this.filhos);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    
    @Override
    public long getTamanho() {
        long total = 0;
        for (ComponenteArquivo filho : filhos) {
            total += filho.getTamanho();
        }
        return total;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.printf("%s[DIR] %s/ (Total: %d bytes)%n", prefixo, this.nome, this.getTamanho());
        for (ComponenteArquivo filho : filhos) {
            filho.exibir(prefixo + "    ");
        }
    }
}

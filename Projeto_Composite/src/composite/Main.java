package composite;

/**
 * Classe de Demonstração (Client).
 * 
 * Demonstra como o cliente pode interagir com elementos simples (Arquivo)
 * e compostos (Diretório) de forma uniforme por meio da interface ComponenteArquivo.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("  SISTEMA DE GERENCIAMENTO DE ARQUIVOS (PADRAO COMPOSITE)  ");
        System.out.println("============================================================\n");

        // 1. Criacao de arquivos individuais (Folhas / Leaves)
        ComponenteArquivo arqReadme = new Arquivo("README.md", 2_500); // 2.5 KB
        ComponenteArquivo arqGitignore = new Arquivo(".gitignore", 500);

        ComponenteArquivo arqJava1 = new Arquivo("ComponenteArquivo.java", 1_200);
        ComponenteArquivo arqJava2 = new Arquivo("Arquivo.java", 1_800);
        ComponenteArquivo arqJava3 = new Arquivo("Diretorio.java", 2_400);
        ComponenteArquivo arqJava4 = new Arquivo("Main.java", 3_100);

        ComponenteArquivo relatorioPdf = new Arquivo("Relatorio_Composite.pdf", 150_000); // 150 KB
        ComponenteArquivo diagramaPng = new Arquivo("diagrama_uml.png", 85_000);         // 85 KB

        // 2. Criacao de subdiretorios (Composites intermediarios)
        Diretorio dirSrc = new Diretorio("src");
        dirSrc.adicionar(arqJava1);
        dirSrc.adicionar(arqJava2);
        dirSrc.adicionar(arqJava3);
        dirSrc.adicionar(arqJava4);

        Diretorio dirDocs = new Diretorio("docs");
        dirDocs.adicionar(relatorioPdf);
        dirDocs.adicionar(diagramaPng);

        // 3. Criacao do diretorio raiz do projeto (Composite raiz)
        Diretorio dirProjeto = new Diretorio("projeto-aps2");
        dirProjeto.adicionar(dirSrc);
        dirProjeto.adicionar(dirDocs);
        dirProjeto.adicionar(arqReadme);
        dirProjeto.adicionar(arqGitignore);

        // 4. Exibicao da estrutura completa em arvore
        System.out.println("--- Estrutura Hierarquica do Projeto Completo ---");
        dirProjeto.exibir("");

        System.out.println("\n------------------------------------------------------------");
        System.out.println("--- Transparencia no Uso do Componente (Polimorfismo) ---");
        System.out.println("O cliente trata tanto a folha quanto o composite da mesma forma:\n");

        // Chamando um metodo que recebe a interface generica
        imprimirEstatisticas(arqReadme);   // Tratando uma folha
        imprimirEstatisticas(dirSrc);       // Tratando um subdiretorio
        imprimirEstatisticas(dirProjeto);   // Tratando a raiz completa

        // 5. Demonstracao de dinamismo: remocao e recalculo automatico
        System.out.println("------------------------------------------------------------");
        System.out.println("--- Modificacao Dinamica: Removendo o diagrama_uml.png ---");
        dirDocs.remover(diagramaPng);

        System.out.println("Novo tamanho da pasta 'docs': " + dirDocs.getTamanho() + " bytes");
        System.out.println("Novo tamanho total do projeto: " + dirProjeto.getTamanho() + " bytes\n");

        System.out.println("--- Estrutura Atualizada do Projeto ---");
        dirProjeto.exibir("");

        System.out.println("\n============================================================");
        System.out.println("  Execucao concluida com sucesso!");
        System.out.println("============================================================");
    }

    /**
     * Método cliente que interage exclusivamente com a interface ComponenteArquivo,
     * evidenciando a transparência e o desacoplamento proporcionados pelo Composite.
     * 
     * @param componente Componente qualquer (Folha ou Composto).
     */
    public static void imprimirEstatisticas(ComponenteArquivo componente) {
        System.out.printf("Componente: '%s' | Tamanho Calculado: %d bytes%n",
                componente.getNome(), componente.getTamanho());
    }
}

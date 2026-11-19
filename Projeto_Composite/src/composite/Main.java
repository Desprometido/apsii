package composite;

public class Main {

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("  SISTEMA DE GERENCIAMENTO DE ARQUIVOS (PADRAO COMPOSITE)  ");
        System.out.println("============================================================\n");

        ComponenteArquivo arqReadme = new Arquivo("README.md", 2_500); // 2.5 KB
        ComponenteArquivo arqGitignore = new Arquivo(".gitignore", 500);

        ComponenteArquivo arqJava1 = new Arquivo("ComponenteArquivo.java", 1_200);
        ComponenteArquivo arqJava2 = new Arquivo("Arquivo.java", 1_800);
        ComponenteArquivo arqJava3 = new Arquivo("Diretorio.java", 2_400);
        ComponenteArquivo arqJava4 = new Arquivo("Main.java", 3_100);

        ComponenteArquivo relatorioPdf = new Arquivo("Relatorio_Composite.pdf", 150_000); // 150 KB
        ComponenteArquivo diagramaPng = new Arquivo("diagrama_uml.png", 85_000);         // 85 KB

        Diretorio dirSrc = new Diretorio("src");
        dirSrc.adicionar(arqJava1);
        dirSrc.adicionar(arqJava2);
        dirSrc.adicionar(arqJava3);
        dirSrc.adicionar(arqJava4);

        Diretorio dirDocs = new Diretorio("docs");
        dirDocs.adicionar(relatorioPdf);
        dirDocs.adicionar(diagramaPng);

        Diretorio dirProjeto = new Diretorio("projeto-aps2");
        dirProjeto.adicionar(dirSrc);
        dirProjeto.adicionar(dirDocs);
        dirProjeto.adicionar(arqReadme);
        dirProjeto.adicionar(arqGitignore);

        System.out.println("--- Estrutura Hierarquica do Projeto Completo ---");
        dirProjeto.exibir("");

        System.out.println("\n------------------------------------------------------------");
        System.out.println("--- Transparencia no Uso do Componente (Polimorfismo) ---");
        System.out.println("O cliente trata tanto a folha quanto o composite da mesma forma:\n");

        imprimirEstatisticas(arqReadme);
        imprimirEstatisticas(dirSrc);
        imprimirEstatisticas(dirProjeto);

        System.out.println("------------------------------------------------------------");
        System.out.println("--- Modificacao Dinamica: Removendo o diagrama.png ---");
        dirDocs.remover(diagramaPng);

        System.out.println("Novo tamanho da pasta 'docs': " + dirDocs.getTamanho() + " bytes");
        System.out.println("Novo tamanho total do projeto: " + dirProjeto.getTamanho() + " bytes\n");

        System.out.println("--- Estrutura Atualizada do Projeto ---");
        dirProjeto.exibir("");

        System.out.println("\n============================================================");
        System.out.println("  Execucao concluida com sucesso!");
        System.out.println("============================================================");
    }

    public static void imprimirEstatisticas(ComponenteArquivo componente) {
        System.out.printf("Componente: '%s' | Tamanho Calculado: %d bytes%n",
                componente.getNome(), componente.getTamanho());
    }
}

# Projeto APS II - Padrão de Projeto Composite em Java

Este repositório contém a implementação prática e o relatório técnico do padrão estrutural **Composite** em **Java**, desenvolvido para a disciplina de **Análise e Projeto de Sistemas II**.

---

## 📁 Estrutura do Projeto

```text
projeto2/
├── bin/                          # Bytecodes compilados (.class)
├── src/
│   └── composite/
│       ├── ComponenteArquivo.java # Interface Component
│       ├── Arquivo.java           # Classe Leaf (Folha)
│       ├── Diretorio.java         # Classe Composite (Composto)
│       └── Main.java              # Classe Client de demonstração
├── RELATORIO_COMPOSITE.md        # Relatório acadêmico completo com UML, prós e contras
└── README.md                     # Guia rápido de execução
```

---

## 🚀 Como Compilar e Executar

### Pré-requisito:
- Java JDK instalado (versão 8 ou superior).

### 1. Compilar os arquivos:
```bash
javac -d bin src/composite/*.java
```

### 2. Executar a aplicação:
```bash
java -cp bin composite.Main
```

---

## 📄 Relatório Completo
Consulte o arquivo [`RELATORIO_COMPOSITE.md`](file:///c:/Users/55819/Documents/ADS%202025/4_periodo/Raul/projeto2/RELATORIO_COMPOSITE.md) para ver a fundamentação teórica, diagrama de classes UML, particularidades de design (Transparência vs. Segurança), análise de vantagens e desvantagens e referências bibliográficas.

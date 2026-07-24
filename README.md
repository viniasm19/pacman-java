# 🕹️ Pac-Man em Java

## 📌 Contexto

Projeto Integrador do curso de Análise e Desenvolvimento de Sistemas do Centro Universitário Senac.

## 🎯 Objetivo

Desenvolvimento de um jogo digital baseado no clássico arcade Pac-Man, implementado em Java para execução em terminal/console. O projeto demonstra a aplicação de conceitos de programação orientada a objetos, estruturas de dados, manipulação de arquivos e lógica de jogo.

## 🛠️ Tecnologias

- Java 11+
- `Scanner` (entrada de dados do usuário)
- Arrays bidimensionais (labirinto)
- Manipulação de arquivos (salvamento de recordes)
- `Random` (movimento dos fantasmas)

## 🎮 Características do jogo

- **Interface:** Terminal/Console (modo texto)
- **Labirinto:** Grade 15x20 com paredes e corredores
- **Personagens:**
  - Pac-Man (`C`): controlado pelo jogador
  - 4 Fantasmas (`F`): movimento aleatório
- **Itens:**
  - Bolinhas (`.`): 10 pontos cada
  - Power Pellets (`O`): 50 pontos + torna fantasmas vulneráveis
- **Sistema de vidas:** 3 vidas iniciais
- **Sistema de níveis:** progressão com aumento de dificuldade
- **Recordes:** Top 3 melhores pontuações salvas em arquivo

## 🎮 Como jogar

### Controles

- **W** — mover para cima
- **S** — mover para baixo
- **A** — mover para esquerda
- **D** — mover para direita
- **P** — pausar o jogo

### Objetivo do jogo

Coletar todas as bolinhas do labirinto sem ser capturado pelos fantasmas. Colete Power Pellets para tornar os fantasmas vulneráveis e comê-los por pontos extras!

### Pontuação

- Bolinha comum: 10 pontos
- Power Pellet: 50 pontos
- Fantasma capturado: 200 pontos
- Bônus por completar nível: 1000 pontos

## 📁 Estrutura do projeto

```
pacman-java/
├── src/
│   ├── GameManager.java    # Classe principal e menu
│   ├── Jogo.java           # Lógica do jogo
│   └── Recordes.java       # Sistema de recordes
├── bin/                     # Arquivos compilados
├── recordes.txt            # Arquivo de recordes (gerado automaticamente)
└── README.md
```

## 🚀 Como executar

### Opção 1: Via IDE (VS Code, IntelliJ, Eclipse)

1. Abra o projeto na IDE
2. Execute o arquivo `GameManager.java`
3. O jogo abrirá no terminal integrado

### Opção 2: Via terminal/prompt de comando

1. Navegue até a pasta `src`:

```bash
cd pacman-java/src
```

2. Compile os arquivos:

```bash
javac GameManager.java Jogo.java Recordes.java
```

3. Execute o jogo:

```bash
java GameManager
```

## ✅ Funcionalidades implementadas

### Requisitos funcionais

- ✅ RF01: Menu Principal (Novo Jogo, Recordes, Instruções, Sair)
- ✅ RF02: Movimentação do Pac-Man via comandos de teclado
- ✅ RF03: Colisão com paredes
- ✅ RF04: Coleta de itens (bolinhas e power pellets)
- ✅ RF05: Comportamento dos fantasmas (movimento aleatório)
- ✅ RF06: Power-Up (modo vulnerável)
- ✅ RF07: Sistema de vidas
- ✅ RF08: Progressão de níveis
- ✅ RF09: Exibição de informações (score, vidas, nível)
- ✅ RF10: Sistema de pausa
- ✅ RF11: Tela de Game Over
- ✅ RF12: Registro de recordes em arquivo
- ✅ RF13: Tela de instruções

### Requisitos não funcionais

- ✅ RNF04: Portabilidade (Java 11+)
- ✅ RNF05: Código orientado a objetos
- ✅ RNF06: Tratamento de exceções
- ✅ RNF07: Funcionamento offline

## 📚 O que aprendi

### Conceitos de programação aplicados

- **Orientação a objetos:** classes, métodos, encapsulamento
- **Arrays bidimensionais:** representação do labirinto
- **Estruturas de controle:** if/else, switch, loops (for, while)
- **Manipulação de arquivos:** leitura e escrita de recordes
- **Tratamento de entrada:** `Scanner` para comandos do usuário
- **Aleatoriedade:** `Random` para movimento dos fantasmas
- **Lógica de colisão:** verificação de posições no labirinto

### Padrões de projeto aplicados

- **Singleton:** `GameManager` como ponto único de entrada
- **Separação de responsabilidades:** cada classe com função específica
  - `GameManager`: controle de menu e fluxo principal
  - `Jogo`: lógica do gameplay
  - `Recordes`: persistência de dados

### Por que terminal/console?

- Facilita o aprendizado de lógica de programação
- Foco nos conceitos fundamentais sem complexidade gráfica
- Execução simples e universal

### Simplicidade do código

O código foi desenvolvido priorizando:

- Clareza e legibilidade
- Conceitos adequados ao nível de aprendizado
- Facilidade de manutenção
- Demonstração prática de fundamentos

## 👥 Autores

- Ana Beatriz Santana
- Aparecida da Silva
- Beatriz Alcantara
- Giovanna Batista
- Jusley Carvalho
- Patrik Santos Silva
- Vinicius Melo

## 📄 Licença

Projeto acadêmico desenvolvido para fins educacionais — Centro Universitário Senac, 2025.

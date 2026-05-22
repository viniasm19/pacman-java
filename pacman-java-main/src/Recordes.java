import java.io.*;
import java.util.*;

public class Recordes {
    private static final String ARQUIVO = "recordes.txt";
    
    public void salvar(String nome, int pontuacao) {
        List<Recorde> recordes = carregar();
        recordes.add(new Recorde(nome, pontuacao));
        Collections.sort(recordes, (r1, r2) -> Integer.compare(r2.pontuacao, r1.pontuacao));
        
        if (recordes.size() > 10) {
            recordes = recordes.subList(0, 10);
        }
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO))) {
            for (Recorde recorde : recordes) {
                writer.println(recorde.nome + ";" + recorde.pontuacao);
            }
            System.out.println("\n💾 Pontuação salva com sucesso!");
        } catch (IOException e) {
            System.out.println("\n❌ Erro ao salvar recordes.");
        }
    }
    
    public List<Recorde> carregar() {
        List<Recorde> recordes = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    String nome = partes[0];
                    int pontuacao = Integer.parseInt(partes[1]);
                    recordes.add(new Recorde(nome, pontuacao));
                }
            }
        } catch (FileNotFoundException e) {
           
        } catch (IOException e) {
            System.out.println("❌ Erro ao carregar recordes.");
        }
        
        return recordes;
    }
    
    public void exibir(GameManager gameManager) {
        gameManager.limparTela();
        System.out.println("\n========================================");
        System.out.println("         MELHORES PONTUAÇÕES ");
        System.out.println("========================================\n");
        
        List<Recorde> recordes = carregar();
        
        if (recordes.isEmpty()) {
            System.out.println("  Nenhum recorde registrado ainda!");
            System.out.println("  Seja o primeiro a jogar!\n");
        } else {
            String[] medalhas = {"★", "★", "★"};
            for (int i = 0; i < Math.min(recordes.size(), 10); i++) {
                Recorde recorde = recordes.get(i);
                String medalha = (i < 3) ? medalhas[i] : "  ";
                System.out.printf("  %s  %dº - %-15s %d pontos\n", 
                                 medalha, (i + 1), recorde.nome, recorde.pontuacao);
            }
            System.out.println();
        }
        
        System.out.println("========================================");
        gameManager.esperarTecla();
    }
    
    // Classe interna para representar um recorde
    private class Recorde {
        String nome;
        int pontuacao;
        
        Recorde(String nome, int pontuacao) {
            this.nome = nome;
            this.pontuacao = pontuacao;
        }
    }
}
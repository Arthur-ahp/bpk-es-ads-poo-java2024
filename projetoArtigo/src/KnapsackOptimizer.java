package projetoArtigo.src;

import java.util.List;
import java.util.ArrayList;

public class KnapsackOptimizer {
    private int capacidade;

    public KnapsackOptimizer(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Item> optimize(List<Item> items) {
        int n = items.size();
        int[][] dp = new int[n + 1][capacidade + 1];

        for (int i = 1; i <= n; i++) {
            Item item = items.get(i - 1);
            for (int w = 1; w <= capacidade; w++) {
                if (item.getPeso() <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - item.getPeso()] + item.getValor());
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        List<Item> result = new ArrayList<>();
        int w = capacidade;
        for (int i = n; i > 0 && w > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                Item item = items.get(i - 1);
                result.add(item);
                w -= item.getPeso();
            }
        }
        return result;
    }
}
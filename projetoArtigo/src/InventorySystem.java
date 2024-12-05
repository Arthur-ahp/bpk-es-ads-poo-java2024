package projetoArtigo.src;

import java.util.List;
import java.util.ArrayList;

public class InventorySystem {
    private KnapsackOptimizer optimizer;

    public InventorySystem(int capacidade) {
        this.optimizer = new KnapsackOptimizer(capacidade);
    }

    public void optimizeStock(List<Item> items) {
        List<Item> selectedItems = optimizer.optimize(items);
        System.out.println("Itens selecionados:");
        for (Item item : selectedItems) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        InventorySystem system = new InventorySystem(50);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Mochila Dell", 10, 45));
        items.add(new Item("Relógio", 20, 120));
        items.add(new Item("Calça", 25, 130));
        items.add(new Item("Meia", 5, 25));
        items.add(new Item("Camisa", 15, 85));
        items.add(new Item("Tenis", 40, 250));



        system.optimizeStock(items);
    }
}

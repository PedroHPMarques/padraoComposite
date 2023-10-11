import java.util.ArrayList;
import java.util.List;

public class Produto extends Item {
    private List<Item> items;

    public Produto(String nome){
        super(nome);
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getItem(){
        String saida = "";
        saida = "Produto: " + this.getNome() + "\n";
        for (Item item : items){
            saida += item.getItem();
        }
        return saida;
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatalogoTest {

    @Test
    void deveRetornarItemCatalogo() {
        Produto produto1 = new Produto("Monitor");

        Produto produto2 = new Produto("Notebook");
        Marca marca21 = new Marca("Dell", 2500f);
        produto2.addItem(marca21);

        Produto produto3 = new Produto("Pc");
        Marca marca31 = new Marca("Dell", 3500f);
        Marca marca32 = new Marca("Asus", 4000f);
        produto3.addItem(marca31);
        produto3.addItem(marca32);

        Produto item = new Produto("Tecnologia");
        item.addItem(produto1);
        item.addItem(produto2);
        item.addItem(produto3);

        Catalogo catalogo = new Catalogo();
        catalogo.setItens(item);

        assertEquals("Produto: Tecnologia\n" +
                "Produto: Monitor\n" +
                "Produto: Notebook\n" +
                "Marca: Dell - preco: 2500.0\n" +
                "Produto: Pc\n" +
                "Marca: Dell - preco: 3500.0\n" +
                "Marca: Asus - preco: 4000.0\n", catalogo.getItem());
    }

    @Test
    void deveRetornarExecacaoCatalogoSemItem() {
        try {
            Catalogo catalogo = new Catalogo();
            catalogo.getItem();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Catalogo sem Item", e.getMessage());
        }
    }
}
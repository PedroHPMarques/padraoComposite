public class Marca extends Item {

    private float preco;
    public Marca(String nome, float preco){
        super(nome);
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getItem(){
        return "Marca: " + this.getNome() + " - preco: " + this.getPreco() + "\n";
    }
}

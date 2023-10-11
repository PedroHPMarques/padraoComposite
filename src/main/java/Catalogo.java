public class Catalogo {

    private Item item;

    public void setItens(Item item){
        this.item = item;
    }

    public String getItem(){
        if(this.item == null){
            throw new NullPointerException("Catalogo sem Item");
        }
        return this.item.getItem();
    }
}

public class HeladoSuaveConTopping implements Helado{
    protected Helado helado;

    protected String description = " con topping extra";
    protected int price = 20;

    public HeladoSuaveConTopping(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDescription(){
        return helado.getDescription() + description;
    }

    @Override
    public int getPrice(){
        return helado.getPrice() + price;
    }
}
public class HeladoSuaveConCobertura implements Helado {

    protected Helado helado;

    protected String description = " con cobertura extra";
    protected int price = 20;

    public HeladoSuaveConCobertura(Helado helado){
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
public class Carro{
    protected String marca;
    protected String modelo;
    protected String velocidadMaxima;


    public Carro(String marca,String modelo,String velocidadMaxima){

        this.marca=marca;
        this.modelo=modelo;
        this.velocidadMaxima=velocidadMaxima;

    }

    public void mostrarInformacion(){
        
        System.out.println("Carro");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Velocidad Maxima: "+this.velocidadMaxima);

    }
}
public class Marca extends Carro{
    protected String cilindrado;

    public Marca(String marca,String modelo,String velocidadMaxima,String cilindrado){
        super(marca,modelo,velocidadMaxima);
        this.cilindrado=cilindrado;
    }


    @Override
    public void mostrarInformacion(){
        System.out.println(".....................");
        System.out.println("Marca");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Velocidad Maxima: "+this.velocidadMaxima);
        System.out.println("Cilindraje: "+this.cilindrado);
    }

}
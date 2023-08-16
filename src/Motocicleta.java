
public class Motocicleta extends Vehiculos implements Conducible{
    private int cilindraje;
    private String tipo_de_manejo;

    public Motocicleta(int ruedas, String marca, String modelo,int cilindraje, String tipo_de_manejo){
        super(ruedas,marca,modelo);
        this.cilindraje= cilindraje;
        this.tipo_de_manejo= tipo_de_manejo;
    }

    @Override
    public String get_datos_vehiculo() {
        return "MOTOCICLETA\n"+ super.get_datos_vehiculo()+ "\nCilindraje: "+cilindraje +"\nManejo: "+ tipo_de_manejo ;
    }
    @Override
    public void conducir(){
        System.out.println("Estoy conduciendo desde Motocileta");
    }
}

public class Vehiculos {
   private int cantidad_ruedas;
   private String marca;
   private String modelo;
    public Vehiculos(int cantidad_ruedas, String marca, String modelo) {
        this.cantidad_ruedas = cantidad_ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }
    public String get_datos_vehiculo(){

        return "Marca: "+ marca+" \nModelo: "+ modelo
                +" \nCantidad de ruedas: " + cantidad_ruedas;

    }

}

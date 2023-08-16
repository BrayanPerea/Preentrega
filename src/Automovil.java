public class Automovil extends Vehiculos implements Conducible{

    private int numero_puertas;
    private String tipo_combustible;
    public Automovil(int cantidad_ruedas, String marca, String modelo, int numero_puertas, String tipo_combustible) {
        super(cantidad_ruedas, marca, modelo);
        this.numero_puertas=numero_puertas;
        this.tipo_combustible=tipo_combustible;
    }
    @Override
    public String get_datos_vehiculo() {
        return "Automovil\n"+ super.get_datos_vehiculo()+ "\nNumero de puertas: "+numero_puertas +"\nCombustible: "+ tipo_combustible ;
    }

    @Override
public void conducir() {
        System.out.println("Estoy conduciendo desde automovil");;
        }
}

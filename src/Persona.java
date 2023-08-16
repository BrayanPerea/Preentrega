public class Persona {
    private String nombre;
    private String apellido;
    private Vehiculos vehiculos;

    public Persona(String nombre, String apellido, Vehiculos vehiculos){
        this.nombre=nombre;
        this.apellido=apellido;
        this.vehiculos=vehiculos;
    }

    public String get_datos_persona(){
        return "El propietario del vehiculo es: "+ nombre+" "+ apellido
                +" y tiene el vehiculo: "+ vehiculos.get_datos_vehiculo() ;
    }
}

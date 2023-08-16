public class Main {
    public static void main(String[] args) {

    Motocicleta moto1= new Motocicleta(2,"Suzuki","2017", 125,"Rapido");
    Motocicleta moto2= new Motocicleta(2,"AKT","2021",150,"malo");
    Automovil carro1= new Automovil(4,"Toyota","2023",2,"Diesel");
    Automovil carro2 = new Automovil(3,"Triciclo","2000", 1, "Gasolina");

    Persona Juan = new Persona("Juan","Perez", moto1);
    Persona Andres = new Persona("Andres", "Sanchez", moto2);
    Persona Ana = new Persona("Ana", "Rodriguez", carro1);
    Persona Carolina = new Persona("Carolina", "Perea", carro2);


        System.out.println(Juan.get_datos_persona());
        moto1.conducir();

       System.out.println(Andres.get_datos_persona());
        moto2.conducir();

        System.out.println(Ana.get_datos_persona());
        carro1.conducir();

        System.out.println(Carolina.get_datos_persona());
        carro2.conducir();
    }
}
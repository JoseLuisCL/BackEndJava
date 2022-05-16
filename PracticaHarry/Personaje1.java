package PracticaHarry;

public class Personaje1 {
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        Personajes Personaje1 = new Personajes();
        Personaje1.setNombre("Harry James Potter");
        Personaje1.setGenero("Masculino");
        Personaje1.setCasa("Gryffindor");
        Personaje1.setBoggart("Dementor");
        Personaje1.setPatronus("Ciervo");

        String msg = "El personaje de Harry Potter es: ";
        msg += "\nNombre: "+Personaje1.getNombre();
        msg += "\nGenero: "+Personaje1.getGenero();
        msg += "\nCasa: "+Personaje1.getCasa();
        msg += "\nBoggart: "+Personaje1.getBoggart();
        msg += "\nPatronus: "+Personaje1.getPatronus();
        System.out.print(msg);
    }

    public static void show(){

    }

}

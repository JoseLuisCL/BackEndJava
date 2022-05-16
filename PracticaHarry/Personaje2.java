package PracticaHarry;

public class Personaje2 {
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        Personajes Personaje2 = new Personajes();
        Personaje2.setNombre("Hermione Jean Granger");
        Personaje2.setGenero("Femenino");
        Personaje2.setCasa("Gryffindor");
        Personaje2.setBoggart("La profesora McGonagall diciendole que reprobo todo");
        Personaje2.setPatronus("Nutria");

        String msg = "El personaje de Harry Potter es: ";
        msg += "\nNombre: "+Personaje2.getNombre();
        msg += "\nGenero: "+Personaje2.getGenero();
        msg += "\nCasa: "+Personaje2.getCasa();
        msg += "\nBoggart: "+Personaje2.getBoggart();
        msg += "\nPatronus: "+Personaje2.getPatronus();
        System.out.print(msg);
    }
}

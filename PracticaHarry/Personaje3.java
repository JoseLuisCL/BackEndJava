package PracticaHarry;

public class Personaje3 {
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        Personajes Personaje3 = new Personajes();
        Personaje3.setNombre("Ronald Bilius Weasley");
        Personaje3.setGenero("Masculino");
        Personaje3.setCasa("Gryffindor");
        Personaje3.setBoggart("Acromantula");
        Personaje3.setPatronus("Jack Russell Terrier");

        String msg = "El personaje de Harry Potter es: ";
        msg += "\nNombre: "+Personaje3.getNombre();
        msg += "\nGenero: "+Personaje3.getGenero();
        msg += "\nCasa: "+Personaje3.getCasa();
        msg += "\nBoggart: "+Personaje3.getBoggart();
        msg += "\nPatronus: "+Personaje3.getPatronus();
        System.out.print(msg);
    }
}

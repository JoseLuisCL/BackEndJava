package PracticaHarry;

public class Personaje4 {
    public static void main(String[] args) {
        def();
    }

    public static void def() {
        Personajes Personaje4 = new Personajes();
        Personaje4.setNombre("Albus Percival Wulfric Brian Dumbledore");
        Personaje4.setGenero("Masculino");
        Personaje4.setCasa("Gryffindor");
        Personaje4.setBoggart("El cuerpo de su hermana Ariana");
        Personaje4.setPatronus("Fenix");

        String msg = "El personaje de Harry Potter es: ";
        msg += "\nNombre: " + Personaje4.getNombre();
        msg += "\nGenero: " + Personaje4.getGenero();
        msg += "\nCasa: " + Personaje4.getCasa();
        msg += "\nBoggart: " + Personaje4.getBoggart();
        msg += "\nPatronus: " + Personaje4.getPatronus();
        System.out.print(msg);
    }
}
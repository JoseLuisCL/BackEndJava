package PracticaHarry;

public class Personaje5 {
    public static void main(String[] args) {
        def();
    }

    public static void def() {
        Personajes Personaje5 = new Personajes();
        Personaje5.setNombre("Tom Sorvolo Ryddle");
        Personaje5.setGenero("Masculino");
        Personaje5.setCasa("Slytherin");
        Personaje5.setBoggart("Su propia muerte");
        Personaje5.setPatronus("S/D");

        String msg = "El personaje de Harry Potter es: ";
        msg += "\nNombre: " + Personaje5.getNombre();
        msg += "\nGenero: " + Personaje5.getGenero();
        msg += "\nCasa: " + Personaje5.getCasa();
        msg += "\nBoggart: " + Personaje5.getBoggart();
        msg += "\nPatronus: " + Personaje5.getPatronus();
        System.out.print(msg);
    }
}

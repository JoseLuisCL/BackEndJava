package PracticaHarry;

public class Personajes {

    /* Atributos: Casa a la que pertenecen, genero, nombre, boggart, patronus.
     Caracteristicas - Campos */
    public String Casa, Genero, Nombre, Boggart, Patronus;

    public String getNombre(){  return Nombre;  }
    public String getGenero(){  return Genero;  }
    public String getCasa(){  return Casa;  }
    public String getBoggart(){  return Boggart;  }
    public String getPatronus(){  return Patronus;  }

    public boolean setNombre (String Nombre){
        if(!Nombre.isEmpty()){
            this.Nombre = Nombre;
            return true;
        } else
            return false;
    }
    public boolean setGenero (String Genero){
        if(!Genero.isEmpty()){
            this.Genero = Genero;
            return true;
        } else
            return false;
    }
    public boolean setCasa (String Casa){
        if(!Casa.isEmpty()){
            this.Casa = Casa;
            return true;
        } else
            return false;
    }
    public boolean setBoggart (String Boggart){
        if(!Boggart.isEmpty()){
            this.Boggart = Boggart;
            return true;
        } else
            return false;
    }
    public boolean setPatronus (String Patronus){
        if(!Patronus.isEmpty()){
            this.Patronus = Patronus;
            return true;
        } else
            return false;
    }
}

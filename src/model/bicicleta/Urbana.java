package model.bicicleta;

public class Urbana extends Bicicleta {

  public Urbana(String nroSerie, String modelo, int anio, float precio){
    super (nroSerie, modelo, anio, precio);
  }


  @Override
  public void getTipo(){
    System.out.println("Bicicleta Urbana");
  }
  @Override
  public int getPrecio(){

  }

}

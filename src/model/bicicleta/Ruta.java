package model.bicicleta;

public class Ruta extends Bicicleta {

  public Ruta(String nroSerie, String modelo, int anio, float precio){
    super(nroSerie, modelo, anio, precio);
  }


  @Override
  public void getTipo(){
    System.out.println("Bicicleta Ruta");
  }
}

package model.bicicleta;

public class Montana extends Bicicleta {

  public Montana (String nroSerie, String modelo, int anio, float precio) {
    super(nroSerie, modelo, anio, precio);

  }


    @Override
  public void getTipo(){
      System.out.println("Bicicleta Montaña");
    }

  }

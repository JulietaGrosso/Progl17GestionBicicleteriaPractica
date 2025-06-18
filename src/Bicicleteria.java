import model.bicicleta.Bicicleta;

public class Bicicleteria implements Vendible{
  private int bicicletas;
  private float ganancias;
  private int cantidadVentas;


  public Bicicleteria(int bicicletas, float ganancias, int cantidadVentas){
    this.bicicletas = bicicletas;
    this.ganancias = ganancias;
    this.cantidadVentas = cantidadVentas;
  }

  public int getBicicletas() {
    return bicicletas;
  }
  public float getGanancias(){
    return ganancias;
  }
  public int getCantidadVentas(){
    return cantidadVentas;
  }

  public void setBicicletas(){
    this.bicicletas = bicicletas;
  }
  public void setGanancias(){
    this.ganancias = ganancias;
  }
  public void setCantidadVentas(){
    this.cantidadVentas = cantidadVentas;
  }


  public void agregarBicicletas(Bicicleta b){

  }

  public void venderBicicletas(String nroSerie){

  }

  public void mostrarBicicletasDisponibles(){

  }

  @Override
  public float calcularPrecioFinal() {
    return 0;
  }
}

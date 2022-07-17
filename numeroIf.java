public class numeroIf {
  public static void main(String[] args) {
    /*
     * Usando un if, crear una condición que compare si la variable numeroIf es
     * positivo, negativo, o 0.
     * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
     */
    int numeroIf = 6;

    if (numeroIf > 0) {
      System.out.println("Es un número POSITIVO");
    } else if (numeroIf < 0) {
      System.out.println("Es un número NEGATIVO");
    } else {
      System.out.println("Es el número 0");
    }
  }
}
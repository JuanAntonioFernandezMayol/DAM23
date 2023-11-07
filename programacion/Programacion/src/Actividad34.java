public class Actividad34 {
    public static void actividad34 () {
    int [][] tabla = {{1,1,1},{2,2,2},{3,3,3}};
    //int[][] tablaVacia = new int[3][3];
    //tablaVacia[0][1] = 1;
    int suma=0;
    for (int i=0;i<tabla.length;i++){
        for (int j=0;j<tabla[i].length;j++){
            suma = suma + tabla[i][j];
        }
    }
    System.out.println("El resulado es: " + suma);
    }
}

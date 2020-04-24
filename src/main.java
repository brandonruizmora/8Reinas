public class main {
    public static void main(String[] args) {
        //columnas
        for (int j = 1; j < 9; j++) {

            //filas
            for (int i = 1; i < 9; i++) {
                System.out.print("("+j+","+i+")");
            }
            System.out.println();
        }
    }
}

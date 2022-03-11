package triangulosJava;

public class Main {

    public static void main(String[] args) {

        triangulo Triangulo = new triangulo();

        Triangulo.setLadoA(10);
        Triangulo.setLadoB(10);
        Triangulo.setLadoC(10);

        //print resultado

        System.out.println(triangulo.verificaTriangulo(Triangulo.getLadoA(), Triangulo.getLadoB(), Triangulo.getLadoC()));


    }
}

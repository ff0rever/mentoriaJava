package triangulosJava;

public class triangulo {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int laboC) {
        this.ladoC = laboC;
    }

    //verificar se o triangulo é valido
    //verificar se isosceles
    //ver equilatero
    //verr se escaleno

    public static String verificaTriangulo(int ladoA, int ladoB, int ladoC){
        if(ehValido(ladoA,ladoB,ladoC)){
            if (ehEquilatero(ladoA,ladoB,ladoC)){
                return "O triangulo é Equilátero";
            }
            else if (ehIsosceles(ladoA,ladoB ,ladoC)){
                return "O triangulo é Isosceles";
            }
            else
                return "O triangulo é Escaleno";
        }
        return "O triângulo não é válido";
    }

    private static boolean ehValido(int ladoA, int ladoB, int ladoC){
        return(ladoA + ladoB > ladoC &&  ladoB + ladoC > ladoA && ladoA +ladoC > ladoB);
    }

    private static boolean ehEquilatero(int ladoA, int ladoB, int ladoC){
        return (ladoA == ladoB && ladoB == ladoC);
    }

    private static boolean ehIsosceles(int ladoA, int ladoB, int ladoC){
        return (ladoA == ladoB  || ladoB == ladoC || ladoA == ladoC);
    }


}

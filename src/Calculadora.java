public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return a / b;
    }

    public double raizQuadrada(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo.");
        }
        return Math.sqrt(a);
    }

    public double potencia(int a, int b){
        if (b < 0) {
            throw new IllegalArgumentException("Não é possível calcular para números negativos.");
        }
        if(b==0){
            return 1;
        }
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }

    public double porcentagem(int a, int b){
        if (b < 1 && b>0) {
            throw new IllegalArgumentException("Não é possível de um número negativo.");
        }
        return a * b;
    }

}

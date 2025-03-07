package TIPOSVARIAVEIS;

class tiposVariaveis {

    public static void main(String [] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21077333;
        long cpf = 98765432109L;
        final float pi = 3.14f;
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(idade);
    }
}
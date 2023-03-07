public class OperadorTernario {
    public static void main(String[] args) throws Exception {
        // int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
        // for (int i : arrayUm) {
        //     System.out.println(i);
        // }

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro devDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas irei ter";
        //(condição) ? verdadeiro : falso;
        String resultado = salario>5000? mensagemDoar : mensagemNaoDoar ;

        System.out.println(resultado);



        
    }
}

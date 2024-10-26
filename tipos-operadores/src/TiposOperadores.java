public class TiposOperadores {

    public static void main(String[] args) {

    int numero1 = 1;
    int numero2 = 2;

        boolean maior = numero1 > numero2;
	        System.out.print("Numero 1 é maior que numero 2? "+maior);

        boolean menor = numero1 < numero2;
	        System.out.print("\r\nNumero 1 é menor que numero 2? "+menor);

        boolean maiorIgual = numero1 >= numero2;
	        System.out.print("\r\nNumero 1 é maior ou igual que numero 2? "+maiorIgual);

        boolean menorIgual = numero1 <= numero2;
	        System.out.print("\r\nNumero 1 é menor ou igual que numero 2? "+menorIgual);

        boolean diferente = numero1 != numero2;
	        System.out.print("\r\nNumero 1 é diferente de numero 2? "+diferente);

            

                String nome1 = "JAVA";
                String nome2 = "JAVA";
            
                System.out.println(nome1 == nome2); //true
    
                String nome3 = new String("JAVA");
            
                System.out.println(nome1 == nome3); //false
    
                String nome4 = nome3;
    
                System.out.println(nome3 == nome4); //true
            
            //equals na parada 
    
                System.out.println(nome1.equals(nome2)); //true
                System.out.println(nome2.equals(nome3)); //true
                System.out.println(nome3.equals(nome4)); //true

            
    }
}   
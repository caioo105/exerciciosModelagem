import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<String> input = Arrays.asList("10", "abc", "20", "30x");
//        List<Integer> numeros = input.stream()
//                .filter(s -> s.matches("\\d+"))
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//
//        System.out.println(numeros);

//        System.out.println(processaNumero(Optional.of(5)));
//        System.out.println(processaNumero(Optional.of(10)));
//        System.out.println(processaNumero(Optional.empty()));

//        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
//        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"

//        System.out.println(ehPalindromo("subi no onibus")); // Saída: true
//        System.out.println(ehPalindromo("Java")); // Saída: false

//        List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
//        System.out.println(converterEmails(emails));

//        System.out.println(Mes.FEVEREIRO.getNumeroDeDias());
//        System.out.println(Mes.JULHO.getNumeroDeDias());

//        System.out.println(Moeda.DOLAR.converterPara(100));
//        System.out.println(Moeda.EURO.converterPara(100));

//        System.out.println(CodigoErro.NOT_FOUND.getCodigo());
//        System.out.println(CodigoErro.BAD_REQUEST.getDescricao());
    }
//    public static Optional<Integer> processaNumero(Optional<Integer> numero) {
//        return numero.filter(n -> n > 0).map(n -> n * n);
//    }

//    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
//        String[] nomes = nomeCompleto.trim().split("\\s");
//        if(nomes.length == 1){
//            return nomes[0];
//        }
//        return nomes[0] + " " + nomes[nomes.length - 1];
//    }

//    public static boolean ehPalindromo(String palavra) {
//        String semEspacos = palavra.replace(" ","")
//                .toLowerCase();
//        return new StringBuilder(semEspacos).reverse().toString().equalsIgnoreCase(semEspacos);
//    }

//    public static List<String> converterEmails(List<String> emails) {
//        return emails.stream()
//                .map(email -> email.trim().toLowerCase())
//                .toList();
//    }

}

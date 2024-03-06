import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0,5.0,3.5,5.8, 9.1,8.5));
        System.out.println(notas);

        // Confira se a nota 5 esta no conjunto
        System.out.println(notas.contains(5.0));

        // exibar a maior e a menor nota
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        //faca a soma de todas as notas
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        // exiba a media das notas
        System.out.println(soma / notas.size());

        // Remove objeto 5.0
        notas.remove(5.0);
        System.out.println(notas);

        // Remova notas menor que 7

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        // Exibar as notas na ordem crescente
        Set <Double> notas2 = new LinkedHashSet<>();
        notas2.add(2.0);
        notas2.add(3.0);
        notas2.add(12.0);
        notas2.add(4.0);
        notas2.add(5.0);
        notas2.add(6.0);
        notas2.add(6.0);
        System.out.println(notas2);

        //Exiba todas as Notas em ordem Crescente
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        // apague o conjunto
        notas.clear();
        notas2.clear();
        notas3.clear();

        // Verifique se foi apagado
        System.out.println(notas.isEmpty());
        System.out.println(notas2.isEmpty());
        System.out.println(notas3.isEmpty());
    }
}
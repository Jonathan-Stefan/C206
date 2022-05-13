import java.util.*;

public class Main {

    public static void main(String[] args) {

        int x = 10000000;
        long tf, ti;


        List<Integer> lista = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> hashSet = new HashSet<>();

       ti = System.currentTimeMillis();
       for (int i = 0; i < x; i++){
           lista.add(i);
       }

       tf = System.currentTimeMillis();

        System.out.println("Tempo para inserir na lista: "+ (tf - ti));

        ti = System.currentTimeMillis();

        for (int i = 0; i < x; i++){
            map.put(i,i);
        }

        tf = System.currentTimeMillis();

        System.out.println("Tempo para inserir na lista: "+ (tf - ti));

        ti = System.currentTimeMillis();
        for (int i = 0; i < x; i++){
            hashSet.add(i);
        }

        tf = System.currentTimeMillis();

        System.out.println("Tempo para inserir na lista: "+ (tf - ti));


    }
}

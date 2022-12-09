
package TreeMap;

import java.util.TreeMap;

public class TestTreeMap {
   
    public static void main(String[] args) {
        
        
    TreeMap<Integer, String> Tenis = new TreeMap<>();    
        
        // 1. Metodo "put": se utiliza para insertar datos en nuestro mapa
        Tenis.put(100, "Vans");
        Tenis.put(40, "Converse");
        Tenis.put(54, "Nike");
        Tenis.put(13, "Puma");
        Tenis.put(94, "Adidas");
        Tenis.put(28, "Fila");
        Tenis.put(61, "Reebok");

        System.out.println("\n");
        System.out.println(Tenis);
        System.out.println("\n");
        //----------------------------------------------------------------------    
        
        
        
        // 2. Metodo "isEmpty": retorna true si esta vacia 
        System.out.println(Tenis.isEmpty());
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        /* 3. Metodo "ceilingEntry": nos retorna el dato y llave de acuerdo a la llave ingresada
        y si no existe dicha llave nos devuelve el valor del dato y llave más cercanos*/  
        System.out.println(Tenis.ceilingEntry(94));
        System.out.println(Tenis.ceilingEntry(95));
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        /* 4. Metodo "ceilingKey" : nos retorna unicamente la llave ingresada y si no existe dicha llave
        nos devuelve la llave mas cercana*/
        System.out.println(Tenis.ceilingKey(40));
        System.out.println(Tenis.ceilingKey(10));
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 5. Metodo "containsKey" : Retorna true si nuestro mapa contiene una llava especificada por nosotros
        // 6. Metodo "containsValue" : Retorna true si nuestro mapa contiene un dato especificada por nosotros
        System.out.println(Tenis.containsKey(100));
        System.out.println(Tenis.containsKey(25));
        System.out.println("\n");
        System.out.println(Tenis.containsValue("New Balance"));
        System.out.println(Tenis.containsValue("Nike"));
        System.out.println("\n");
        //---------------------------------------------------------------------- 
        
        
        
        // 7. Metodo "ketSet": retorna todos los valores de las llaves
        System.out.println(Tenis.keySet());
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 8. Metodo "Values": retorna todos los valores de los datos
        System.out.println(Tenis.values());
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 9. Metodo "firstEntry": Retorna el dato de la llave con menor valor del mapa
        // 10. Metodo "lastEntry": Retorna el dato de la llave con mayor valor del mapa
        System.out.println(Tenis.firstEntry());
        System.out.println("\n");
        System.out.println(Tenis.lastEntry());
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 11. Metodo "firstKey": Retorna el valor de la llave con menor valor del mapa
        // 12. Metodo "lastKey": Retorna el valor de la llave con mayor valor del mapa
        System.out.println(Tenis.firstKey());
        System.out.println("\n");
        System.out.println(Tenis.lastKey());
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 13. Metodo "higherKey": retorna la llave con el valor mayor más cercano al valor ingresado
        // 14. Metodo "lowerKey": retorna la llave con el valor menor más cercano al valor ingresado
        System.out.println(Tenis.higherKey(10));
        System.out.println(Tenis.higherKey(50));
        System.out.println("\n");
        System.out.println(Tenis.lowerKey(105));
        System.out.println(Tenis.lowerKey(64));
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        /* 15. Metodo "subMap": retorna las llaves y datos dentro del rango de 2 llaves 
        ingresadas, siendo la primera desde donde empieza el recorrido y la segunda en donde temrina */
        System.out.println(Tenis.subMap(20, 55));
        System.out.println("\n");
        //----------------------------------------------------------------------

        
        
        /* 16. Metodo "tailMap": retorna los datos de nuestro mapa a emepzando desde 
        una llave ingresada hasta que termine nuestro mapa */
        System.out.println(Tenis.tailMap(30));
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 17. Metodo "Remove": Elimina datos de nuestro mapa
        Tenis.remove(13);
        Tenis.remove(54);
        Tenis.remove(100);
        
        System.out.println("\n");
        System.out.println(Tenis);
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 18. Metodo "size": retorna la longitud de nuestro mapa
        System.out.println("Numero de elementos: " + Tenis.size() + " elementos");
        System.out.println("\n");
        //---------------------------------------------------------------------- 
        
    }
  
}

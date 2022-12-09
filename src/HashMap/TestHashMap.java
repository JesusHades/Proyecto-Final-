package HashMap;

import java.util.HashMap;

public class TestHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> frutero = new HashMap<>();

        
        //Metodo "isEmpty": retorna true si esta vacia 
        System.out.println(frutero.isEmpty());
        //----------------------------------------------------------------------
        
        
        
        // 1. Metodo "put": se utiliza para insertar datos en nuestro mapa
        frutero.put(4312, "Manzanas");
        frutero.put(2319, "Peras");
        frutero.put(3810, "Platanos");
        frutero.put(8025, "Uvas");
        frutero.put(1249, "Fresas");
        frutero.put(7149, "Naranjas");
        frutero.put(2100, "Sandias");
        
        //Tambien se puede añadir un valor y llave null
        frutero.put(null, null);

        System.out.println("\n");
        System.out.println(frutero);
        System.out.println("\n");
        //----------------------------------------------------------------------

        
        
        // 2. Metodo "get": se utiliza para obtener el valor de acuerdo a la llave ingresada
        System.out.println(frutero.get(4312));
        System.out.println(frutero.get(7149));
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 3. Metodo "ketSet": retorna todos los valores de las llaves
        System.out.println(frutero.keySet());
        System.out.println("\n");
        //----------------------------------------------------------------------
        
      
        
        // 4. Metodo "Values": retorna todos los valores de los datos
        System.out.println(frutero.values());
        System.out.println("\n");
        //----------------------------------------------------------------------
       
        
        
        // 5. Metodo "Remove": Elimina datos de nuestro mapa
        frutero.remove(2319);
        frutero.remove(null);
        frutero.remove(2100);
        
        System.out.println("\n");
        System.out.println(frutero);
        System.out.println("\n");
        //----------------------------------------------------------------------
        
       
        
        // 6. Metodo "size": retorna la longitud de nuestro mapa
        System.out.println("Numero de elementos: " + frutero.size() + " elementos");
        System.out.println("\n");
        //---------------------------------------------------------------------- 
        
       
                
        // 7. Metodo "containsKey" : Retorna true si nuestro mapa contiene una llava especificada por nosotros
        // 8. Metodo "containsValue" : Retorna true si nuestro mapa contiene un dato especificada por nosotros
        System.out.println(frutero.containsKey(2100));
        System.out.println(frutero.containsKey(3810));
        System.out.println("\n");
        System.out.println(frutero.containsValue("Cerezas"));
        System.out.println(frutero.containsValue("Naranjas"));
        System.out.println("\n");
        //---------------------------------------------------------------------- 
        

    }

}

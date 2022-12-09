package LinkedHashMap;

import java.util.LinkedHashMap;

public class TestLinkedHashMap {

    public static void main(String[] args) {

        
        LinkedHashMap<String, String> musica = new LinkedHashMap<>();
        
    
        // 1. Metodo "put": se utiliza para insertar datos en nuestro mapa
        musica.put("Electronica", "Hardwell");
        musica.put("Rock", "The Hives");
        musica.put("Pop", "Michael Jackson");
        musica.put("Indie", "Boy Pablo");
        musica.put("Clasica", "Mozart");
        musica.put("Urbano", "Paulo Londra");
        musica.put("Hip-Hop", "Eminem");

        System.out.println("\n");
        System.out.println(musica);
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 2. Metodo "isEmpty": retorna true si esta vacia 
        System.out.println(musica.isEmpty());
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 3. Metodo "get": se utiliza para obtener el valor de acuerdo a la llave ingresada
        System.out.println(musica.get("Electronica"));
        System.out.println(musica.get("Clasica"));
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 4. Metodo "ketSet": retorna todos los valores de las llaves
        System.out.println(musica.keySet());
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        // 5. Metodo "Values": retorna todos los valores de los datos
        System.out.println(musica.values());
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 6. Metodo "Remove": Elimina datos de nuestro mapa
        musica.remove("Electronica");
        musica.remove("Indie");
        musica.remove("Hip-Hop");
        
        System.out.println("\n");
        System.out.println(musica);
        System.out.println("\n");
        //----------------------------------------------------------------------
        
        
        
        // 7. Metodo "size": retorna la longitud de nuestro mapa
        System.out.println("Numero de elementos: " + musica.size() + " elementos");
        System.out.println("\n");
        //---------------------------------------------------------------------- 
        
        
        
        // 8. Metodo "containsKey" : Retorna true si nuestro mapa contiene una llava especificada por nosotros
        // 9. Metodo "containsValue" : Retorna true si nuestro mapa contiene un dato especificada por nosotros
        System.out.println(musica.containsKey("Reggaeton"));
        System.out.println(musica.containsKey("Pop"));
        System.out.println("\n");
        System.out.println(musica.containsValue("The Hives"));
        System.out.println(musica.containsValue("Arctic Monkeys"));
        System.out.println("\n");
        //---------------------------------------------------------------------- 
        
    }
}

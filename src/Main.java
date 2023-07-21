import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Tipos de variáveis
        String myString = "Maria";
        int myNumber = 9;
        float myFloatNumber = 2.5f;

        System.out.println(myString);
        System.out.println(myNumber);
        System.out.println(myFloatNumber);

        // Arrays
        String[] myArray = {"Batata", "Banana", "Cenoura"};
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.add("Maria");
        newArray.add("Clara");
        newArray.add("Tabosa");

        
        // Condicionais
        if(newArray.size() == 0){
            System.out.println("Array vazio");
        } else {
            System.out.println("Array não vazio");
        }
        System.out.println(Arrays.stream(myArray).toList());
        
        // Objetos
        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("Nome:", "Maria");
        myHashMap.put("Nome do meio:", "Clara");
        myHashMap.put("Sobrenome", "Tabosa");

        System.out.println(myHashMap);

        // Estruturas de repetição
        for (int i = 0; i < newArray.size(); i++){
            System.out.println(newArray.get(1));
        }
    }
}
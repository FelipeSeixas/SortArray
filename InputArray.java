import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        while (input.hasNextLine()) {
            String n = input.nextLine();
            int size = Integer.parseInt(n);
            String fullLine[] = new String[size];
            
            //Entrada
            for(int i = 0; i < size; i++){
                fullLine[i] = input.nextLine();
            }
            
            //Ordena
            Arrays.sort(fullLine); 
            
            //Saída ordenada
            for(int i = 0; i < size; i++){
                System.out.println(fullLine[i]);
            }
        }
    }
}    
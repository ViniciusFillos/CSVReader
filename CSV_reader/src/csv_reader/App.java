
package csv_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\winky\\Dropbox\\PC\\Downloads\\Base_MUNIC_2021_CSV.ponto.csv");
        String line;
        String divisorCSV = ";";
        boolean primeiralinha = true;
        ArrayList<IBGE> estados = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while(( line = br.readLine())!= null){
                String[] coluna = line.split(divisorCSV);
                //System.out.println(coluna[0] +" "+ coluna[1]+" "+ coluna[3]);
                System.out.println(coluna[1]);
                
                estados.forEach(x -> {
                    System.out.println(x);
                });
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}

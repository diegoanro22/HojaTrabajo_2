import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Archivo {
    private File archivo;

    public Archivo(String nameArchivo){
        archivo = new File(nameArchivo);
    }

    public ArrayList<String> leerArchivo() throws IOException {
        ArrayList<String> listPostfix = new ArrayList<>();
        FileReader fileReader = new FileReader(archivo);
        BufferedReader lector = new BufferedReader(fileReader);

        String linea;
        while ((linea = lector.readLine()) != null){
            listPostfix.add(linea.toString());
        }
        lector.close();
        return listPostfix;

    }



}

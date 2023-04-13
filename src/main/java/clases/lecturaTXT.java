package clases;


import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lecturaTXT {
    public static void leerApostadores(){
        String rutaArchivo = "pronosticos.txt";
        ArrayList<String> nombres = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            Pattern patron = Pattern.compile("([A-Z]{4,}[^:]*):");
            while ((linea = br.readLine()) != null) {
                Matcher matcher = patron.matcher(linea);
                while (matcher.find()) {
                    nombres.add(matcher.group(1));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(nombres);
    }


    public static void leerPronosticos(){

    }

    public static void leerResultados(){

    }

}

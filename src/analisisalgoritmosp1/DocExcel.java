// Instituto Politécnico Nacional - ESCOM 
// Alejandra Orozco Aguilar 
// Luis Ernesto Guzman Castro
// Analisis de algoritmos  Grupo: 3CV11
// Prof. Luna Benoso Benjamin
// Ciclo escolar 22/1

package analisisalgoritmosp1;

import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DocExcel {

    public DocExcel(String ar[][]) {
        this.Escribir(ar);
    }
    
    public void Escribir(String ar[][]){
        
        String nombreArchivo = "src/Documentos/Datos.xlsx"; //Directorio en que se va aguardar 
        String hoja = "Hoja1"; //Nomre de la hoja 
        XSSFWorkbook libro = new XSSFWorkbook(); //Crea el libro
        XSSFSheet hoja1 = libro.createSheet(hoja); //Crea la Hoja 

        //Contenido de la hoja 
        String[][] documento = ar;
        
        for (int i = 0; i < documento.length ; i++) {
            XSSFRow row = hoja1.createRow(i); //Crea las filas 
            for (int j = 0; j < 2 ; j++) {
                    XSSFCell cell = row.createCell(j);
                    cell.setCellValue(documento[i][j]);
            }
        }
        
        //Crea el Documento 
        try(OutputStream fileOut = new FileOutputStream(nombreArchivo)){
            System.out.println("Se creo el archivo");
            libro.write(fileOut);
        } catch (Exception e) {
            System.out.println("Error al crear el Archivo");
        }
        
    } 
}

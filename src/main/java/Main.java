import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //ApachePoiUtil.ispisImena();

           try{
                ApachePoiUtil.writeExcel("domaci22.xlsx");
          }catch (FileNotFoundException e){
               System.out.println("File not found");
           }catch (IOException ex){
               ex.printStackTrace();
           }



    }
}

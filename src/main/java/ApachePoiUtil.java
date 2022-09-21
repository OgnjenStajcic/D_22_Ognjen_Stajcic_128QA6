import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ApachePoiUtil {




    public static void ispisImena() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("domaci22.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        for (int i = 0; i < 2; i++) {
            XSSFRow row = sheet.getRow(i);

            for (int j = 0; j < 2; j++) {
                XSSFCell cell = row.getCell(j);
                String celija = cell.getStringCellValue();
                System.out.print(celija + "   ");
            }
            System.out.println();
        }
    }


    public static void writeExcel(String fileName) throws IOException {

        Faker faker = new Faker();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        for (int i = 2; i < 10; i++) {

            XSSFRow row = sheet.createRow(i);
            for (int j = 0; j < 2; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue(faker.name().firstName());
                cell.setCellValue(faker.name().lastName());
                System.out.print(cell.getStringCellValue() + "   ");
            }

            System.out.println();
        }
            FileOutputStream fileOutputStream = new FileOutputStream("domaci22.xlsx");
            workbook.write(fileOutputStream);
            fileOutputStream.close();


    }

}

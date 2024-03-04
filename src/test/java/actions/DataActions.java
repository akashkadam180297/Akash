package actions;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Properties;

public class DataActions {

    public static Properties prop;
    public FileInputStream fis = null;
    public FileOutputStream fos = null;
    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public XSSFRow row = null;
    public XSSFCell cell = null;
    public Comment comment = null;
    String xlFilePath;
    RichTextString s;
    ArrayList<String> list=new ArrayList<String>();
    private static DataActions instanceData;

    public static synchronized DataActions getReuseActions() {
        if (instanceData == null) {

            instanceData = new DataActions();

        }
        return instanceData;
    }

 /*   public DataActions() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\config\\config.properties");
            prop.load(ip);
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/
    /**
     * Get the Excel path
     *
     * @return
     */
    public void excelPath(String xlFilePath) throws IOException {
        this.xlFilePath = xlFilePath;
        try {
            fis = new FileInputStream(xlFilePath);
            workbook = new XSSFWorkbook(fis);
            fis.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Get the data from the Excel using sheet name, column name, row number
     *
     * @return
     */
    public String getCellData(String filePath, String sheetName, String colName, int rowNum) throws IOException {
        excelPath(System.getProperty("user.dir") + filePath);
        try {
            if (rowNum <= 0)
                return "";

            int index = workbook.getSheetIndex(sheetName);
            int col_Num = -1;
            if (index == -1)
                return "";

            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(0);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                // System.out.println(row.getCell(i).getStringCellValue().trim());
                if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
                    col_Num = i;
            }
            if (col_Num == -1)
                return "";

            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(rowNum - 1);
            if (row == null)
                return "";
            cell = row.getCell(col_Num);

            if (cell == null)
                return "";
            if (cell.getCellType().name().equals("STRING"))
                return cell.getStringCellValue();

            else if ((cell.getCellType().name().equals("NUMERIC")) || (cell.getCellType().name().equals("FORMULA"))) {

                String cellText = (new BigDecimal(cell.toString()).toPlainString());
                if (DateUtil.isCellDateFormatted(cell)) {
                    double d = cell.getNumericCellValue();

                    Calendar cal = Calendar.getInstance();
                    cal.setTime(DateUtil.getJavaDate(d));
                    cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
                    cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + 1 + "/" + cellText;
                }
                return cellText;
            } else if (cell.getCellType().BLANK != null)
                return "";
            else
                return String.valueOf(cell.getBooleanCellValue());
        } catch (Exception e) {
            e.printStackTrace();
            return "row " + rowNum + " or column " + colName + " does not exist in xls";
        }
    }

    /**
     * Write data into cell
     * @param sheetName
     * @param colName
     * @param rowNum
     * @param value
     * @return
     */
    public boolean setCellData(String sheetName, String colName, int rowNum, String value) {
        try {
            int col_Num = -1;
            sheet = workbook.getSheet(sheetName);
            System.out.println(sheet);
            row = sheet.getRow(0);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                if (row.getCell(i).getStringCellValue().trim().equals(colName)) {
                    col_Num = i;
                }
            }
            sheet.autoSizeColumn(col_Num);
            row = sheet.getRow(rowNum - 1);
            if (row == null)
                row = sheet.createRow(rowNum - 1);

            cell = row.getCell(col_Num);
            if (cell == null)
                cell = row.createCell(col_Num);

            cell.setCellValue(value);

            fos = new FileOutputStream(xlFilePath);
            workbook.write(fos);
            fos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }


    /**
     * Get the cell comment
     * @param filePath
     * @param rowNum
     * @return
     * @throws IOException
     */
    public ArrayList<String> getCellCommentsAsList(String filePath, int rowNum) throws IOException {
        excelPath(System.getProperty("user.dir")+filePath);
        sheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = sheet.iterator();
        Row getSchool = sheet.getRow(rowNum-1);
        Iterator<Cell> cellIterator = getSchool.cellIterator();
        while (iterator.hasNext()) {
            if (!cellIterator.hasNext()) {
                break;
            } else {
                comment = cellIterator.next().getCellComment();
                s = comment.getString();
                String a = String.valueOf(s);
                if (a.trim().isEmpty()) {
                } else {
                    list.add((a.trim()));
                }
            }
        }return list;
    }


}

package keyword;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import wrappers.OpentapsWrappers;

public class RunScripts extends OpentapsWrappers{

	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		testCaseName 	= "TC03 - Create Contact";
		testDescription = "Create Contact OpenTaps Using Keyword";	
	}

	@Test
	public void runScripts() throws IOException {

		CallWrappersUsingKeyword keywords = new CallWrappersUsingKeyword();

		try {
			FileInputStream fis = new FileInputStream("./Keywords/KeywordDriver1.xls");
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			HSSFSheet sheet = workbook.getSheetAt(0);	

			// get the number of rows
			int rowCount = sheet.getLastRowNum();			

			// loop through the rows
			for(int i=1; i <rowCount+1; i++){
				try {
					HSSFRow row = sheet.getRow(i);
					
					if(row.getCell(3).getStringCellValue().toLowerCase().equals("yes"))
						keywords.getAndCallKeyword("./keywords/"+row.getCell(1).getStringCellValue()+".xls");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}




	}

}

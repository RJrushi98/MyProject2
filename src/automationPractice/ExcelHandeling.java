package automationPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandeling {

	public static void main(String[] args) throws IOException
	{
		FileInputStream myFile = new FileInputStream("C:\\Users\\DELL-PC\\Downloads\\TestSceanrioTemplate.xlsx");
		String Data = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(Data);

	}

}

package module1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class calling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		methods m1=new methods();
		FileInputStream f1=new FileInputStream("D://keys.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		Iterator<Row> row =ws.iterator();
		while(row.hasNext())
		{
			r=row.next();
			c=r.getCell(2);
			String s1=c.getStringCellValue();
			if(s1.equals("opening_browser"))
				m1.opening_browser();
			else if(s1.equals("navigate"))
				m1.Navigate();
			else if(s1.equals("user_name"))
				m1.usernameenter();
			else if(s1.equals("password"))
				m1.passwordenter();
			else if(s1.equals("click"))
				m1.click();
		}
			
			
		}
		
		
	}



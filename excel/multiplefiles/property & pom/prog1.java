package multiplefiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
		FileInputStream f1=new FileInputStream("C:\\Users\\nilesh\\eclipse-workspace\\excel\\src\\multiplefiles\\p2.properties");
		Properties p2=new Properties();
		p2.load(f1);
		d.findElement(By.name("userName")).sendKeys(p2.getProperty("username"));
		d.findElement(By.name("password")).sendKeys(p2.getProperty("password"));
		d.findElement(By.name("submit")).submit();
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		pom1 obj=new pom1(d);
		obj.method1();
		obj.uname();
		obj.Password();
		FileInputStream f=new FileInputStream("D:\\Book5.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
	    WebElement a=d.findElement(By.name("country"));
	    List<WebElement> c1=a.findElements(By.tagName("option"));
	    System.out.println(c1.size());
	    for(int i =0;i<c1.size();i++) {
	    	System.out.println(c1.get(i).getText());
	    	r=ws.createRow(i);
//	    	r.createCell(0).setcellvalue(i+1);
	    	r.createCell(0).setCellValue(c1.get(i).getText());
	    	c1.get(i).click();
	    	if(!c1.get(i).isSelected()) {
	    		r.createCell(1).setCellValue("fail");
	    	}
	    	else {
	    		r.createCell(1).setCellValue("pass");
	    	}
	    }
	    FileOutputStream f11= new FileOutputStream("D:\\Book5.xlsx");
	    wb.write(f11);
	    f11.close();
	    
	}
	

}

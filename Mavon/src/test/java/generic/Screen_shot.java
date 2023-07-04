package generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_shot extends Generic_Script {

	public static void sc(WebDriver driver) {
		try {
		String path="./Screenshot/";
		Date date = new Date();
		String d = date.toString();
		String d1 = d.replaceAll(":","-");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File sc = tss.getScreenshotAs(OutputType.FILE);
		File src = new File(path+d1+".png");
		FileHandler.copy(sc, src);
	}
		catch (Exception e) {
			System.out.println(e);
		}
}
}
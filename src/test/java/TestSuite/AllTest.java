package TestSuite;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.Base;
import Pages.Courses;
import Pages.ErrorCapture;
import Pages.LangLearn;


public class AllTest {
	
	@Test
	public void testing() throws Exception
	{
		Base dr=new Base();
		Courses ti= new Courses();
		LangLearn b= new LangLearn();
		ErrorCapture s= new ErrorCapture();
		b.driverSetup();
	    dr.openUrl();
		ti.find();
		dr.openUrl();
		b.learningLang();
		dr.openUrl();
		s.error();
		b.closeBrowser();
	}

}

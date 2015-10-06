package com.seleniumhq.net;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataProvider {
	
	@Test(dataProvider="testData")
	public void sampleTest(int str,String str2){
		System.out.println("Int:"+str+",String2:"+str2);
	}
	
	
	@DataProvider(name="testData")
	public Object[][] sampleTestData(){
//		return new Object[][] {{}};
		Object[][] data = new Object[3][2];
		
		data[0][0]=1;
		data[0][1]="TestNG";
		data[1][0]=2;
		data[1][1]="JUnit";
		data[2][0]=3;
		data[2][1]="Selenium";
		
		return data;
		
	}

}

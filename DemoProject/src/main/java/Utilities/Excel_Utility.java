package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

public class Excel_Utility {

		static FileInputStream f;//excel file
		static XSSFWorkbook w;//name salary
		static XSSFSheet s;//sheets
		public static String getStringData(int a,int b,String Sheet) throws IOException  {//a is row,b is column or cell
			String filepath=Constant.TESTDATAFILE;
			f=new FileInputStream(filepath);
			w=new XSSFWorkbook(f);
			s=w.getSheet(Sheet);
			XSSFRow r=s.getRow(a);
			XSSFCell c=r.getCell(b);
			return c.getStringCellValue();//inbuild method for excelsheet connection
		}
		public static String getIntegerData(int a,int b,String Sheet) throws IOException{ 
			String filepath=Constant.TESTDATAFILE;
			f=new FileInputStream(filepath);
			w=new XSSFWorkbook(f);
			s=w.getSheet(Sheet);
			XSSFRow r=s.getRow(a);
			XSSFCell c=r.getCell(b);
			int y = (int) c.getNumericCellValue();
			return String.valueOf(y);
		}

	}


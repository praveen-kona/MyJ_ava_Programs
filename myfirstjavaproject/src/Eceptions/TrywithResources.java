package Eceptions;

import java.io.*;
import java.util.*;
public class TrywithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream f=new FileInputStream("DOC-20260814-WA0000.xlsx");){
			
		}
		catch(IOException e)

		{
			System.out.println(e);
		}
	}

}

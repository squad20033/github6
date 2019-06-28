package mustafa2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	
	public static List<Exception> method1(){
		List<Exception> list=new ArrayList();
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			e.getMessage();
			list.add(e);
		} 
		
		try {
			int[] a= {1,2,3,4,5,6};
		} catch (Exception e1) {
			e1.getMessage();
			list.add(e1);
		}
		
		try {
			Thread.sleep(3000);
		}catch(Exception e3) {
			e3.getMessage();
			list.add(e3);
		}
		return list;
	}
	public static void main(String[] args) {
		Main obj=new Main();
		System.out.println(obj.method1());
        }
        
	}

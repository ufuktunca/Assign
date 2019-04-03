import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("student1.txt");
		file.createNewFile();
		
		File fileýd=new File("studentýd.txt");
		file.createNewFile();
		
		File filegpa=new File("studentgpa.txt");
		file.createNewFile();
		
		
		FileWriter filewriter=new FileWriter("student1.txt",true);
		FileReader filereader=new FileReader("student1.txt");
		
		FileWriter filewriterýd=new FileWriter("studentýd.txt",true);
		FileReader filereaderýd=new FileReader("studentýd.txt");
		
		FileWriter filewritergpa=new FileWriter("studentgpa.txt",true);
		FileReader filereadergpa=new FileReader("studentgpa.txt");
		
		
		Scanner scanreader=new Scanner("student1.txt");
		
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<Integer> arraygpa = new ArrayList<Integer>();
		arraygpa.add(60);  arraygpa.add(20);  arraygpa.add(40);  arraygpa.add(90);   arraygpa.add(70);
		arraygpa.add(45);  arraygpa.add(50);  arraygpa.add(70);  arraygpa.add(30);   arraygpa.add(90);
		arraygpa.add(60);  arraygpa.add(20);  arraygpa.add(80);  arraygpa.add(20);   arraygpa.add(55);
		arraygpa.add(100); arraygpa.add(10);  arraygpa.add(50);  arraygpa.add(65);   arraygpa.add(75);
		arraygpa.add(20);  arraygpa.add(85);  arraygpa.add(95);  arraygpa.add(20);  arraygpa.add(88);
		ArrayList<String> arrayýd = new ArrayList<String>();
		
		Scanner scanner=new Scanner(System.in);
		Gpa gpa=new Gpa();	
		
		
		BufferedWriter bfw=new BufferedWriter(filewriter);
		BufferedReader bfr=new BufferedReader(filereader);
		
		BufferedWriter bfwýd=new BufferedWriter(filewriterýd);
		BufferedReader bfrýd=new BufferedReader(filereaderýd);
		
		BufferedWriter bfwgpa=new BufferedWriter(filewritergpa);
		BufferedReader bfrgpa=new BufferedReader(filereadergpa);
		
		
		
		
		String name;
		String surname;
		String ýd;
		char a='y';
		int i=0;
		String reader=null;
		int flgpa;
		String ýd_search;
		
		
       while((reader=bfrýd.readLine()) != null) {
			
		    arrayýd.add(reader);            //Reading data from file
        }
	    
          
        while((reader=bfr.readLine()) != null) {                 //Reading data from file
			array.add(reader);
         }
        
		
		while(a=='y') {
		System.out.println("1-Show student information");
		System.out.println("2-Show all students");
		System.out.println("3-Update student information");
		System.out.println("4-Delete student");
		System.out.println("5-Show student gpa");
		System.out.println("6-Exýt");
		int select=scanner.nextInt();
	
		switch(select) {
		case 1:
			
			
			 System.out.println("enter student ýd");
			 scanner.nextLine();
		     ýd_search=scanner.nextLine();
			
                for(i=0;i<array.size();i++) {
	    		
	    		 String ýd1=arrayýd.get(i);
	    		
	    		if(ýd_search.equals(ýd1)) {
	    			System.out.println("student name is " + array.get(i) );
	    		}
	    	}
                System.out.println("do you want to go to menu?");
        		System.out.println("y/n");
        		a=scanner.next().charAt(0);
			if(a=='y') {
			continue;
			}
			else {
				break;
			}
	    case 2:
	    	
		for(i=0;i<array.size();i++) {
			
			System.out.println(array.get(i) + arrayýd.get(i));
			
		}
		System.out.println("do you want to go to menu?");
		System.out.println("y/n");
		a=scanner.next().charAt(0);
		if(a=='y') {
			continue;
			}
			else {
				break;
			}
	    	
	    case 3:
            System.out.println("enter student ýd for the update name");
			
            scanner.nextLine();
		     ýd_search=scanner.nextLine();
			
               for(i=0;i<array.size();i++) {
	    		
	    		String ýd1=arrayýd.get(i);           
	    		
	    		if(ýd_search.equals(ýd1)) {              //searching ýd
	    			
	    			System.out.println("enter new name:");
	    			
	    			  scanner.nextLine();
	    			  String change_name=scanner.nextLine();
	    		     array.set(i,change_name);
	    			
	    		}
	    	}
	    	
               System.out.println("do you want to go to menu?");
       		System.out.println("y/n");
       		a=scanner.next().charAt(0);
			
			if(a=='y') {
			continue;
			}
			else {
				break;
			}
            
	    	
		
	    case 4:
            
	    	System.out.println("enter name for the deleting");
	    	scanner.nextLine();
	    	reader=scanner.nextLine();
	    	
	    	for(i=0;i<array.size();i++) {
	    		
	    		String comp=array.get(i);
	    		
	    		if(comp.equals(reader)) {
	    			array.remove(i);
	    			arrayýd.remove(i);
	    			arraygpa.remove(i);
	    		}
	    	}	    		
	    		
	    		System.out.println("Student has been deleted!!!");
	    		
	    		System.out.println("do you want to go to menu?");
        		System.out.println("y/n");
        		a=scanner.next().charAt(0);
        		if(a=='y') {
        			continue;
        			}
        			else {
        				break;
        			}
	    	
	    case 5:
	    	
	    	System.out.println("enter ýd for the gpa");
	    	scanner.nextLine();
	    	reader=scanner.nextLine();
	    	
	    	for(i=0;i<array.size();i++) {
	    		
	    		String comp=arrayýd.get(i);
	    		
	    		if(comp.equals(reader)) {
	    			
	    			gpa.setCourse1(arraygpa.get(i));
	    			gpa.setCourse2(arraygpa.get(i+1));
	    			gpa.setCourse3(arraygpa.get(i+2));
	    			gpa.setCourse4(arraygpa.get(i+3));
	    			gpa.setCourse5(arraygpa.get(i+4));
	    		}
	    	}	    		
	    	
	    	System.out.println(gpa.calcgpa());
         
               
	    		
	    		System.out.println("do you want to go to menu?");
       		System.out.println("y/n");
       		a=scanner.next().charAt(0);
              
               if(a=='y') {
       			continue;
       			}
       			else {
       				break;
       			}   
    	
	    case 6:
	    	a='a';
	    	break;
	    	
		
		}

		
		
	}
		bfw.close();
		bfr.close();
		filereader.close();
		filewriter.close();
		
	}

}


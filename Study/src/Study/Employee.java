package Study;

public class Employee{  
 //Using the variables with many methods we decleare the variables here
 String name;
 double salary;
 int workHours;
 int hireYear;
 double taxRate;
 double Salary;
 
 Employee(String name,double salary,int workHours,int hireYear){  
	 this.name=name;  
	 this.salary=salary;  
	 this.workHours=workHours;  
	 this.hireYear=hireYear;
 }  
 public double tax(){
	 if(salary>1000)
	 {
		 taxRate=salary*(0.03);
	 }
	 if(salary<1000) 
	 {
		taxRate=0;
	 }
	 return taxRate; //returning the wanted value when method is called
}
	
public double bonus() {
	//Creating the condition using if else method
	if(workHours>40)
	{
		return ((workHours-40)*30);	
	}
	else{
		return 0;
	}
}
	
public double raiseSalary(){
	//Creating the conditions using and if statement and logic operators 
	int workingYears=(int) (2021-hireYear);
	
	if(workingYears>=19) {
		Salary=salary*(0.15);
		}
	if(workingYears>9 && workingYears<20) {
		Salary=salary*(0.10);
		}
	if(workingYears<10) {
		Salary=salary*(0.05);
	}
	return Salary;
}
	
 public String toString(){//overriding the toString() method  
	 //returns with all the methods and the expected output
	 return "Adı: "+name+"\nMaaşı: "+salary+"\nÇalışma Saati :"
		  +workHours+"\nBaşlangıç Yılı : "+hireYear+"\nVergi : "
          +tax()+"\nBonus : "+bonus() +"\nMaaş Artışı : "+raiseSalary()+"\n"
          +"Vergi ve Bonuslar ile birlikte maaş : "+(salary+bonus()-tax())+"\nToplam Maaş : "
          +(salary+bonus()-tax()+raiseSalary())+"\n\n";  
 }  
 public static void main(String args[]){  
	
   //Employe who earns less than 1000 and works there more than 19 years 
   Employee worker1=new Employee("Hazal",950,45,1985);  
   //Employe who earns more than 1000 and works there more than 20 years
   Employee worker2=new Employee("Kemal",2000,45,1985);  
   //Employe who works less than 10 years 
   Employee worker3=new Employee("Ali",2500,50,2015); 
   //Employe who works less than 20 years more than 9 years
   Employee worker4=new Employee("Yağmur",2500,50,2005); 
   
   System.out.println(worker1);//compiler writes here worker1.toString()  
   System.out.println(worker2);//compiler writes here worker2.toString()  
   System.out.println(worker3);//compiler writes here worker3.toString() 
   System.out.println(worker4);//compiler writes here worker4.toString() 
 }  
}  
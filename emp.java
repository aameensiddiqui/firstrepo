package Poly;

public class Emp extends Person
{
		public int empid;
		public double salary;
		
		public Emp() 
		{
			super();
		}
		public Emp(String name, int dd, int mm, int yy, int empid, double salary)
		{
			super(name, dd, mm, yy);
			this.empid=empid;
			this.salary=salary;
		}
		public void display()
		{
			super.display();
			System.out.println("\nEMPLOYEE: "+empid+"\nSALARY: "+salary);
			System.out.println("*************************************************************************");
		}
		public String toString()
		{
			return super.toString()+"\nEMPLOYEE: "+empid+"\nSALARY: "+salary;
		}
		public double calSalary()
		{
			double gross_salary = salary*salary*salary;
			return gross_salary;
		}
		

	}



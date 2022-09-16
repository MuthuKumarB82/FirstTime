package collections1review;

public class Designer {
    private String designation; 
    private String  name ;
    private int salary;
    private String software;
    private boolean isMale;
    private String company;
    private int id;
    
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return name;
    }
    public void setDesignation(String designation) {
    	this.designation = designation;
    }
    public String getDesignation() {
    	return designation;
    }
    public void setSalary(int salary) {
    	this.salary = salary;
    }
    public int getSalary() {
    	return salary;
    }
    public void setSoftware(String software) {
    	this.software = software;
    }
    public String getSoftware() {
    	return software;
    }
    public void setIsMale(boolean isMale) {
    	this.isMale = isMale;
    }
    public boolean getIsMale() {
    	return isMale;
    }
    public void setCompany(String company) {
    	this.company = company;
    }
    public String getCompany() {
    	return company;
    }
    public Designer(String name,String designation,int salary,String software,boolean isMale,String company) {
    	this.name = name;
    	this.designation = designation;
    	this.salary = salary;
    	this.software = software;
    	this.isMale = isMale;
    	this.company  = company;
    }
    public String toString() {
    	return "NAME: "+name+", ROLE: "+designation+", SALARY: "+salary+", SOFTWARE: "+software+", IS MALE: "+isMale+" "+company;
    }
}

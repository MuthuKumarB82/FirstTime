package collectionsstagereview;

public class Student {
  private String name;
  private int id;
  private String std;
  public void setName(String name) {
	  this.name = name;
  }
  public String getName() {
	  return name;
  }
  public void setId(int id) {
	  this.id = id;
  }
  public int getId() {
	  return id;
  }
  public void setStd(String std) {
	  this.std = std;
  }
  public String getStd() {
	  return std;
  }
  public Student(String name,int id,String std) {
	  this.name = name;
	  this.id  = id;
	  this.std = std;
  }
  public String toString() {
	  return name+" "+id+" "+std;
  }
}

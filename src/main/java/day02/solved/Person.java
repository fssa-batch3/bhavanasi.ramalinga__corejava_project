package day02.solved;

public class Person {
	
    private String name;  

    public String getName() {  
        return name;
    }

    public void setName(String newName) {  
        name = newName;
    }
    

      public static void main(String[] args) {
		Person person = new Person();
		person.setName("John");      
		String name = person.getName(); 
		System.out.println(name); 
		
		}
}
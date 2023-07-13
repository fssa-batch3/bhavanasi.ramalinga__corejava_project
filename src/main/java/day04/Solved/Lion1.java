package day04.Solved;

public class Lion1 extends Animal1{
   public void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}

	public static void main(String[] args) {
		Animal1 simba = new Animal1();
		simba.setAge(10); // setAge() method was not defined in Lion; it is inherited from Animal
		simba.roar();
	}

}

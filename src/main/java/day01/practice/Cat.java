package day01.practice;


public class Cat {
    // Attributes
    private boolean hasDots;
    private String color;


    // Getters and setters
    public boolean hasDots() {
        return hasDots;
    }

    public void setHasDots(boolean hasDots) {
        this.hasDots = hasDots;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        Cat dog1 = new Cat();
        dog1.setColor("purple");
        dog1.setHasDots(false);
        Cat dog2 = new Cat();
        dog2.setColor("blue");
        dog2.setHasDots(true);

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Has Dots: " + dog1.hasDots());
        System.out.println("Color: " + dog1.getColor());

        System.out.println("Cat 2:");
        System.out.println("Has Dots: " + dog2.hasDots());
        System.out.println("Color: " + dog2.getColor());
    }
}
public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages;


    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages;
    }
}
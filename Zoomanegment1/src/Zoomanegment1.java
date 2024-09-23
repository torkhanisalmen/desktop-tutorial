
class Zoomanagement1
{

    public static void main(String[] args)
    {

        Animal lion = new Animal("lion", "simba", 5, true);
        Zoo myZoo = new Zoo("my zoo", "Ariana", 25);
        myZoo.animals[0] = lion;


        myZoo.displayZoo();


        System.out.println(myZoo);

        System.out.println(lion);
    }



}
package Cap3.Dog;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 2/27/13
 * Time: 7:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dog {
    String name;
    public static void main(String[] args) {
        // make a Dog object and access it

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // now make a Dog array

        Dog [] myDogs = new Dog[3];

        // and put some dogs in it

        myDogs [0] = new Dog();
        myDogs [1] = new Dog();
        myDogs [2] = dog1;

        //now access the Dog using the array
        // references

        myDogs [0].name = "Fred";
        myDogs[1].name = "Marge";

        // what's myDog[2] name?

        System.out.print("last dog's name is ");
        System.out.println(myDogs [2].name);

        //now loop trough the array
        //and tell all dogs to bark

        int x = 0;
        while (x < myDogs.length){
            myDogs [x].bark ();
            x = x + 1;
        }
    }
    public void bark (){
        System.out.println(name + " says Ruff!");
    }
    public void eat (){   }
    public void chaseCat(){ }

}

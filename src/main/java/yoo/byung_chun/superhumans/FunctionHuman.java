package yoo.byung_chun.superhumans;

/**
 * Created by byung-chunyoo on 5/1/17.
 */
public class FunctionHuman {
    public static void main (String[] args){

        //make array and use method to call as common

        Human[] person = new Human[3];

        person[0] = new Human("Bill", 45, "male", "unemployed", "Wilmington, DE");
        person[1] = new Human("Anna", 25, "female", "programer", "Greenville, DE");
        person[2] = new Human("Candy", 18, "female", "student", "Newark, De");

        for (Human e: person){
            System.out.println("Name: " + e.getName() + ", age: " + e.getAge() + ", gender: " + e.getGender() + ", occupation: " +
                    e.getOccupation() + ", address: " + e.getAddress());
        }

//        SuperHuman[] superHuman = new SuperHuman[3];
//        superHuman[0] = new SuperHuman("good", "Superman", "Flying");
//        superHuman[1] = new SuperHuman("bad", "Villan", "Disappearing");
//        superHuman[2] = new SuperHuman("good", "Mike", "Mind reading");
//
//        for (SuperHuman e: superHuman){
//            System.out.println("character: " + e.getCharacter() + ", hero name: " + e.getHeroName() + ", super ability: "
//                    + e.getSuperAbility());
//        }
        //below is what Eugene himself wrote to show me the way!!
        Human mySuperHuman = new SuperHuman("evil", "Eugene", "Writing clean code");


        mySuperHuman.setName("New Name");

        System.out.println(mySuperHuman.getName());
    }
}

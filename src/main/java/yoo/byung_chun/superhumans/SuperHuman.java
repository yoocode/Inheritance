package yoo.byung_chun.superhumans;

/**
 * Created by byung-chunyoo on 5/1/17.
 */
public class SuperHuman extends Human {
    private String character;
    private String heroName;
    private String superAbility;

//    public SuperHuman (String name, int age, String gender, String occupation, String address, String character, String heroName, String superAbility){
//        super(name,  age,  gender,  occupation, address);
//
//        this.character = character;
//        this.heroName = heroName;
//        this.superAbility = superAbility;
//
//    }


    public SuperHuman (String character, String heroName, String superAbility){


        this.character = character;
        this.heroName = heroName;
        this.superAbility = superAbility;

    }


//    public String getCharacter() {
//        return character;
//    }
//
//    public void setCharacter(String character) {
//        this.character = character;
//    }
//
//    public String getHeroName() {
//        return heroName;
//    }
//
//    public void setHeroName(String heroName) {
//        this.heroName = heroName;
//    }
//
//    public String getSuperAbility() {
//        return superAbility;
//    }
//
//    public void setSuperAbility(String superAbility) {
//        this.superAbility = superAbility;
//    }

}

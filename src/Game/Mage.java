package Game;

public class Mage extends Hero {
    public Mage(String name){
        super (name);
    }
    @Override
    public void attackEnemy(){
        System.out.println("Маг бросает файербол");
    }
}

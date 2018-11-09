package jp.ac.uryukyu.ie.e185758;

public class Hero extends LivingThing{
    public Hero(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%s勇者は倒れた。\n", name);
        }
    }
}
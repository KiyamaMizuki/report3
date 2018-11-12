package jp.ac.uryukyu.ie.e185758;

public class Hero extends LivingThing{
    public Hero(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    public void wounded(int damage){
         setHitPoint(getHitPoint()-damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("%s勇者は倒れた。\n", getName());
        }
    }
}
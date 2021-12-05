package jp.ac.uryukyu.ie.e215727;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing(String name, int hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sの現在のHPは%d、攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isDead(){
        return this.dead;
    }

    public String getName(){
        return this.name;
    }

    public void attack(LivingThing opponent){
        if(hitPoint>0){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃! %sに%dのダメージ! \n", name, opponent.getName(),damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if(hitPoint<0){
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}

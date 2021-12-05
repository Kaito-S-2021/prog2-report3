package jp.ac.uryukyu.ie.e215727;

public class Hero extends LivingThing{
    public Hero (String name, int hitPoint, int attack){
        super(name,hitPoint,attack);
    }

    public void attack(LivingThing opponent){
        if(hitPoint>0){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃! %sに%dのダメージ!\n", name, opponent.getName(),damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        this.hitPoint -= damage;
        if(hitPoint<0) {
            dead = true;
            System.out.printf("%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}
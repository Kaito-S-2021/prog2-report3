package jp.ac.uryukyu.ie.e215727;

public class Enemy extends LivingThing{
    public Enemy (String name, int hitPoint, int attack) {
        super(name,hitPoint,attack);
    }

    public void attack(LivingThing opponent){
        if(hitPoint>0){
        int damage = (int)(Math.random() * attack);
        System.out.printf("モンスター%sの攻撃! %sに%dのダメージ!\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}
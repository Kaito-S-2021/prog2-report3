package jp.ac.uryukyu.ie.e215727;

public class Warrior extends LivingThing{
    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        int damage =(int)(1.5 * attack);
        if(hitPoint>0){
        System.out.printf("戦士%sの攻撃!ウェポンスキルを発動!%sに％dのダメージ!\n", name, opponent.getName(),damage);
        opponent.wounded((int)damage);
        }
        else{
            opponent.wounded(damage=0);
        }
    }

}

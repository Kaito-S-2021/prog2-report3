package jp.ac.uryukyu.ie.e215727;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero {
    private String name;
    /**
     * hero.nameの文字列のgetter
     * @return getterで取り出した名前
     */
    public String getHeroName(){
        return this.name;
    }
    /**
     * hero.nameの文字列のsetter
     * @param name setterで取り出した名前
     */
    public void setName(String name){
        this.name = name;
    }
    private int hitPoint;
    /**
     * hitpointの値のgetter
     * @return getterで取り出した値
     */
    public int gethitpoint(){
        return this.hitPoint;
    }
    /**
     * hitpointの値のsetter
     * @param hitpoint setterで取り出した値
     */
    public void setHitpoint(int hitpoint){
        this.hitPoint = hitpoint;
    }
    private int attack;
    /**
     * attackの値のgetter
     * @return getterで取り出した値
     */
    public int getattack(){
        return this.attack;
    }
    /**
     * attackの値のsetter
     * @param attack setterで取り出した値
     */
    public void setAttack(int attack){
        this.attack = attack;
    }
    private boolean dead;
    /**
     * isdeadを用いての判定のgetter
     * @return 判定結果
     */
    public boolean isdead(){
        return this.dead;
    }
    /**
     * isdeadを用いての判定のsetter
     * @param dead 判定結果
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(Enemy e){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getEnemyName(), damage);
        e.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}
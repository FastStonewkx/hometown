package com.memoento01.role;

public class GameRole {
    //生命力
    private int vit;
   //攻击力
    private int atk;
    //防御力
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    //状态显示
    public void StateDisplay(){
        System.out.println("角色当前状态：");
        System.out.println("体力："+this.vit);
        System.out.println("体力："+this.atk);
        System.out.println("体力："+this.def);
    }
    //获得初始状态
    public void GetInitState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }
    //战斗
    public void Fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

}

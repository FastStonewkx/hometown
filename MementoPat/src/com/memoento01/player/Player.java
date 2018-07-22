package com.memoento01.player;

import com.memoento01.role.GameRole;

/**
 * 这个不是备忘录模式，只是一种类似的不标准的实现
 */
//客户端调用
public class Player {
    public static void main(String[] args){
        //大战boss前,获得游戏状态
        GameRole sunwukong = new GameRole();
        sunwukong.GetInitState();
        sunwukong.StateDisplay();
        //保存进度

        //保存某个时间地状态，该书地实力缺少游戏进度状态。一看就不是玩游戏的人
        GameRole bankup = new GameRole();
        bankup.setVit(sunwukong.getVit());
        bankup.setAtk(sunwukong.getAtk());
        bankup.setDef(sunwukong.getDef());

        //大战boss，损耗严重
        sunwukong.Fight();
        sunwukong.StateDisplay();

        //恢复之前的状态,这明明就是续命。
        sunwukong.setDef(bankup.getDef());
        sunwukong.setVit(bankup.getVit());
        sunwukong.setAtk(bankup.getAtk());

        sunwukong.StateDisplay();

    }
}

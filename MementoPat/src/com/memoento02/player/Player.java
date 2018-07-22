package com.memoento02.player;

import com.memoento02.role.Caretaker;
import com.memoento02.role.Originator;

/**
 * 游戏角色类 其实就是一个Originator, memoento01相当于对上层应用开放了全部public接口
 * 对于备份是不合适的
 * 更多可能发生的情况是，需要保存的并不是全部信息，而只是一部分，应该有一个独立的备忘录类Memento，
 * 只保存需要保存的信息和属性
 */
//客户端
public class Player {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        Caretaker c = new Caretaker();
        c.setMemento(originator.CreateMemento());

        originator.setState("Off");
        originator.show();

        originator.setMemento(c.getMemento());
        originator.show();

    }
}

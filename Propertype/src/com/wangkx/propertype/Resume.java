package com.wangkx.propertype;

/**
 * 原型模式
 */
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    //设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    //显示
    public void display(){
        System.out.println(name+":"+sex+":"+age);
        System.out.println("工作经历："+timeArea+":"+company);
    }

    public Object Clone(){
        Object obj = null;
        try{
            obj = (Object)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return obj;
    }

    public static void main(String[] args) {
        Resume rs = new Resume("大鸟");
        rs.setPersonalInfo("男","29");
        rs.setWorkExperience("2000-2010","XX公司");

        Resume gb = (Resume)rs.Clone();
        gb.setWorkExperience("2010-2014","YY企业");

        Resume gb1 = (Resume)rs.Clone();
        gb1.setPersonalInfo("男","24");

        rs.display();
        gb.display();
        gb1.display();
        //应该看的还是性能吧


    }
}

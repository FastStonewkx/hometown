package com.wangkx.propertype_1;

//浅复制
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;

    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }
    public void setWorkExperience(String workDate,String company){
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    public void display(){
        System.out.println(name+":"+sex+":"+age);
        System.out.println("工作经历："+work.getWorkDate()+":"+work.getCompany());
    }

    public Object Clone(){
        Object clone = null;
        try{
            clone = (Object)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return  clone;
    }

    //该段代码应该单独建一个类Client完成测试，我偷懒了
    public static void main(String[] args){
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1998-2000","XX公司");

        Resume b = (Resume)a.Clone();
        b.setWorkExperience("1998-2006","YY企业");

        Resume c = (Resume)a.Clone();
        c.setWorkExperience("1998-2003","zz企业");

        a.display();
        b.display();
        c.display();
    }
}

package com.wangkx.propertype_2;
//深复制
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    private Resume(WorkExperience work) {
        this.work = work;
    }

    public void setPersonalInfo() {
        this.age = age;
        this.sex = sex;
    }

    public void setWorkExperience(String workDate, String company) {
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    public void diplay() {
        System.out.println(name + ": " + sex + ": " + age);
        System.out.println("工作经历:["+work.getWorkDate()+"],["+work.getCompany()+"]");
    }

    public Object Clone(){
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
    //该段代码应该单独建一个类Client完成测试，我偷懒了
    public static void main(String[] args){
        com.wangkx.propertype_1.Resume a = new com.wangkx.propertype_1.Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1998-2000","XX公司");

        com.wangkx.propertype_1.Resume b = (com.wangkx.propertype_1.Resume)a.Clone();
        b.setWorkExperience("1998-2006","YY企业");

        com.wangkx.propertype_1.Resume c = (com.wangkx.propertype_1.Resume)a.Clone();
        c.setWorkExperience("1998-2003","zz企业");

        a.display();
        b.display();
        c.display();

    }
}

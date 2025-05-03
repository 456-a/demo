public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;

    public void setName(String name){
       this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 25) {
            this.age = age;
        } else {
            System.out.println("非法数据");
        }
    }

    public int getAge() {
        return this.age;
    }
    public void setGender(String g){
        gender = g;
    }
    public String getGender(){
        return gender;
    }

}

class Person{
    String name;
    int age;
    boolean isMale;

    void setName(String setname){
        name = setname;
    }
    void setAge(int setage){
        age = setage;
    }
    void setGender(String setgender){
        if(setgender.equalsIgnoreCase("Pria")){
            isMale = true;
        }else{
            isMale = false;
        }
    }

    String getName(){
        String getname = name;
        return getname;
    }
    int getAge(){
        int getage = age;
        return getage;
    }
    Boolean getGender(){
        Boolean getgender = isMale;
        return getgender;
    }
}
public class Nomor2 {
    public static void main(String[] args) {
        Person person = new Person();
        
        person.setName("Henokh");
        person.setAge(18);
        person.setGender("Pria");

        System.out.println("Nama : "+person.getName());
        System.out.println("Age : "+person.getAge());
        System.out.println("isMale : "+person.getGender());
    }
}
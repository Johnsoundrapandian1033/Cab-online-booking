enum Gender{
    MALE, FEMALE, TRANCEGENDER;
}
    public class Custamer {
    String name;
    String licenceId;
    Gender gender;
    int age;

    Custamer(String a,String b,  Gender c,int d){
       name = a;
       licenceId = b;
       gender = c;
       age = d;
    }
    public String getCustamer(){
        return "Name : "+name+"\nLicenceId : "+licenceId+"\nGender : "+gender+"\nage : "+age;
    }

}

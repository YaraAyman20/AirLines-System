package Has_A;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yara
 */
public class FamilyMember {
    private String name;
    private String surname;
    private int age;

    public FamilyMember(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nFamilyMember" + "\nName: " + name + "\nSurname: "  + surname + "\nAge: " + age;
    }
    
    
    
    
    
    
}

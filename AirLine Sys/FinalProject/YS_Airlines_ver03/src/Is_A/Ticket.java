package Is_A;

import Has_A.FamilyMember;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import Interface.FindYoungestFamMember;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yara
 */
public abstract class Ticket implements FindYoungestFamMember {

    protected String from;
    protected String to;
    protected int departureDay;
    protected String departureTime;
    protected String name;
    protected String surname;
    protected int age;
    protected String username;
    protected String phoneNumber;
    protected double fee;
    protected ArrayList<FamilyMember> familyMember = new ArrayList<>();

    public Ticket(String from, String to, String departureDay, String departureTime, String name,
            String surname, String age, String username, String phoneNumber) {
        this.from = from;
        this.to = to;
        this.departureDay = Integer.parseInt(departureDay);
        this.departureTime = departureTime;
        this.name = name;
        this.surname = surname;
        this.age = Integer.parseInt(age);
        this.username = username;
        this.phoneNumber = phoneNumber;
    }

    public void addFamilyMember(String name, String surname, int age) {
        familyMember.add(new FamilyMember(name, surname, age));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkUsername(String uname) {
        return this.username.equals(uname);
    }

    public abstract void calcFee(); //Remember to change in UML diagram

    @Override
    public String toString() {
        String res = "";
        res += "\n\nFlight"
                + "\nFrom: " + from
                + "\nTo: " + to
                + "\nDeparture Day: " + departureDay
                + "\nDeparture Time=" + departureTime
                + "\nName: " + name
                + "\nSurname: " + surname
                + "\nAge: " + age
                + "\nUsername: " + username
                + "\nPhoneNumber: " + phoneNumber
                + "\nFee: " + fee;

        if (familyMember.isEmpty()) {
            res += "\n\nFamily Member:\nNo Family Member Added";
        } else {
            for (FamilyMember f : familyMember) {
                res += f.toString();
            }
            res += "\nYoungest Member is:\n" + findYoungestFamMember();

        }

        return res;
    }

    @Override
    public String findYoungestFamMember() {

        String name = "";
        int min = familyMember.get(0).getAge();

        for (int i = 1; i < familyMember.size(); i++) {

            if (familyMember.get(i).getAge() < min) {
                min = familyMember.get(i).getAge();
                name = familyMember.get(i).getName();
            }

        }

        return name;
    }

}

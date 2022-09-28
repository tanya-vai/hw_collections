package guru.qa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VolleyballTeam {

    List<String> memberNames = new ArrayList<>();

    void addNewMemberToTheTeam(String name) {
        memberNames.add(name);
    }


    void removeMember(String name) {
        if (memberNames.contains(name)) {
            memberNames.remove(name);
        } else {
            System.out.println("There is no " + name + " in the team");
        }
    }

    void findMember(String name) {
        if (memberNames.contains(name)) {
            System.out.println(name + " is in the team");
        } else {
            System.out.println("There is " + name + " in the team");
        }
    }

    void printAllMembers() {
        for (String memberName : memberNames) {
            System.out.println("Member of the volleyball team:" + memberName);
        }
    }

}


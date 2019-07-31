package com.github.worklifebeyond;

import java.util.ArrayList;
import java.util.List;

public class WlbRoleHelper {

    public static List<String> getGlobalRoles(String roles){
        List<String> definedRoles = new ArrayList<>();
        if(roles.isEmpty()){
            throw new Error("Role is empty");
        }

        for (int i = 0; i<roles.length(); i++){
            if (i == 0) {
                switch (roles.charAt(0)) {
                    case 0:
                        break;
                    case 1:
                        definedRoles.add(Roles.STUDENT);
                        break;
                }
            } else if (i == 1) {
                switch (roles.charAt(1)) {
                    case 0:
                        break;
                    case 1:
                        definedRoles.add(Roles.INSTRUCTOR);
                        break;
                }
            } else if (i == 2) {
                switch (roles.charAt(2)) {
                    case 0:
                        break;
                    case 1:
                        definedRoles.add(Roles.ORGANIZATION);
                        break;
                }
            }
        }

        return definedRoles;
    }

}

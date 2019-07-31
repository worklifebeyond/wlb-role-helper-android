package com.github.worklifebeyond;


import java.util.ArrayList;

public class WlbRoleHelper {

    public static ArrayList<String> getGlobalRoles(String roles){
        ArrayList<String> definedRoles = new ArrayList<>();

        if(roles.isEmpty()){
            throw new Error("Role is empty");
        }

        for (int i = 0; i< roles.length(); i++){
            if (i == 0) {
                switch (roles.charAt(0)) {
                    case '0':
                        break;
                    case '1':
                        definedRoles.add(Roles.STUDENT);
                        break;
                }
            } else if (i == 1) {
                switch (roles.charAt(1)) {
                    case '0':
                        break;
                    case '1':
                        definedRoles.add(Roles.INSTRUCTOR);
                        break;
                }
            } else if (i == 2) {
                switch (roles.charAt(2)) {
                    case '0':
                        break;
                    case '1':
                        definedRoles.add(Roles.ORGANIZATION);
                        break;
                }
            }
        }

        return definedRoles;
    }



    public static ArrayList<String> getOrgRoles(String roles){
        ArrayList<String> definedRoles = new ArrayList<>();
        if(roles.isEmpty()){
            throw new Error("Role is empty");
        }

        for (int i = 0; i<roles.length(); i++){
            if (i == 0) {
                switch (roles.charAt(0)) {
                    case '0':
                        break;
                    case '1':
                        definedRoles.add(Roles.ORGANIZATION_ADMINISTRATOR);
                        break;
                }
            } else if (i == 1) {
                switch (roles.charAt(1)) {
                    case '0':
                        break;
                    case '1':
                        definedRoles.add(Roles.ORGANIZATION_DEPARTMENT_HEAD);
                        break;
                }
            } else if (i == 2) {
                switch (roles.charAt(2)) {
                    case '0':
                        break;
                    case '1':
                        definedRoles.add(Roles.ORGANIZATION_FINANCE_ADMIN);
                        break;
                }
            }else if (i == 3) {
                switch (roles.charAt(3)) {
                    case '0':
                        break;
                    case '1':
                        definedRoles.add(Roles.ORGANIZATION_HR_ADMIN);
                        break;
                }
            }else if (i == 4) {
                switch (roles.charAt(4)) {
                    case '0':
                        break;
                    case '1':
                        definedRoles.add(Roles.ORGANIZATION_HR_ASSISTANT);
                        break;
                }
            }else if (i == 5) {
                switch (roles.charAt(5)) {
                    case '0':
                        break;
                    case '1':
                        definedRoles.add(Roles.ORGANIZATION_PAYROLL_MASTER);
                        break;
                }
            }else if (i == 6) {
                switch (roles.charAt(6)) {
                    case '0':
                        break;
                    case '1':
                        definedRoles.add(Roles.ORGANIZATION_STAFF);
                        break;
                }
            }else if (i == 7) {
                switch (roles.charAt(7)) {
                    case '0':
                        break;
                    case '1':
                        definedRoles.add(Roles.ORGANIZATION_SUPERVISOR);
                        break;
                }
            }
        }

        return definedRoles;
    }



}

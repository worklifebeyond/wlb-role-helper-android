package com.github.worklifebeyond;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoleUnitTest {

    @Test
    public void return_student_role() {
        String globalRoles = "111";
        assertEquals(Roles.STUDENT, WlbRoleHelper.getGlobalRoles(globalRoles).get(0));
    }

    @Test
    public void return_instructor_role() {
        String globalRoles = "111";
        assertEquals(Roles.INSTRUCTOR, WlbRoleHelper.getGlobalRoles(globalRoles).get(1));
    }


    @Test
    public void return_organization_role() {
        String globalRoles = "111";
        assertEquals(Roles.ORGANIZATION, WlbRoleHelper.getGlobalRoles(globalRoles).get(2));
    }


    @Test
    public void return_org_hr_admin_role() {
        String orgRoles = "00010000";
        assertEquals(Roles.ORGANIZATION_HR_ADMIN, WlbRoleHelper.getOrgRoles(orgRoles).get(0));
    }


    @Test
    public void return_organization_supervisor_role() {
        String orgRoles = "00010001";
        assertEquals(Roles.ORGANIZATION_SUPERVISOR, WlbRoleHelper.getOrgRoles(orgRoles).get(1));
    }





}

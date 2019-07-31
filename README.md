### WorkLifeBeyond Role helper for Android

* Latest version: 

  [![](https://jitpack.io/v/worklifebeyond/wlb-role-helper-android.svg)](https://jitpack.io/#worklifebeyond/wlb-role-helper-android)

#### Install

* in root project

  ```gradle
    allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }

  ```

* in `app` level:

  ```gradle
    dependencies {
            implementation 'com.github.worklifebeyond:wlb-role-helper-android:<latest_version>'
    }
  ```
  
  #### Usage
  
  ```java
  // get global roles
  ArrayList<String> globalRoles =  WlbRoleHelper.getGlobalRoles("111"));
  
  // ["student", "instructor", "organization"]
  
  // get organization roles
  ArrayList<String> orgRoles =  WlbRoleHelper.getOrgRoles("00010000"));
  
  // ["organization-hr-admin"]
 
  if(orgRoles.get(0).equals(Roles.ORGANIZATION_HR_ADMIN)){
    // true
  }
  
  ```

  See [Test](https://github.com/worklifebeyond/wlb-role-helper-android/blob/master/wlbrolehelper/src/test/java/com/github/worklifebeyond/RoleUnitTest.java) for details.

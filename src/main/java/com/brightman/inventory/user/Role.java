package com.brightman.inventory.user;

public class Role {
    private Integer roleId;
    private RoleLevel roleName;
    
    public Integer getRoleId() {
        return roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public RoleLevel getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleLevel roleName) {
        this.roleName = roleName;
    }  
}
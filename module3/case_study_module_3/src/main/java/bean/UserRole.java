package bean;

public class UserRole {
    private String roleId;
    private String userName;

    public UserRole(String roleId, String userName) {
        this.roleId = roleId;
        this.userName = userName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

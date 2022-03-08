package fr.implement.cruiseapp;

public enum Permissions {

    ADMINISTRATOR(0, "Administrateur"),
    MODO(1, "Modérateur"),
    MEMBER(2, "Member")
    ;

    private int permission;
    private String permissionName;

    Permissions(int permission, String permissionName) {
        this.permission = permission;
        this.permissionName = permissionName;
    }


    public int getPermission() {
        return permission;
    }

    public String getPermissionName() {
        return permissionName;
    }
}

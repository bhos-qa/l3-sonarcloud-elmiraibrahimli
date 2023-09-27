package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public String getRoleName(PermissionLevel level) {
        switch (level) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                return "User";
        }
    }

    public void setPermissionLevel(PermissionLevel level) {
        mCurrentLevel = level;
    }

    public PermissionLevel getCurrentLevel() {
        return mCurrentLevel;
    }
}

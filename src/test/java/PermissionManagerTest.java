import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.PermissionManager;
import org.example.PermissionLevel;

public class PermissionManagerTest {

    @Test
    public void testGetRoleNameAdmin() {
        PermissionManager manager = new PermissionManager();
        String roleName = manager.getRoleName(PermissionLevel.ADMIN);
        assertEquals("Admin", roleName);
    }

    @Test
    public void testGetRoleNameDeveloper() {
        PermissionManager manager = new PermissionManager();
        String roleName = manager.getRoleName(PermissionLevel.DEVELOPER);
        assertEquals("Developer", roleName);
    }

    @Test
    public void testGetRoleNameUser() {
        PermissionManager manager = new PermissionManager();
        String roleName = manager.getRoleName(PermissionLevel.USER);
        assertEquals("User", roleName);
    }

    @Test
    public void testGetRoleNameUnknown() {
        PermissionManager manager = new PermissionManager();
        String roleName = manager.getRoleName(null); // Test with an unknown level
        assertEquals("Unknown", roleName);
    }

    @Test
    public void testSetPermissionLevel() {
        PermissionManager manager = new PermissionManager();
        manager.setPermissionLevel(PermissionLevel.ADMIN);
        assertEquals(PermissionLevel.ADMIN, manager.getCurrentLevel());
    }
}

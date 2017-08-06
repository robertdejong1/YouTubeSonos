import base.Resources;
import org.junit.Assert;
import org.junit.Test;
import youtubesonos.R;
import youtubesonos.S;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class ResourcesTest {

    @Test
    public void testResourcesStrings() throws IllegalAccessException {
        List<String> notFoundKeys = new ArrayList<>();

        for (Field field : R.class.getDeclaredFields()) {
            if (Modifier.isFinal(field.getModifiers()) && Modifier.isPublic(field.getModifiers())) {
                String key = (String) field.get(null);
                if (!stringKeyExists(key))
                    notFoundKeys.add(field.getName() + "(" + key + ")");
            }
        }

        if (!notFoundKeys.isEmpty())
            Assert.fail("The following resource(s) could not be found: " + String.join(", ", notFoundKeys));
    }

    @Test
    public void testResourcesSettings() throws IllegalAccessException {
        List<String> notFoundKeys = new ArrayList<>();

        for (Field field : S.class.getDeclaredFields()) {
            if (Modifier.isFinal(field.getModifiers()) && Modifier.isPublic(field.getModifiers())) {
                String key = (String) field.get(null);
                if (!settingKeyExists(key))
                    notFoundKeys.add(field.getName() + "(" + key + ")");
            }
        }

        if (!notFoundKeys.isEmpty())
            Assert.fail("The following resource(s) could not be found: " + String.join(", ", notFoundKeys));
    }

    private boolean stringKeyExists(String key) {
        try {
            return !R.getResources().getString(key).isEmpty();
        }
        catch(Exception e) {
            return false;
        }
    }

    private boolean settingKeyExists(String key) {
        try {
            return !S.getResources().getString(key).isEmpty();
        }
        catch(Exception e) {
            return false;
        }
    }

}

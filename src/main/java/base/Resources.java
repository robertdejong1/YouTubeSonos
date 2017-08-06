package base;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

public class Resources {

    private final String bundleName;

    public Resources(String bundleName) {
        this.bundleName = bundleName;
    }

    public String getString(String key, List<Locale> locales) {
        for (Locale locale : locales) {
            String result = getString(key, locale);
            if (!result.isEmpty())
                return result;
        }
        return getString(key);
    }

    public String getString(String key, Locale locale) {
        ResourceBundle bundle = getBundle(locale);
        if (bundle != null) {
            return getString(key, bundle);
        }
        return "";
    }

    public String getString(String key) {
        return getBundle().getString(key);
    }

    private String getString(String key, ResourceBundle bundle) {
        if (bundle.containsKey(key)) {
            return bundle.getString(key);
        }

        //Key not found in this bundle, use default bundle
        return getString(key);
    }

    private ResourceBundle getBundle() {
        return getBundle(Locale.ROOT);
    }

    private ResourceBundle getBundle(Locale locale) {
        Control control = Control.getControl(Control.FORMAT_PROPERTIES);
        try {
            return control.newBundle(bundleName, locale, Control.FORMAT_PROPERTIES.get(0), Resources.class.getClassLoader(), false);
        }
        catch (Exception e) {
            return null;
        }
    }

}

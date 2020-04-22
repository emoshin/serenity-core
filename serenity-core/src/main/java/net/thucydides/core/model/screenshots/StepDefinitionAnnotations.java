package net.thucydides.core.model.screenshots;

import net.thucydides.core.model.TakeScreenshots;

public class StepDefinitionAnnotations {

    private final static ThreadLocal<TakeScreenshots> screenshotOverride = ThreadLocal.withInitial(() -> TakeScreenshots.UNDEFINED);

    public static void setScreenshotPreferencesTo(TakeScreenshots takeScreenshotPreference) {
        screenshotOverride.set(takeScreenshotPreference);
    }

    public static TakeScreenshots getScreenshotPreferences() {
        return screenshotOverride.get();
    }

    public static void clear() { screenshotOverride.set(TakeScreenshots.UNDEFINED); };
}

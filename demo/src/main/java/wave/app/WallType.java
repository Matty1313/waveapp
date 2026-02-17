package wave.app;

import javafx.scene.paint.Color;

public enum WallType {
    SOLID("Solid Wall", 0.9, 0.1, Color.WHITE),
    WATER("Water", 0.2, 0.8, Color.CYAN),
    GLASS("Glass", 0.3, 0.7, Color.LIGHTBLUE),
    ABSORBER("Absorber", 0.1, 0.0, Color.DARKGRAY),
    MIRROR("Mirror", 1.0, 0.0, Color.YELLOW),
    CUSTOM("Custom", 0.5, 0.5, Color.MAGENTA);
    
    private final String displayName;
    private final double defaultReflection;
    private final double defaultTransmission;
    private final Color color;
    
    WallType(String displayName, double reflection, double transmission, Color color) {
        this.displayName = displayName;
        this.defaultReflection = reflection;
        this.defaultTransmission = transmission;
        this.color = color;
    }
    
    public String getDisplayName() { return displayName; }
    public double getDefaultReflection() { return defaultReflection; }
    public double getDefaultTransmission() { return defaultTransmission; }
    public Color getColor() { return color; }
}
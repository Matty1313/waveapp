package wave.app;

public class Wall {
        double x1, y1, x2, y2;
        double normalX, normalY;
        double length;
        
        Wall(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            
            // Calculate wall vector and normal
            double dx = x2 - x1;
            double dy = y2 - y1;
            this.length = Math.sqrt(dx * dx + dy * dy);
            
            // Normal vector (perpendicular to wall)
            this.normalX = -dy / length;
            this.normalY = dx / length;
        }
    }

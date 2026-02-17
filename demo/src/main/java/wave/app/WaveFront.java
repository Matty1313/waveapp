package wave.app;

public class WaveFront {
        double x, y;
        double angle;
        int age = 0;
        double amplitude;
        int generation; // Track number of reflections
        
        WaveFront(double x, double y, double angle, double amplitude, int generation) {
            this.x = x;
            this.y = y;
            this.angle = angle;
            this.amplitude = amplitude;
            this.generation = generation;
        }
    }

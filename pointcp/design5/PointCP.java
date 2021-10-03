abstract class PointCP{
    public PointCP(){}
    public abstract double getX();
    public abstract double getY();
    public abstract double getRho();
    public abstract double getTheta();
    public abstract double getDistance(PointCP pointB);
    public abstract String toString();
}
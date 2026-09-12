class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = Math.abs(((11.0 / 2) * minutes) - (30 * hour));
        if (360 - angle <= 180) {
            return 360 - angle;
        }
        return angle;
    }
}
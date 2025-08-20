public class volume_earth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;
        double volumeKm = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f\n", volumeKm, volumeMiles);
    }
}

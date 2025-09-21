public class Problem1 {
    public static void main(String[] args) {
        double earthDiameter = 7600.0;
        double sunDiameter = 865000.0;


        //Calculating Radius  (diameter/2)
        double earthRadius = earthDiameter / 2.0;  
        double sunRadius = sunDiameter / 2.0;

        // Calculating Volume of Sphere   ( (3/4)*PI*r^3)
        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);

        // Calculating Ratio of Volume of Sun to Volume of Earth
        double ratio = sunVolume / earthVolume;

        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles, \nthe volume of the sun is " + sunVolume + " cubic miles, \nand the ratio of the volume of the Sun to the volume of the Earth is " + ratio);
    }
}
package problem1;

public class MathCalc {

	public static void main(String[] args) {
		double diameterSun = 865000.0;
        double diameterEarth = 7600.0; 
        double radiusSun = 865000.0;
        double radiusEarth = 7600.0; 
        double volumeSun = 865000.0;
        double volumeEarth = 7600.0; 
        double volumeRatio = 865000.0; 


        radiusSun = diameterSun / 2;
        radiusEarth = diameterEarth / 2;

        volumeSun = (4.0 / 3.0) * Math.PI * Math.pow(radiusSun, 3);
        volumeEarth = (4.0 / 3.0) * Math.PI * Math.pow(radiusEarth, 3);

        volumeRatio = volumeSun / volumeEarth;

        System.out.printf("The volume of the Earth is %.2f cubic miles, the volume of the Sun is %.2f cubic miles, "
        		+ "and the ratio of the volume of the Sun to the volume of the Earth is %.2f.%n"
        		, volumeEarth, volumeSun, volumeRatio);
    }

}

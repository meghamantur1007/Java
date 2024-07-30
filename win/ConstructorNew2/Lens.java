class Lens{
	String focalLength;
    double aperture;
	
	public Lens(String focalLengthLocal, double apertureLocal){
		focalLength=focalLengthLocal;
		aperture=apertureLocal;
		System.out.println("Lens focalLength:"+focalLength);
		System.out.println("Lens aperture:"+aperture);
	}
}
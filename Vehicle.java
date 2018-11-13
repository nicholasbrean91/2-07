public class Vehicle {

	private static String _lPlateNum;
	private static String _colour;
	private static String _wheels;

	
	public Vehicle ( 
						String lPlateNum,
						String colour,
						String wheels){
		
		this._lPlateNum = lPlateNum;
		this._colour = colour;
		this._wheels = wheels;
		
	}
	
	public String lPlateNum(){
		return _lPlateNum;
	}
	public String colour(){
		return _colour;
	}
	public String wheels(){
		return _wheels;
	}
}

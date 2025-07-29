package assessment;

public class Box {
	double width;
	double heigth;
	double depth;
	 Box(double w,double h,double d)
	 {
		 width=w;
		 heigth=h;
		 depth=d;
	 }

     double volume() {
    	return width*heigth*depth; 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box v=  new Box(10,20,30);
		double res=v.volume();
        System.out.println(res);
	}

}

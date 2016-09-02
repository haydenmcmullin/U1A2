// Hayden McMullin
//AP Computer Sciences
// 08/30/16
// U1A2
//Academic Integrity Statement: 
// I have not copied, plagiarized or allowed another student to complete this exercise.  I attest that this is my own work //and reflects my understanding of the material.
/* Project Description: creates a cylinder object and prints its radius, height, surface area, and volume.
 */
public class CylinderDriver 
{
	public static void main(String args[])
	{
		Cylinder x=new Cylinder(); //x=New Object 
		double sa, v; //sa=Surface area v= Volume
		
		sa = x.surfaceArea();
		v = x.volume();
		
		System.out.println(x.getRadius());
		System.out.println(x.getHeight());
		System.out.println();
		System.out.println("Surface Area = " + sa);
		System.out.println("Volume = " + v);
	}
}
/* output
2
5

Surface Area = 87.92
Volume = 62.800000000000004
*/

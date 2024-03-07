/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	   
	float [] mes = {100, 100, 100};
	
   float vmd;
   float emin;
   float emax;
   
   float tr = 5;
   float lr = 50;
   float ea = 70;
     
    vmd = ((mes[0] + mes[1] + mes[2])/3)/25;
   
    emin = (vmd*tr);
    
    emax = (lr+emin);

	System.out.println(String.format("%.2f", vmd));
	System.out.println(String.format("%.2f", emin));
	System.out.println(String.format("%.2f", emax));
	
	if (ea > emin) { 
	System.out.println("Não comprar");
	} else {
	System.out.println("Comprar"); 
	}
	
	
	
	}	
}

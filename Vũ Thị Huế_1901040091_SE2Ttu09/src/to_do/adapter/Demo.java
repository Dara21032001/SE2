package to_do.adapter;

import to_do.adapter.adapter.SquarePegAdapter;
import to_do.adapter.round.RoundHole;
import to_do.adapter.round.RoundPeg;
import to_do.adapter.square.SquarePeg;


/**
 * Somewhere in client code...
 */
public class Demo {
	public static void main(String[] args) {
		//TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
		RoundHole hole = new RoundHole(5);
		RoundPeg rpeg = new RoundPeg(5);
		//TO-DO: If RoundHole instance can "fits" with RoundPeg instance => show a message
	 if(hole.fits(rpeg)){
		 System.out.println("Round peg with radius 5 fits round hold radius 5");
	 }
		//TO-DO: Create 2 instances of SquarePeg with 2 different widths
		SquarePeg smallSquarePeg = new SquarePeg(2);
	 	SquarePeg largeSquarePeg = new SquarePeg(20);
		//Note: You can't make RoundHole instance "fit" with SquarePeg instance
		//Therefore, we need to use Adapter for solving the problem.
		
		//TO-DO: Create 2 corresponding instances of SquarePegAdapter  
		SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallSquarePeg);
		SquarePegAdapter largePegAdapter = new SquarePegAdapter(largeSquarePeg);
		//TO-DO: If the RoundHole instance can "fits" with "small" RoundPegAdapter instance 
		//show a suitable message
	 	if(hole.fits(smallPegAdapter)){
			System.out.println("Square peg with width 2 fits round hold with radius 5");
		}
		if(hole.fits(smallPegAdapter)){
			System.out.println("Square peg with width 2 fits round hold with radius 5");
		}
		//TO-DO: If the RoundHole instance can not "fits" with "big" RoundPegAdapter instance
		if(!hole.fits(largePegAdapter)){
			System.out.println("Square peg with width 20 fits round hold with radius 5");
		}
		//show a suitable message
	}
}
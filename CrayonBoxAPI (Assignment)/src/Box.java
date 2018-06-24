

public class Box {
	private Crayon crayons[];
	// Note the order of creation should match the ordinal values of the colors.
	public Box() {				
		Crayon box[] = {new Crayon(10,Color.RED),new Crayon(10,Color.ORANGE),new Crayon(10,Color.YELLOW),new Crayon(10,Color.GREEN),new Crayon(10,Color.BLUE),new Crayon(10,Color.VIOLET),new Crayon(10,Color.BROWN),new Crayon(10,Color.BLACK)};
		crayons = box;
	}	
	public void add(Crayon c1){
		System.out.println("Color: " + c1.getColor().toString() + " Has been ADDED Back to the Box"+"\n");
		crayons[c1.getColor().ordinal()] = c1;
	}
	
	public Crayon remove(Color col){
		System.out.println("Color: " + col.toString() + " Has been REMOVED from the Box"+"\n");
		Crayon c1 = crayons[col.ordinal()];
		crayons[col.ordinal()] = null;
		return c1;
		
	}
	public void sharpen(Crayon c1){ 
		double ln = c1.getLength();
		System.out.println("Sharpening the " + c1.getColor().toString() +" crayon.");
		c1.setLength(ln - .75);
		System.out.println("The " + c1.getColor().toString() + " crayon is now " + Double.toString(c1.getLength()) +"cm. long."+"\n");
		
	}
	@Override
	public String toString(){  
		String crayInfo ="";
		
		for(int i =0; i<crayons.length;i++){
			if(crayons[i]!=null){
				crayInfo = crayInfo +"Crayon:" + crayons[i].getColor().ordinal()+" Color:" + crayons[i].getColor().toString()+ " Length:" + Double.toString (crayons[i].getLength()) + "\n";
			}else if (crayons[i]==null){
				crayInfo = crayInfo	+"Crayon:" + i + " Missing"+"\n";
			}
			
		}
		
		String result = "Box:\n" + crayInfo;
		return result;
		
		
	}
}

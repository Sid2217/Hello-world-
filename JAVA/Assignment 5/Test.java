

class Vowel extends Exception{

	

}
class Blank extends Exception{

	

}
class Exit extends Exception{

	public void close(){
		System.exit(0);
	}

}
public class Test{

public static void main(String args[]){

	
	Character s=args[0].charAt(0);
	try{
	if(s=='a' || s=='e'|| s=='i'|| s=='o'|| s=='u'){
	
		throw new Vowel();	
		}
	}
	catch(Vowel e){
		e.printStackTrace();
	}
	try{
	if(s==' '){
	
		throw new Blank();	
		}
	}
	catch(Blank e){
		e.printStackTrace();
	}
	try{
	if(s=='X'){
	
		throw new Exit();	
		}
		System.out.print("valid");
	}
	
	catch(Exit e){
		e.close();
	}
	
}


}

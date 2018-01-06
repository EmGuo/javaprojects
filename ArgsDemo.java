import java.lang.Integer;
public class ArgsDemo {
	public static void main(String[] args) {
		//System.out.println(args[0]);
		int index = 0;
		int total = 0;

		while (index < args.length){
			total = total + Integer.parseInt(args[index]);
			index += 1;
		}
		System.out.println(total);
	}
}




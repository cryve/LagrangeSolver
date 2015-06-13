import java.util.*;

public class LagrangeMain{
        
	public static void main(String[] args) {
		System.out.println("==LaGrange Solver v0.1==");
        while(true){
           System.out.println("Bitte gebe 3 oder 4 Punkte in der Form x1,y1,x2,y2... ein:");
            Scanner scanner = new Scanner(System.in);
            String[] points = scanner.nextLine().split(",");        
            if(points.length == 6){
                int x1 = Integer.parseInt(points[0]);
                int y1 = Integer.parseInt(points[1]);
                int x2 = Integer.parseInt(points[2]);
                int y2 = Integer.parseInt(points[3]);
                int x3 = Integer.parseInt(points[4]);
                int y3 = Integer.parseInt(points[5]);
                System.out.println(new LagrangeSolver(x1,y1,x2,y2,x3,y3));
                break;
           /* } else if(points.length == 8){
                int x1 = Integer.parseInt(points[0]);
                int y1 = Integer.parseInt(points[1]);
                int x2 = Integer.parseInt(points[2]);
                int y2 = Integer.parseInt(points[3]);
                int x3 = Integer.parseInt(points[4]);
                int y3 = Integer.parseInt(points[5]);
                int x4 = Integer.parseInt(points[6]);
                int y4 = Integer.parseInt(points[7]);
                System.out.println(new LagrangeSolver(x1,y1,x2,y2,x3,y3,x4,y4));
                break;*/
            } else {
                System.out.println("Es werden nur 3 oder 4 Punkte unterstuetzt.");  
            }             
        }
        
	}
   
}
import java.util.Scanner;
public class AdjMatrix{
	private int numNodes;
	private int [][] matrix;
	private Scanner scanner ;

	public AdjMatrix(){
		this.scanner = new Scanner(System.in);
        this.numNodes = scanner.nextInt();;
        this.matrix = new int[this.numNodes][this.numNodes];
        }

	public void initGraph(){
		for(int i=0;i<this.numNodes;i++){
			for(int j=0;j<this.numNodes;j++){
				System.out.println("Enter the cost from Node"+(i+1)+" to Node"+(j+1));
				this.matrix[i][j] = this.scanner.nextInt();
			}
		}
	}

	public void printGraph(){
		for(int i=0;i<this.numNodes;i++){
			for(int j=0;j<this.numNodes;j++){
				System.out.print("  "+this.matrix[i][j]);
			}
			System.out.println("  ");
		}
	}

	public static void  main(String[] args){
		System.out.print("Enter the number of Vertices ") ;
		AdjMatrix adjMatrix = new AdjMatrix();
		adjMatrix.printGraph();
		adjMatrix.initGraph();
		adjMatrix.printGraph();
	}
}

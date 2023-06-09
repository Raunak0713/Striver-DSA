package Step_1_Basics.Step_2_LogicBuilding;

// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5


public class four {
    public static void main(String[] args) {
        System.out.println();
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i+1 + " "); 
            }
            System.out.println();
        }
        System.out.println();
    }
}

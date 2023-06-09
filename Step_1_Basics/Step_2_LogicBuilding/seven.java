package Step_1_Basics.Step_2_LogicBuilding;

//       *         
//     * * *       
//   * * * * *     
// * * * * * * *   

public class seven {
    public static void main(String[] args) {
        System.out.println();
        for(int i=0; i<4; i++){
            for(int j=0; j<4-i; j++){
                System.out.print("  ");
            }
            for(int j=0; j<(i*2)+1; j++){
                System.out.print("* ");
            }
            for(int j=0; j<4-i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

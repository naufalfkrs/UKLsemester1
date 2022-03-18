/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKLsemester1;

/**
 *
 * @author asus
 */
public class UKL_XR7_25 {
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][]={{4,3,5},{6,2,3}};
        int b[][]={{1,2},{2,3},{3,4}};
        System.out.println("Hasil AxB");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < 2; j++){ 
                int hasil = 0;
                for (int k = 0; k < a[i].length; k++){
                    hasil+=(a[i][k] * b[k][j]);
                }
                System.out.print(hasil+"\t");
            }
            System.out.println();
        }
    }
}

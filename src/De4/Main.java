/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De4;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author winan
 */
public class Main {

    static File_Sv mn = new File_Sv();

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            mn.menu();
            int c = new Scanner(System.in).nextInt();
            switch (c) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    mn.show_tbl();
                    break;
                case 4:
                    exit(0);
            }
        }
    }

}

package tetramino;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author julian
 */
public class Tetramino {

 /**
  * @param args the command line arguments
  */
 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  int op;
  int matrizS[][] = new int[4][3];
  int matrizZ[][] = new int[4][3];

  for (int i = 0; i < 4; i++) {
   for (int j = 0; j < 3; j++) {
    matrizS[i][j] = 0;
    matrizZ[i][j] = 0;
   }
  }

  while (true) {
   System.out.println("Elija figura \n1.Tretramino S\n2.Tetramino Z");

   op = Integer.parseInt(br.readLine());
   switch (op) {

    case 1: {
     matrizS[0][1] = 1;
     matrizS[0][2] = 1;
     matrizS[1][0] = 1;
     matrizS[1][1] = 1;
     for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
       System.out.print("[");
       System.out.print(matrizS[i][j]);
       System.out.print("]");
      }
      System.out.println("");
     }
     for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
       matrizS[i][j] = 0;
       matrizZ[i][j] = 0;
      }
     }
     int rot = 0;
     int es1 = 0, es2 = 1;
     while (rot != 4) {
      System.out.println("elija la direccion de rotacion \n1.estado final \n2.estado inicial\n3.abajo\n4.salir");
      rot = Integer.parseInt(br.readLine());

      if (rot == 1) {
       es1 = es1 + 1;
       for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 3; j++) {
         matrizS[i][j] = 0;
         matrizZ[i][j] = 0;
        }
       }
       matrizS[0][0] = 1;
       matrizS[1][0] = 1;
       matrizS[1][1] = 1;
       matrizS[2][1] = 1;
       for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 3; j++) {
         System.out.print("[");
         System.out.print(matrizS[i][j]);
         System.out.print("]");
        }
        System.out.println("");
       }

      } else if (rot == 2) {
       es2 = es2 + 1;
       for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 3; j++) {
         matrizS[i][j] = 0;
         matrizZ[i][j] = 0;
        }
       }
       matrizS[0][1] = 1;
       matrizS[0][2] = 1;
       matrizS[1][0] = 1;
       matrizS[1][1] = 1;
       for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 3; j++) {
         System.out.print("[");
         System.out.print(matrizS[i][j]);
         System.out.print("]");
        }
        System.out.println("");
       }

      } else if (rot == 3) {
       if (es1 == es2) {

        for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 3; j++) {
          matrizS[i][j] = 0;
          matrizZ[i][j] = 0;
         }
        }
        matrizS[1][0] = 1;
        matrizS[2][0] = 1;
        matrizS[2][1] = 1;
        matrizS[3][1] = 1;
        for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 3; j++) {
          System.out.print("[");
          System.out.print(matrizS[i][j]);
          System.out.print("]");
         }
         System.out.println("");
        }
       } else if (es1 != es2) {
        for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 3; j++) {
          matrizS[i][j] = 0;
          matrizZ[i][j] = 0;
         }
        }
        matrizS[1][1] = 1;
        matrizS[1][2] = 1;
        matrizS[2][0] = 1;
        matrizS[2][1] = 1;
        for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 3; j++) {
          System.out.print("[");
          System.out.print(matrizS[i][j]);
          System.out.print("]");
         }
         System.out.println("");
        }
       }

      }
     }

    }
    break;
    
    
    
    
    
    
    case 2:{
     matrizZ[0][0] = 1;
     matrizZ[0][1] = 1;
     matrizZ[1][1] = 1;
     matrizZ[1][2] = 1;
     for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
       System.out.print("[");
       System.out.print(matrizZ[i][j]);
       System.out.print("]");
      }
      System.out.println("");
     }
     for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
       matrizZ[i][j] = 0;
       matrizZ[i][j] = 0;
      }
     }
     int rot = 0;
     int es1 = 0, es2 = 1;
     while (rot != 4) {
      System.out.println("elija la direccion de rotacion \n1.estado final \n2.estado inicial\n3.abajo\n4.salir");
      rot = Integer.parseInt(br.readLine());

      if (rot == 1) {
       es1 = es1 + 1;
       for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 3; j++) {
         matrizZ[i][j] = 0;
         matrizS[i][j] = 0;
        }
       }
       matrizZ[0][2] = 1;
       matrizZ[1][1] = 1;
       matrizZ[1][2] = 1;
       matrizZ[2][1] = 1;
       for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 3; j++) {
         System.out.print("[");
         System.out.print(matrizZ[i][j]);
         System.out.print("]");
        }
        System.out.println("");
       }

      } else if (rot == 2) {
       es2 = es2 + 1;
       for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 3; j++) {
         matrizZ[i][j] = 0;
         matrizS[i][j] = 0;
        }
       }
       matrizZ[0][0] = 1;
       matrizZ[0][1] = 1;
       matrizZ[1][1] = 1;
       matrizZ[1][2] = 1;
       for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 3; j++) {
         System.out.print("[");
         System.out.print(matrizZ[i][j]);
         System.out.print("]");
        }
        System.out.println("");
       }

      } else if (rot == 3) {
       if (es1 == es2) {

        for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 3; j++) {
          matrizS[i][j] = 0;
          matrizZ[i][j] = 0;
         }
        }
        matrizZ[1][0] = 1;
        matrizZ[1][1] = 1;
        matrizZ[2][1] = 1;
        matrizZ[2][2] = 1;
        for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 3; j++) {
          System.out.print("[");
          System.out.print(matrizZ[i][j]);
          System.out.print("]");
         }
         System.out.println("");
        }
       } else if (es1 != es2) {
        for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 3; j++) {
          matrizS[i][j] = 0;
          matrizZ[i][j] = 0;
         }
        }
        matrizZ[1][2] = 1;
        matrizZ[2][1] = 1;
        matrizZ[2][2] = 1;
        matrizZ[3][1] = 1;
        for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 3; j++) {
          System.out.print("[");
          System.out.print(matrizZ[i][j]);
          System.out.print("]");
         }
         System.out.println("");
        }
       }

      }
     }

    }

   }
   break;
  }

 }

}

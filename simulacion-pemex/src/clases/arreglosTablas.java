/*
Instituto Tecnológico Superior de Tacámbaro
Ingeniería en Sistemas Computacionales 
5º Semestre
Docente: MC. Oscar Alvarez Arriaga   
Almunos: Celestino Moreno Rodrigez N.Control: 20940087
          Luis Alberto Zavala cruz N.Control: 
          Jair Ziranda Villalon N.Control:

Este es un programa el cual genera numeros pseudoaleatorios a partir del método congruencial mixto
y que estos posteriormente son validos las pruebas estadicas de medias, varianza y forma.
*/

package Clases;


//esta clase contiene las valores mediante arreglos que se necesitaran de las tablas chi cuadrada
public class arreglosTablas {
    

         double columna05 [] = new double[41];
         double columna95 [] = new double[41];
         double columna975 [] = new double [41];
         double columna025 [] = new double [41];
         double columna005 [ ] = new double[41];
         double columna995 [] = new double [41];
        
         public arreglosTablas(){
  
        columna05 [0] = 3.84;
        columna05 [1] = 5.99;
        columna05 [2] = 7.81;
        columna05 [3] = 9.49;
        columna05 [4] = 11.07;
        columna05 [5] =12.59 ;
        columna05 [6] = 14.07;
        columna05 [7] = 15.51;
        columna05 [8] = 16.92;
        columna05 [9] = 18.31;
        columna05 [10] = 19.68;
        columna05 [11] =21.0 ;
        columna05 [12] = 22.4;
        columna05 [13] = 23.7;
        columna05 [14] = 25;
        columna05 [15] = 26.3;
        columna05 [16] = 27.6;
        columna05 [17] = 28.9;
        columna05 [18] = 30.1;
        columna05 [19] = 31.4;
        columna05 [20] = 32.7;
        columna05 [21] = 33.9;
        columna05 [22] = 35.2;
        columna05 [23] = 36.4;
        columna05 [24] = 37.7;
        columna05 [25] = 38.9;
        columna05 [26] = 40.1;
        columna05 [27] = 41.3;
        columna05 [28] = 42.6;
        columna05 [29] = 43.8;
        columna05 [30] =55.8 ;
        columna05 [31] = 67.5;
        columna05 [32] = 79.1;
        columna05 [33] = 90.5;
        columna05 [34] = 101.9;
        columna05 [35] = 113.1;
        columna05 [36] = 124.3;
        columna05 [37] = 233.9942;
        columna05 [38] = 341.395;
        columna05 [39] = 447.3515;
        columna05 [40] = 553.8514;
        
        
        columna95 [0] =1;
        columna95 [1] =0.103;
        columna95 [2] =0.352;
        columna95 [3] =0.711;
        columna95 [4] =1.145;
        columna95 [5] =1.635;
        columna95 [6] =2.17;
        columna95 [7] =2.73;
        columna95 [8] =3.33;
        columna95 [9] =3.94;
        columna95 [10] =4.57;
        columna95 [11] =5.23;
        columna95 [12] =5.89;
        columna95 [13] =6.57;
        columna95 [14] =7.26;
        columna95 [15] =7.96;
        columna95 [16] =8.67;
        columna95 [17] =9.39;
        columna95 [18] =10.12;
        columna95 [19] =10.85;
        columna95 [20] =11.59;
        columna95 [21] =12.34;
        columna95 [22] =13.09;
        columna95 [23] =13.85;
        columna95 [24] =14.61;
        columna95 [25] =15.38;
        columna95 [26] =16.15;
        columna95 [27] =16.93;
        columna95 [28] =17.71;
        columna95 [29] =18.49;
        columna95 [30] =26.5;
        columna95 [31] =34.8;
        columna95 [32] =43.2;
        columna95 [33] =51.7;
        columna95 [34] =60.4;
        columna95 [35] =69.1;
        columna95 [36] =77.9;
        columna95 [37] =168.2785;
        columna95 [38] =260.8781;
        columna95 [39] =354.4875;
        columna95 [40] =449.1467;
        
        
        columna975 [0] =1;
        columna975 [1] = 2;
        columna975 [2] = 0.216;
        columna975 [3] = 0.484;
        columna975 [4] = 0.831;
        columna975 [5] = 1.237;
        columna975 [6] =1.690 ;
        columna975 [7] = 2.18;
        columna975 [8] = 2.70;
        columna975 [9] = 3.25;
        columna975 [10] = 3.82;
        columna975 [11] = 4.40;
        columna975 [12] = 5.01;
        columna975 [13] = 5.63;
        columna975 [14] = 6.26;
        columna975 [15] = 6.91;
        columna975 [16] = 7.56;
        columna975 [17] = 8.23;
        columna975 [18] = 8.91;
        columna975 [19] = 9.59;
        columna975 [20] = 10.28;
        columna975 [21] = 10.98;
        columna975 [22] = 11.69;
        columna975 [23] = 12.40;
        columna975 [24] = 13.12;
        columna975 [25] = 13.84;
        columna975 [26] = 14.57;
        columna975 [27] = 15.31;
        columna975 [28] = 16.05;
        columna975 [29] = 16.79;
        columna975 [30] = 24.4;
        columna975 [31] = 32.4;
        columna975 [32] = 40.5;
        columna975 [33] = 48.8;
        columna975 [34] = 57.2;
        columna975 [35] = 65.6;
        columna975 [36] = 74.2;
        columna975 [37] = 162.78;
        columna975 [38] = 253.9122;
        columna975 [39] = 346.01;
        columna975 [40] = 439.9360;
        
        
        columna025 [0] = 5.02;
        columna025 [1] = 7.38;
        columna025 [2] = 9.35;
        columna025 [3] = 11.14;
        columna025 [4] = 12.83;
        columna025 [5] = 14.45;
        columna025 [6] = 16.01;
        columna025 [7] = 17.53;
        columna025 [8] = 19.02;
        columna025 [9] = 20.5;
        columna025 [10] =21.9 ;
        columna025 [11] = 23.3;
        columna025 [12] = 24.7;
        columna025 [13] = 26.1;
        columna025 [14] = 27.5;
        columna025 [15] = 28.8;
        columna025 [16] = 30.2;
        columna025 [17] = 31.5;
        columna025 [18] = 32.9;
        columna025 [19] = 34.2;
        columna025 [20] = 35.5;
        columna025 [21] = 36.8;
        columna025 [22] = 38.1;
        columna025 [23] = 39.4;
        columna025 [24] = 40.6;
        columna025 [25] = 41.9;
        columna025 [26] = 43.2;
        columna025 [27] = 44.5;
        columna025 [28] = 45.7;
        columna025 [29] = 47.0;
        columna025 [30] = 59.3;
        columna025 [31] = 71.4;
        columna025 [32] = 83.3;
        columna025 [33] = 95.0;
        columna025 [34] = 106.6;
        columna025 [35] = 118.1;
        columna025 [36] = 129.6;
        columna025 [37] = 241.0578;
        columna025 [38] = 349.8745;
        columna025 [39] = 456.8233;
        columna025 [40] = 576.4931;

        columna005 [0] = 7.88;
        columna005 [1] = 10.60;
        columna005 [2] = 12.84;
        columna005 [3] = 14.86;
        columna005 [4] = 16.75;
        columna005 [5] = 18.55;
        columna005 [6] = 20.3;
        columna005 [7] = 22;
        columna005 [8] = 23.6;
        columna005 [9] = 25.2;
        columna005 [10] = 26.8;
        columna005 [11] = 28.3;
        columna005 [12] = 29.8;
        columna005 [13] = 31.3;
        columna005 [14] = 32.8;
        columna005 [15] = 34.3;
        columna005 [16] = 35.7;
        columna005 [17] = 37.2;
        columna005 [18] = 38.6;
        columna005 [19] = 40;
        columna005 [20] = 41.4;
        columna005 [21] = 42.8;
        columna005 [22] = 44.2;
        columna005 [23] = 45.6;
        columna005 [24] = 46.9;
        columna005 [25] = 48.3;
        columna005 [26] = 49.6;
        columna005 [27] = 51;
        columna005 [28] = 52.3;
        columna005 [29] = 53.7;
        columna005 [30] = 66.8;
        columna005 [31] = 79.5;
        columna005 [32] = 92;
        columna005 [33] = 104.2;
        columna005 [34] = 116.3;
        columna005 [35] = 128.3;
        columna005 [36] = 140.2;
        columna005 [37] = 255.2638;
        columna005 [38] = 366.8439;
        columna005 [39] = 475.755;
        columna005 [40] = 585.2060;
        
        columna995 [0] =1 ;
        columna995 [1] = 2;
        columna995 [2] = 3;
        columna995 [3] = 0.207;
        columna995 [4] = 0.412;
        columna995 [5] = 0.676;
        columna995 [6] = 0.989;
        columna995 [7] = 1.344;
        columna995 [8] = 1.735;
        columna995 [9] = 2.16;
        columna995 [10] = 2.60;
        columna995 [11] = 3.07;
        columna995 [12] = 3.57;
        columna995 [13] = 4.07;
        columna995 [14] = 4.60;
        columna995 [15] = 5.14;
        columna995 [16] = 5.70;
        columna995 [17] = 6.26;
        columna995 [18] = 6.84;
        columna995 [19] = 7.43;
        columna995 [20] = 8.03;
        columna995 [21] = 8.64;
        columna995 [22] = 9.26;
        columna995 [23] = 9.89;
        columna995 [24] = 10.52;
        columna995 [25] = 11.16;
        columna995 [26] = 11.81;
        columna995 [27] = 12.46;
        columna995 [28] = 13.12;
        columna995 [29] = 13.79;
        columna995 [30] = 20.7;
        columna995 [31] = 28;
        columna995 [32] = 35.5;
        columna995 [33] = 43.3;
        columna995 [34] = 51.2;
        columna995 [35] = 59.2;
        columna995 [36] = 67.3;
        columna995 [37] = 152.2408;
        columna995 [38] = 240.6631;
        columna995 [39] = 329.900;
        columna995 [40] = 422.3034;
        
        
   }
    
}

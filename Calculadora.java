import java.util.*;
 
class Calculadora {
   
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]) {
        
        int d1;
        int d2;
        float o;
        
        System.out.println("*********************************************");
        System.out.println("Division");
        System.out.println("Suma");
        System.out.println("Multiplicacion");
        System.out.println("Modulo");
        System.out.println("Resta");
        System.out.println("Todo");
        System.out.println("Salir");
        System.out.println("*********************************************");
        String Pregunta = "si";
        
        do {
            System.out.print("Ingrese la Opción: ");
            
            String cal ; 
            cal = sc.nextLine();
            switch(cal) { 
            
                case "Division":
                case "division":
                
                Scanner in = new Scanner(System.in);
                                     
                System.out.print("\nIngrese el primer dígito: ");
                d1=in.nextInt();
                System.out.print("Ingrese el segundo dígito: ");
                d2=in.nextInt();

                o=d1/d2;
                System.out.print("\nEl resultado es: "+d1);
                System.out.print("/"+d2);
                System.out.println(" = "+o);
                
                break;        
                
                case "Suma":
                case "suma":
                Scanner in1 = new Scanner(System.in);
                
                System.out.print("\nIngrese el primer dígito: ");
                d1=in1.nextInt();
                System.out.print("Ingrese el segundo dígito: ");
                d2=in1.nextInt();

                o=d1+d2;
                System.out.print("\nEl resultado es: "+d1);
                System.out.print("+"+d2);
                System.out.println(" = "+o); 
                
                break;
                
                case "Multiplicacion":
                case "multiplicacion":
                Scanner in2 = new Scanner (System.in);
                System.out.print("\nIngrese el primer dígito: ");
                d1=in2.nextInt();
                System.out.print("Ingrese el segundo dígito: ");
                d2=in2.nextInt();

                o=d1*d2;
                System.out.print("\nEl resultado es: "+d1);
                System.out.print("*"+d2);
                System.out.println(" = "+o);
                    
                break;
                
                case "Modulo":
                case "modulo":
                Scanner in3 = new Scanner (System.in);
                System.out.print("\nIngrese el primer dígito: ");
                d1=in3.nextInt();
                System.out.print("Ingrese el segundo dígito: ");
                d2=in3.nextInt();
                
                o=d1 % d2;
                System.out.println("\nEl resultado es = "+o);
                    
                break;
                
                case "Resta":
                case "resta":
                Scanner in4 = new Scanner (System.in);
                System.out.print("Ingrese el primer dígito: ");
                d1=in4.nextInt();
                System.out.print("Ingrese el segundo dígito: ");
                d2=in4.nextInt();

                o=d1-d2;
                System.out.print("\nEl resultado es: "+d1);
                System.out.print("-"+d2);
                System.out.println(" = "+o); 
                
                break;
                
                case "Todo":
                case "todo":
                case "todos":
                Scanner in5 = new Scanner (System.in);
                System.out.print("Ingrese el primer dígito: ");
                d1=in5.nextInt();
                System.out.print("Ingrese el segundo dígito: ");
                d2=in5.nextInt();
                
                o=d1/d2;
                System.out.println(" ");
                System.out.println("Resultado División = "+o);
                
                o=d1+d2;
                System.out.println("Resultado Suma = "+o);
                
                o=d1*d2;
                System.out.println("Resultado Multiplicación = "+o);
                
                o=d1 % d2;
                System.out.println("Resultado Módulo = "+o);
                
                o=d1-d2;
                System.out.println("Resultado Resta = "+o);
                               
                
                break;
                
                case "Salir":
                case "salir":
                System.exit(0);
                
                break;
                
                default:
                System.out.println("\nPorfavor valide que su opción escrita sea correcta");
                Calculadora.main (null); 
            }                           
                    
                Scanner entrada=new Scanner(System.in);
                
                System.out.println(" ");
                System.out.print("¿Desea realizar otra operación? (si/no): ");
                Pregunta=sc.nextLine();
                System.out.println(" ");
                
            } while (Pregunta.equals("si")); {
            
                System.out.println("Fin del programa");
                System.exit(0);
                }

       }
      
   }
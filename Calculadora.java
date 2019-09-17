import java.util.*;
 
class Calculadora {
   
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]) {
        
        float d1;
        float d2;
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
            try {
            System.out.print("Ingrese la Opción: ");
            
            String cal ; 
            cal = sc.nextLine();
            switch(cal) { 
            
                case "Division":
                case "division":
                
                Scanner in = new Scanner(System.in);
                                     
                System.out.print("\nIngrese el primer dígito: ");
                d1=in.nextFloat();
                System.out.print("Ingrese el segundo dígito: ");
                d2=in.nextFloat();

                o=d1/d2;
                System.out.print("\nEl resultado es: "+d1);
                System.out.print("/"+d2);
                System.out.println(" = "+o);
                
                break;        
                
                case "Suma":
                case "suma":
                Scanner in1 = new Scanner(System.in);
                
                System.out.print("\nIngrese el primer dígito: ");
                d1=in1.nextFloat();
                System.out.print("Ingrese el segundo dígito: ");
                d2=in1.nextFloat();

                o=d1+d2;
                System.out.print("\nEl resultado es: "+d1);
                System.out.print("+"+d2);
                System.out.println(" = "+o); 
                
                break;
                
                case "Multiplicacion":
                case "multiplicacion":
                Scanner in2 = new Scanner (System.in);
                System.out.print("\nIngrese el primer dígito: ");
                d1=in2.nextFloat();
                System.out.print("Ingrese el segundo dígito: ");
                d2=in2.nextFloat();

                o=d1*d2;
                System.out.print("\nEl resultado es: "+d1);
                System.out.print("*"+d2);
                System.out.println(" = "+o);
                    
                break;
                
                case "Modulo":
                case "modulo":
                Scanner in3 = new Scanner (System.in);
                System.out.print("\nIngrese el primer dígito: ");
                d1=in3.nextFloat();
                System.out.print("Ingrese el segundo dígito: ");
                d2=in3.nextFloat();
                
                o=d1 % d2;
                System.out.println("\nEl resultado es = "+o);
                    
                break;
                
                case "Resta":
                case "resta":
                Scanner in4 = new Scanner (System.in);
                System.out.print("Ingrese el primer dígito: ");
                d1=in4.nextFloat();
                System.out.print("Ingrese el segundo dígito: ");
                d2=in4.nextFloat();

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
                d1=in5.nextFloat();
                System.out.print("Ingrese el segundo dígito: ");
                d2=in5.nextFloat();
                
                if ((d1 == 0) | (d2 == 0)) {
                    o=d1/d2;
                    System.out.println(" ");
                    System.out.print("Resultado División = "+o);
                    System.out.println(" (Hubo un error aritmético con la dvisión ya que no se puede dividir entre 0)");
                                        
                    o=d1+d2;
                    System.out.println("Resultado Suma = "+o);
                    
                    o=d1*d2;
                    System.out.println("Resultado Multiplicación = "+o);
                    
                    o=d1 % d2;
                    System.out.print("Resultado Módulo = "+o);
                    System.out.println(" (Hubo un error aritmético con el módulo ya que no se puede dividir entre 0)");
                    
                    o=d1-d2;
                    System.out.println("Resultado Resta = "+o);

                } else {
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
                }
                                              
                break;
                
                case "Salir":
                case "salir":
                System.exit(0);
                
                break;
                
                default:
                System.out.println("\nPorfavor valide que su opción escrita sea correcta");
                Calculadora.main (null); 
                
            }                           
            
            } catch (Exception e) {
            System.out.println("Hubo un error aritmético. Favor de escribir una operación válida.");
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

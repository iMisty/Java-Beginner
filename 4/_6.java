public class _6{
    public static void main(String[] args){
        double radius = 40.0;  
        double radians = Math.random()*Math.PI*2;  
        double x1 = radius * Math.cos(radians);  
        double y1 = radius * Math.sin(radians);  
          
        radians = Math.random()*Math.PI*2;  
        double x2 = radius * Math.cos(radians);  
        double y2 = radius * Math.sin(radians);  
          
        radians = Math.random()*Math.PI*2;  
        double x3 = radius * Math.cos(radians);  
        double y3 = radius * Math.sin(radians);  
          
        double sideA = Math.sqrt(Math.pow(x1-x2,2.0) + Math.pow(y1-y2, 2.0));  
        double sideB = Math.sqrt(Math.pow(x1-x3,2.0) + Math.pow(y1-y3, 2.0));  
        double sideC = Math.sqrt(Math.pow(x3-x2,2.0) + Math.pow(y3-y2, 2.0));  
          
        double cosA = (sideB*sideB + sideC*sideC - sideA*sideA)/(2*sideB*sideC);  
        double cosB = (sideA*sideA + sideC*sideC - sideB*sideB)/(2*sideA*sideC);  
        double cosC = (sideB*sideB + sideA*sideA - sideC*sideC)/(2*sideB*sideA);  
          
        System.out.println("cosA: " + Math.toDegrees(Math.acos(cosA)));  
        System.out.println("cosB: " + Math.toDegrees(Math.acos(cosB)));  
        System.out.println("cosC: " + Math.toDegrees(Math.acos(cosC))); 
    }
}
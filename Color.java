import java.util.Random;

public class Color {
    //Variables
    private int redValue, greenValue, blueValue, redPercent, greenPercent, bluePercent;

    Random randomGen = new Random();
    //Constructor

    public Color(){
        this.redValue = randomGen.nextInt(255);
        this.greenValue = randomGen.nextInt(255);
        this.blueValue = randomGen.nextInt(255);
 
        this.redPercent = 100;
        this.greenPercent = 100;
        this.bluePercent = 100;
    }

    //Getters and setters

    public void setRGB(int red, int green, int blue){
        if (red >= 0 && red <= 256){
            this.redValue = red;
        }else{
            System.out.println("Incorrect red value");
        }

        if (green >= 0 && green <= 256){
            this.greenValue = green;
        }else{
            System.out.println("Incorrect green value");
        }

        if (blue >= 0 && blue <= 256){
            this.blueValue = blue;
        }else{
            System.out.println("Incorrect blue value");
        }
    }

    //Abilities

    public void display(){
        System.out.println("RGB: ["+ redValue + ", " + greenValue + ", " + blueValue +"]");
    }

    public void randomize(){
        this.redValue = randomGen.nextInt(255);
        this.greenValue = randomGen.nextInt(255);
        this.blueValue = randomGen.nextInt(255);
    }
    
    public void changePercent(double redPercent, double greenPercent, double bluePercent){
        
        if (redValue * (redPercent / 100) <= 255){
            redValue *= (redPercent / 100);
        }else{
            System.out.println("Incorrect red value");    
        }
        
        if (greenValue * (greenPercent / 100) <= 255){
            greenValue *= (greenPercent / 100);
        }else{
            System.out.println("Incorrect green value");    
        }
       
        if (blueValue * (bluePercent / 100) <= 255){
            blueValue *= (bluePercent / 100);
        }else{
            System.out.println("Incorrect blue value");    
        }  
    }

     //CONVERT TO HEX    
        //   1st digit -> int x/16
        //   2nd digint -> int x % 16
    public void convertToHex(){
        String[] hexList = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        int redHex = redValue / 16;
        int greenHex = greenValue / 16;
        int blueHex = blueValue / 16;
        

        String hexValue = "Hex value: #" + hexList[redHex] + hexList[redValue % 16] +  hexList[greenHex] + hexList[greenValue % 16] + hexList[blueHex] + hexList[blueValue % 16];
        
        System.out.println(hexValue);
    }
}

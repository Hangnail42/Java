//code by CW Coleman
//save as JavaPlot.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Wait {
  public static void oneSec() {
    try {
      Thread.currentThread().sleep(1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
  public static void manySec(long s) {
     try {
       Thread.currentThread().sleep(s * 1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
      public static void millSec(long s) {
     try {
       Thread.currentThread().sleep(s);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
}


public class JavaPlot extends JFrame {
   public JavaPlot()
   {
      super( "Java Plot" );
      setSize(1100,1100);
      setVisible( true );
   }
   public void paint( Graphics g ){
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		    // only change code below this line
        int x, y, h, k, t;
        int iRed, iGreen, iBlue, aiRed, aiGreen, aiBlue;//integer RGB
        double sRed, sGreen, sBlue;// double start RGB
        double eRed, eGreen, eBlue;// double end RGB
        double aRed, aGreen, aBlue;// ajust RGB
        x = 0;  y = 0; h = 0; k = 0; t = 0;
        double theta;
        iRed = 63;
        iGreen = 63;
        iBlue = 63;
        aiRed = 3; aiBlue = 3;  // adjust integer Red
        for (x = 0;x <251;x++){
		        if (iRed > 255) iRed = 0;
            if (iRed < 0) iRed = 255;
            if (iBlue > 255) iBlue = 0;
            if (iBlue < 0) iBlue = 255;
            g.setColor(new Color(iRed,iGreen,iBlue));
            g.drawLine(550,550,800-h,300-k);//top right
            g.drawLine(550,550,800+h,300+k);//top right
            g.drawLine(550,550,300-h,800-k);//bottop left
            g.drawLine(550,550,300+h,800+k);//bottop left
            g.drawLine(550,550,300-h,300+k);//top left
            g.drawLine(550,550,300+h,300-k);//top left
            g.drawLine(550,550,800+h,800-k);//bottom right
            g.drawLine(550,550,800-h,800+k);//bottom right
            //g.drawLine(500,500+k,100+h,100+k);
            iRed = iRed + aiRed;
            iBlue = iBlue + aiBlue;
            h = h + 1;
            k = k + 1;
		        System.out.println("Ctrl+c to stop. t = " + t+" h= "+h+" k ="+k);
		        Wait.millSec(175);  // call to Wait class
            // only change code above this line
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      }//end for
  }

// execute application
  public static void main( String args[] ){
    JavaPlot myobject = new JavaPlot();//change this
  	   	// adapter to handle only windowClosing event
        myobject.addWindowListener(
  			   new WindowAdapter() {
				      public void windowClosing( WindowEvent event )
				          {System.exit( 0 );}
                }  // end WindowAdapter
        ); // end call to addWindowListener
   }//end main
}// end class Painter

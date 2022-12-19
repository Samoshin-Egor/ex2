package ex2;
import java.lang.*;
public class ball {
   private double x = 0.0, y = 0.0;
    public ball (double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getx(){
        return x;
    }
    public double gety(){
        return y;
    }
    public void setx(){
        this.x = x;
    }
    public void sety() {
        this.y = y;
    }
        public void setXY(double x, double y){
          this.x = x;
          this.y = y;
        }
        public void move ( double xDisp, double yDisp){
        x+= xDisp;
        y+= yDisp;
        }
        public String toString(){
        return "Ball ("+ this.x+", "+this.y+").";
        }
    }

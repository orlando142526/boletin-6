
package boletin6_1;

import java.util.Scanner;
public class Numero {
     private float num;

    public Numero() {
    }

    public Numero(float num) {
        this.num = num;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }
    public float convertirPositivo(){
        num = Math.abs(num);
        return num;
    }
}


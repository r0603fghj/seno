package course29;

import java.util.Random;

class Hoge{
    int a;
    Hoge(int a){
        this.a = a;
    }
}

public class ClassArrayTester {

    public static void main(String[] args) {
        Hoge[] array = new Hoge[10];
        Random r = new Random();

        for(int i=0; i<10; i++) {
            array[i] = new Hoge(r.nextInt(10));
        }
    }
}

package com;

class Bike{

    final int t = 5;

    Bike(int h) {
//        this.t = h;
    }

    Bike() {
    }
}

 class Ope extends Bike{
    int t = 6;
    int k;
    Ope(int h){
        super(h);
    }

    Ope (){
        this.k = 4;
    }
}

public class Bike9 {

    public static void Main(String[] args){
        Ope obj = new Ope();

    }
}

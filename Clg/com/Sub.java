package com;

class Val{
    int a = 7;
    int b = 10;
}

class Sub extends Val {
    int c ;
    public static void main(String[] args){
        Sub d = new Sub();
        d.c = d.a - d.b;

        System.out.println(d.c);
    }
}

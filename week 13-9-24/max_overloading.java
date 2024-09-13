class Main{
    static int  max(int a,  int b){
        return a>b?a:b;
    }
    static float max(float a,float b){
        return a>b?a:b;
    }
    static double max(double a,double b){
        return a>b?a:b;
    }
    public static void main(String [] args){
        System.out.println("max:45,54="+max(45,54) );
        System.out.println("max:457.4646,54.56="+max(457.4646,54.56) );
        System.out.println("max:45.0457438453,196.27352935="+max(45.0457438453,196.27352935) );
    }
}

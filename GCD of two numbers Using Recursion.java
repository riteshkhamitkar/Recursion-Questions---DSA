class Main {
    public static void main(String[] args) {
    Main recursion = new Main();
    var rec = recursion.gcd(30,48);
    System.out.println(rec);  
    }

    public int gcd(int x , int y){

        if(x < 0 || y <0){
            return -1;
        }
        if(y==0){
            return x;
        }

         
        return gcd(y,x%y);
    }
    
}
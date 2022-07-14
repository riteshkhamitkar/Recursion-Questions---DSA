class Main {
    public static void main(String[] args) {
    Main recursion = new Main();
    var rec = recursion.power(3,0);
    System.out.println(rec);  
    }

    public int power(int base , int exp){

        if(base < 0 || exp <0){
            return -1;
        }
        if(base == 1 & exp ==1){
            return 1;
        }

         
        return -(base * power(base, exp-1));
    }
    
}
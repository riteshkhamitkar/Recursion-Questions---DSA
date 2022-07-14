class Main {
    public static void main(String[] args) {
    Main recursion = new Main();
    var rec = recursion.decimaltoBinary(26);
    System.out.println(rec);  
    }

    public int decimaltoBinary(int n){

        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }

         
        return n%2 + 10*decimaltoBinary(n/2);
    }
    
}
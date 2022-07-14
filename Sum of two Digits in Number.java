class Main {
    public static void main(String[] args) {
    Main recursion = new Main();
    var rec = recursion.sumofDigits(56646);
    System.out.println(rec);  
    }

    public int sumofDigits(int n){

        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return n;
        }

         
        return n%10 + sumofDigits(n/10);
    }
    
public class Main {
    public static void main(String[] args) {
        String stroka = "Привет, как дела?";
        if(stroka.length()%2 == 0){
            int n = stroka.length()/2;
            System.out.println("Первая половина " + stroka.substring(0, n));
            System.out.println("Вторая половина " + stroka.substring(n));
        }else{int n = (stroka.length() - 1)/2 + 1;
            System.out.println("Первая половина " + stroka.substring(0, n));
            System.out.println("Вторая половина " + stroka.substring(n));


        }
    }

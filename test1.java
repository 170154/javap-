public class test1 {
    public static void main(String[] args) {
        //全体の変数名がi, j, k, l, i1, j1...と変更される

        //for文
        for(int i = 0; i < 10; i++){
            System.out.println(100);
        }
        //変更なし

        //while文
        int i = 0;
        while(i < 10) {
            i++;
            System.out.println(100);
        }
        //for文に変更される

        //do-while文
        int j = 0;
        do {
            System.out.println(100);
            j++;
        } while(j < 10);
        //変更なし、j++の部分がwhileの中に格納される

        //無駄なif文
        if (true) {

        }
        //削除される

        //連番ではない宣言
        int initialInt = 0;
        initialInt += 1;
        System.out.println(initialInt);
        //+=1は++に変更される

        //無駄な宣言
        int mudamudamuda = 0;
        //boolean flag = false;に変更される

        //宣言された変数が4つ以上の場合
        int a = 0;
        a++;
        int b = 0;
        b++;
        //i1, j1に変更される、4つ目以降は数字が振られる

        //無駄な宣言2
        int mudamudamudamuda = 0;
        //boolean flag1 = false;に変更される
    }
    
}

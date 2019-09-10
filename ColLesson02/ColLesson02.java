package ColLesson02;

import java.util.Scanner;

public class ColLesson02 {
    public static void main(String[] args) {
        //Scannerクラスのインスタンスの生成
        Scanner scanner = new Scanner(System.in);
        //要素数10を確保
        Word[] inputs = new Word[10];
        int count = 0;

        // 入力を促すメッセージ
        System.out.println("分からなかった単語とその意味をスペースで区切って入力してください。");

        //while文を使って文字を読み取る
        while (count < 10) {
            //入力を受け取る部分
            String input = scanner.nextLine();
            // if文を使って条件分岐（"e"が入力されたら結果を表示。それ以外が入力されたら再度入力案内を表示）
            if ("e".equals(input)) {//inputで入力された文字列と比較して「e」が入力されていれば以下を実行
                //for文を使って結果を表示
                for (int j = 0; j < count; j++) {
                    System.out.println(inputs[j].toString());//toStringを呼び出し表示
                }
                System.out.println(count + "件、登録しました。");
            } else {
                //入力された文を全角スペースで区切る
                String[] words = input.split("　");
                //分割した文章を作成したWordクラスのwordとmeaningにそれぞれ代入
                Word s = new Word(words[0], words[1]);
                //wordクラスに作った配列の中に入力した単語と意味を格納
                inputs[count] = s;
                //while文でループさせた回数をカウントするために１を足す
                count++;
                //次の入力を促すメッセージ
                System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
            }
        }
    }
}

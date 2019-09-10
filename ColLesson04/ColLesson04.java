package ColLesson04;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {
    public static void main(String[] args) {
        //Scannerクラスのインスタンスの生成
        Scanner scanner = new Scanner(System.in);
        //配列をArrayListに変更
        ArrayList<Word> word_array = new ArrayList<>(4);
        int count = 0;

        // 入力を促すメッセージ
        System.out.println("分からなかった単語とその意味をスペースで区切って入力してください。");

        //例外処理[開始]
        try {
            //while文を使って文字を読み取る
            while (true) {
                //入力を受け取る部分
                String input = new java.util.Scanner(System.in).nextLine();
                //if文で条件分岐。
                if ("e".equals(input)) {
                    return;
                }
                //入力された文を全角スペースで区切る
                String[] words = input.split("　");
                //if文で条件分岐。(カウントが５になったら以下を表示してループを抜ける)
                if (count == 5) {
                    System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
                    return;
                } else {
                    //wordクラスに作った配列の中に入力した単語と意味をそれぞれ格納
                    word_array.add(new Word(words[0], words[1]));
                    //次の入力を促すメッセージ
                    System.out.println("次の単語と意味を入力してください。\"e\"で終了します。" + count);
                }
                //while文でループさせた回数をカウントするために１を足す
                count++;
            }
            //例外が発生してもしなくても以下を必ず実行する
        } finally {
            //for文を使って結果を表示
            for (int j = 0; j < word_array.size(); j++) {
                System.out.println(word_array.get(j).toString());
            }
            System.out.println(word_array.size() + "件、登録しました。");
        }
    }
}

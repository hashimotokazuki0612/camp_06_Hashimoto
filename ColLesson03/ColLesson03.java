package ColLesson03;

import java.util.Scanner;

public class ColLesson03 {
    public static void main(String[] args) {
        //Scannerクラスのインスタンスの生成
        Scanner scanner = new Scanner(System.in);
        //要素数5を確保
        Word[] inputs = new Word[5];
        int count = 0;

        // 入力を促すメッセージ
        System.out.println("分からなかった単語とその意味をスペースで区切って入力してください。");

        //例外処理[開始]
        try {
            //while文を使って文字を読み取る
            while (true) {
                //入力を受け取る部分
                String input = scanner.nextLine();
                //if文を使って条件分岐。
                if ("e".equals(input)) {
                    return;
                }
                //入力された文を全角スペースで区切る
                String[] words = input.split("　");
                ////分割した文章を作成したWordクラスのwordとmeaningをそれぞれ代入
                Word s = new Word(words[0], words[1]);
                //wordクラスに作った配列の中に入力した単語と意味を格納
                inputs[count] = s;
                //while文でループさせた回数をカウントするために１を足す
                count++;
                //次の入力を促すメッセージ
                System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
            }
        } catch (ArrayIndexOutOfBoundsException e) {//例外が発生したら以下を表示する
            System.out.println("登録制限を超えました。登録済みのデータは以下になります。");

        } finally {//例外が発生してもしなくても以下を必ず実行する
            //for文を使って結果を表示
            for (int j = 0; j < count; j++) {
                System.out.println(inputs[j].toString());
            }
            System.out.println(count + "件、登録しました。");
        }
    }
}

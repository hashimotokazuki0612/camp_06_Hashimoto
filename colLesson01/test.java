package colLesson01;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // 入力を促すメッセージ
        System.out.println("分からなかった単語とその意味をスペースで区切って入力してください。");//（固定）

        //Scannerクラスのインスタンスの生成
        Scanner scanner = new Scanner(System.in);//ループの外に出す(固定)
        //要素数10を確保（固定）
//        String[] words01 = new String[10];

        //単語入力部分(1)　→　ここをWhile文でループさせる
        String input01 = scanner.nextLine();//入力部分
        String[] inputs01 = input01.split("　");//スペースで区切る
//        //メッセージに終了条件を追加
        System.out.println("次の単語と意味を入力してください。'e'で終了します。");

        //単語入力部分（２）
        String input02 = scanner.nextLine();//入力部分
        String[] inputs02 = input02.split("　");//スペースで区切る
        System.out.println("次の単語と意味を入力してください。'e'で終了します。");
//        単語入力部分終了

        //「e」を入力したら結果を出力する。　→　ここをforループ文を使う。
        String result = new java.util.Scanner(System.in).nextLine();
        if (result.equals("e")) {
            System.out.println("単語：" + inputs01[0] + "　" + "意味：" + inputs01[1]);//解答を表示する。
            System.out.println("単語：" + inputs02[0] + "　" + "意味：" + inputs02[1]);//解答を表示する。
            System.out.println("2件、登録しました。");
            return;//途中で打ち切る処理
        }
    }
}

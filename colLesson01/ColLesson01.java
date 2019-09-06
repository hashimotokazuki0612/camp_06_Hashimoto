package colLesson01;

import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {

        // 入力を促すメッセージ(固定)
        System.out.println("分からなかった単語とその意味をスペースで区切って入力してください。");

        //Scannerクラスのインスタンスの生成（固定）
        Scanner scanner = new Scanner(System.in);
        //要素数10を確保（固定）
        String[] words01 = new String[10];

        while (true) {
            String input = scanner.nextLine();//入力部分
            String[] inputs = input.split("　");//スペースで区切る

            if (input.equals("e")) {
                for (int i = 0; i < inputs.length; i++) {
                    System.out.println("単語：" + inputs[0] + "　" + "意味：" + inputs[1]);//解答を表示する。
                    System.out.println("2" + "件、登録しました。");
                    return;
                }
            } else {
                System.out.println("次の単語と意味を入力してください。'e'で終了します。");//メッセージに終了条件を追加
            }
        }
    }
}

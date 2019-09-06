package colLesson01;

public class Word {
//フィールド　＝　オブジェクトが持つデータ
    public String word;
    public String meaning;

    //コンストラクタの定義　= オブジェクトの実体化のさせ方
    public Word(String word, String meaning){
        this.word = word;
        this.meaning = meaning;
    }

    //メソッド　＝　オブジェクトの処理（振る舞い）
    public void attack(){
        System.out.println("単語：" + this.word + "　" + "意味：" +this.meaning);
    }
}

Java


◆コンストラクタとメソッドの違い
・コンストラクタ…クラスと同じ名前
・メソッド…クラスとは違う名前


■アクセス修飾子
private:
同じクラス内でのみアクセス可能
パッケージアクセス:
同じパッケージ内でのみアクセス可能
public:
どこからでもアクセス可能

なぜprivateにするのか。
　将来変数やメソッド名を変更可能にするため。疎密の観点で疎になり、独立性の高いプログラムになる。
  本来クラスを作るとは、カプセル化するため。
  

■非 static フィールド number を static 参照できません
メインメソッドのあるクラスのフィールド変数をstaticにしないとメインメソッド内では使えない。
staticにしておくと、プログラムに呼び出された時にメモリに作成してくれるので、使える。

public class Exec {
	private  int number;
	public  void add() {
		number++;
	}
	public static void main(String[] args) {
		number = 200;
		add();
		System.out.println("number=" + number);
	}	

■ローカル変数とフィールド変数
変数	場所	メモリから消えるタイミング	
ローカル変数	メソッド内	メソッドが実行された直後
フィールド変数			消えない

■コンストラクタとnew
new演算子はコンストラクの名前からコピーするクラスを判断する。だから、コンストラクタの名前はクラスと同じにする。
内部の処理としてはnew演算子はすべてのインスタンスメンバをメモリにコピーしている。

■オーバーロード
同じ名前のメソッドを作ること。

public void add(){
number++
}

public void add(int val){
number += val;
}

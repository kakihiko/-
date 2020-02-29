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
<div>
public class Exec {
	
	private  int number;
	public  void add() {
		number++;
	}
	
	public static void main(String[] args) {
		number = 200;
		add();
		add();
		System.out.println("number=" + number);
	}	
  </div>

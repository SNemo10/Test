public class FirstSet{
	public static void firstSetMenu(Liqur q1, Liqur q2, Liqur q3, Liqur q4){
		System.out.println("初期設定へようこそ。");
		System.out.println("ここでは４つ新しい酒類を登録できます。");
		System.out.println("登録しますか？");
		System.out.println("1:登録 2:登録しない");
		int input = new java.util.Scanner(System.in).nextInt();
		if(input == 1) {


			firstSet1(q1);
			firstSet1(q2);
			firstSet1(q3);
			firstSet1(q4);
			System.out.println("４つ全て登録されました。メニューに戻ります。");
		}else {
			System.out.println("メニューに戻ります。");
		}
	}
	public static void firstSet1(Liqur liq) {
		System.out.println("新しい種類の登録を行います。");
		liq.setName();
		liq.set();
		liq.setNumber();
		liq.setPrice();

	}
}
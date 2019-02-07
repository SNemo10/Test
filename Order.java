
public class Order {
	public static void order1(Liqur q1 ,Liqur q2, Liqur q3, Liqur q4) {
		System.out.println("発注メニューへようこそ。");
		System.out.println("明日の売上予想金額を入力してください。");
		int uriage = new java.util.Scanner(System.in).nextInt();
		System.out.println("本日の各種類の消費本数を入力してください。");
		q1.setComsumption();
		q2.setComsumption();
		q3.setComsumption();
		q4.setComsumption();
		System.out.println("各種類の入力が完了しました。");
		int q1_Order = q1.calc(uriage);
		int q2_Order = q2.calc(uriage);
		int q3_Order = q3.calc(uriage);
		int q4_Order = q4.calc(uriage);
		System.out.println("明日の必要発注数を出力します。");
		System.out.println(q1.LiqurName + "   "+q1_Order +"本。" );
		System.out.println(q2.LiqurName + "   "+ q2_Order + "本。");
		System.out.println(q3.LiqurName + "   " + q3_Order + "本。");
		System.out.println(q4.LiqurName + "    "+ q4_Order + "本。");
		int totalcost = q1.cost + q2.cost + q3.cost + q4.cost;
		System.out.println("明日の発注金額の合計は" + totalcost + "です。");
		System.out.println("現在庫を更新しました。");
		System.out.println("メニューに戻ります。");
	}
}

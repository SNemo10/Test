
public class Main {
	public static void main(String args[]) {
		System.out.println("自動発注数算出システムへようこそ。");
		Liqur q1 = new Liqur();
		Liqur q2 = new Liqur();
		Liqur q3 = new Liqur();
		Liqur q4 = new Liqur();

		boolean select = true;
		while(select == true) {
			System.out.println("メニュー　　1:初期設定　2:　発注　　3:　終了");
			int input2 = new java.util.Scanner(System.in).nextInt();
			switch( input2 ) {
				case 1:
					FirstSet.firstSetMenu(q1,q2,q3,q4);
					break;
				case 2:
					Order.order1(q1,q2,q3,q4);
					break;
				case 3:
					System.out.println("終了すると全てのデータは失われます。");
					System.out.println("1:　　終了　　2:　メニューに戻る");
					int inputFinish = new java.util.Scanner(System.in).nextInt();
					if(inputFinish == 1) {
						select = false;
						System.out.println("システムを終了します。");
					}else {
						break;
					}
			}
		}

	}

}

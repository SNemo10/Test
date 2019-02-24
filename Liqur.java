
public class Liqur {
	String LiqurName;   //名前の宣言
	int zaiko;          //現在庫の宣言
	int orderPrice;     //在庫一本消費当たりの予想売上金額
	int price;			//金額
	int comsumption;	//本日の消費本数
	int orderNumber;	//発注数
	int cost;			//発注数×金額

	void setName() {
		System.out.println("新しい酒類の登録をします。");
		System.out.println("酒類の名称を入力してください。");
		String setName = new java.util.Scanner(System.in).nextLine();
		this.LiqurName = setName;
		System.out.println(this.LiqurName +"の名称を登録しました。");

	}
	void set() {
		System.out.println("現在の"+ this.LiqurName +"の在庫数を入力してください。");
		System.out.println("数字は必ず半角で入力してください");
		int set = new java.util.Scanner(System.in).nextInt();
		this.zaiko = set;
	}
 	void setNumber() {
 		System.out.println(this.LiqurName +"の消費一本あたりの店舗予想売上を入力してください。");
 		int setNumber = new java.util.Scanner(System.in).nextInt();
 		this.orderPrice = setNumber;
 		System.out.println("一本あたり"+orderPrice +"円の売上予測を登録しました。");

 	}
 	void setPrice() {
 		System.out.println(this.LiqurName+ "の仕入れ原価を入力してください");
 		int setPrice = new java.util.Scanner(System.in).nextInt();
 		this.price = setPrice;
 		System.out.println("登録しました。");
 	}
 	void setFinish() {
 		System.out.println(this.LiqurName + "の初期設定を完了しました。");
 		System.out.println("次の種類の設定が可能な場合は移行します。");
 	}
 	void setComsumption() {
 		System.out.println(this.LiqurName +"の本日の消費本数を入力してください、");
 		int setComsumption = new java.util.Scanner(System.in).nextInt();
 		this.comsumption = setComsumption;
 		System.out.println("本日の"+ this.LiqurName + "の消費は"+ this.comsumption + "本ですね。");
 		this.zaiko -= this.comsumption; //現在庫から本日の消費本数をマイナス。営業終了時の在庫
 	}
 	int calc(int uriage) {
 		orderNumber = uriage/orderPrice;
 		this.zaiko += this.orderNumber;
 		this.cost = this.orderNumber*this.price;
 		return orderNumber;
 	}






}
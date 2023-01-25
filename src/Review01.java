
public class Review01 {

    public static void main(String[] args) {
        //商品価格変数、商品の価格を決める。
        int price = 4000;
        //消費税額の計算
        int taxamount = taxcalculation(price);
        //元の金額、税込み金額、税額の表示
        System.out.println(price + "円 の商品の税込金額は" +  (price + taxamount) + "円 " + "（消費税額は" + taxamount + "円） です。");
    }

    //消費税額を計算するメソッド（taxamount=税額）
    public static int taxcalculation(int taxamount) {
        //税率の変数と税率の設定、税率の変更が必要ならここで設定する。
        double taxrate = 0.1d;
        //消費税金額の計算　（int）で小数点以下切り捨て
        int result =(int)(taxrate*taxamount);
        //計算結果を戻す
        return result;
    }
}

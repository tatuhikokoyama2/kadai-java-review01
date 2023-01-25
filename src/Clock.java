
public class Clock {

    public static void main(String[] args) {
        //int型3つの引数を持つgetSecondsを呼び出し、計算結果をint型変数に代入
        int result = getSeconds(1, 2, 3);
        //演算結果を表示する
        System.out.println("時間、分、秒の加算： " + result);
    }

    //時、分、秒を計算するクラス
    public static int getSeconds(int hour, int time, int second) {
        int result = hour*60*60 + time*60 + second;
        return result;
    }
}

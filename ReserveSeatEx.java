import java.io.*;

public class ReserveSeatEx {

  public static final boolean AVAILABLE = true; // 空き
  public static final boolean RESERVED = false; // 予約済み

  public static void main(String[] args) {
    boolean bSeat[] = new boolean[100];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String cRet = "";

    for(int i = 0; i< 100; i++) {
      bSeat[i] = AVAILABLE; // 全ての座席を空きに
    }

    // 予約
    for(int i = 0; i < 100; i++) {
      if(bSeat[i] == AVAILABLE) {
        System.out.println(i + "番の座席が空いています");
        System.out.println("予約する：ｒ　終了する：ｃ");
        try{
          cRet = br.readLine();
        } catch(IOException e) {}
        if(cRet.equals("r")) {
          bSeat[i] = RESERVED;
        } else {
          return;
        }
      }
      
    }

  }
}
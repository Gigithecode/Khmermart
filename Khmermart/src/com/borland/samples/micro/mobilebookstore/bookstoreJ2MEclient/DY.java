package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.font;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.khmermart;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;

public class DY {

   public static String strWResults;
   public String strWord;
   String StrY = new String("KMSGAMESJDO´CíHelgkMsanþ1YAM!2dMLÚgCVa1YANK!2karkRnþak´mYyvåb !4kRnþak´1YANKEE!9GaemrIkaMg1YAP!3RBus edaykUnEq,1YARD!2Zøa sñab´esµAÇ zøaesµA1YARDSTICK!2Em¨RtGg´eKøsRbEvg1YARN!2ecs ExS Gem|aH ßELnrévehIy er]gRbDiteLIg1YAWN!2karsáab !3sáab1YEAR!2v&y Gayu1YEARLING!2kUnstVEdlmanGayumYyqñaMehIy1YEARLY!5RbcaMqaM !6mYyqñaMmþg1YEARN!3cg´:nxøaMg1YEAST!2emÇ dMEbÇ pSitdMEb1YELL!3ERsk !2sERmk sUrERsk1YELLOW!5kMsak RKunel]g el]g !2BN(el]g1YELP!2sUrdUcEq,RBus rUbiyvtæúCBun!3bnWøsUrdUcEq,RBus1YEOMAN!2TahaneCIgTwks&kiþtUc1YES!2BaküsRmab´EzøgnUvkaryl´Rsb kñúgkaresIñmmtiGIVmYy1YESTERDAY!6BImSilmij !2mSilémá1YET!6kMuGaleTA mYyézáeT[t !8enAEt1YIELD!3bnÞn´eTAtam opl!2pl Tinñpl !4o RbKl´o1YOGA!2eyaK1YOGI!2eyaKI1YOKE!2mYynwm !4TwmeKa RkbI1YOLK!2bItCati 0Catiel]géns)ut01YONDER!5enAÉnay1YOU!9Ég Gñk1YOUNG!5ekµg zIµ !2kUn1YOUNGSTER!2mnusSekµg1YOUR!9rbs´elak Gñk1YOURS!9rbs´elak Gñk1YOURSELF!9xøÜnÉg edayxøÜnÉg1YOUTH!2ekµgRbus yuvCn yuvnarI yuvPaB1YOUTHFUL!5dUcekµg ényuvPaB1");


   public DY(String StrW) {
      this.strWord = StrW;

      try {
         this.jbInit();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   private void jbInit() throws Exception {
      String isbn = "BaküminRtwmRtUvßminTan0man";
      int index = this.StrY.indexOf("1" + this.strWord + "!") + this.strWord.length() + 1;
      String name = this.StrY.substring(index, this.StrY.indexOf("1", index));
      if(index > 10) {
         isbn = name;
      }

      font RS = new font(isbn, this.strWord);
      Display.getDisplay(khmermart.instance).setCurrent(RS);
   }

   public void commandAction(Command command, Displayable displayable) {}
}

package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.font;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.khmermart;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;

public class DZ {

   public static String strWResults;
   public String strWord;
   String StrZ = new String("KMSGAMESJDO,Üt kMEbøg1ZEAL!2ytiPaB1ZEALOT!2mnusSEdls)b´ßsøúgnwgGIVmYy1ZEALOUS!5Edls)b´ßsøúgnwgGIVmYy1ZEBRA!2esHbg,g´1ZENITH!2kMBUl1ZEPHYR!2xül´lMehIy1ZERO!3tRmg´eTAÇ dak´ocM !2sUnü TeT1ZEST!2esckIþsaTrßeRtkRtGal1ZIGZAG!4eZIVokac´cuHkac´eLIgÇ eZIVokáikkák´ !5kac´cuHkac´eLIg ßkáikkák´ !3kac´cuHkac´eLIg !2GIV> Edlkac´cuHkac´eLIgßkáikkák´1ZINC!2s&g,sI1ZIP!2elxRbcaMtMbn´ !3eTAEPøtÇ eTAvåg1ZIPPER!2ExSrUt1ZIRCON!2eBRCéz1ZODIAC!2rasIcRk1ZONE!2tMbn´ sg,at´!4EckCasg,at´1ZOO!2sYnstV1ZOOLOGY!2stþvíTüa1ZOOM!3e:HBYy !2sUrqabBIelI EkvBRgIkbRgYm!4qabBIelIRbpit>1");


   public DZ(String StrW) {
      this.strWord = StrW;

      try {
         this.jbInit();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   private void jbInit() throws Exception {
      String isbn = "BaküminRtwmRtUvßminTan0man";
      int index = this.StrZ.indexOf("1" + this.strWord + "!") + this.strWord.length() + 1;
      String name = this.StrZ.substring(index, this.StrZ.indexOf("1", index));
      if(index > 10) {
         isbn = name;
      }

      font RS = new font(isbn, this.strWord);
      Display.getDisplay(khmermart.instance).setCurrent(RS);
   }

   public void commandAction(Command command, Displayable displayable) {}
}

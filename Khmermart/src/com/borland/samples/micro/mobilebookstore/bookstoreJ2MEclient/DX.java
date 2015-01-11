package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.font;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.khmermart;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;

public class DX {

   public static String strWResults;
   public String strWord;
   String StrX = new String("KMSGAMESJDO´CnbreTs1XEROX!4ztnwgm¨asIunsIuru¨k 2m¨asIunsIuru¨k 5Edlztnwgm¨asIunsIuru¨k1XYLOPHONE!2sIuLÚhVÚn1");


   public DX(String StrW) {
      this.strWord = StrW;

      try {
         this.jbInit();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   private void jbInit() throws Exception {
      String isbn = "BaküminRtwmRtUvßminTan0man";
      int index = this.StrX.indexOf("1" + this.strWord + "!") + this.strWord.length() + 1;
      String name = this.StrX.substring(index, this.StrX.indexOf("1", index));
      if(index > 10) {
         isbn = name;
      }

      font RS = new font(isbn, this.strWord);
      Display.getDisplay(khmermart.instance).setCurrent(RS);
   }

   public void commandAction(Command command, Displayable displayable) {}
}

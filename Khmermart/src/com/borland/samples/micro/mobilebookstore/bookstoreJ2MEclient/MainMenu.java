package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.Register;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.Search;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.khmermart;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.ImageItem;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.Ticker;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;

public class MainMenu extends Form implements CommandListener {

   int intOpenGate = 0;
   private static RecordStore database = null;
   private Search Wsearch = new Search();
   private Register reg = new Register();
   Ticker ticker1 = new Ticker("");
   ImageItem imageItem1 = new ImageItem("", (Image)null, 0, "");
   StringItem stringItem1 = new StringItem("", "");
   StringItem stringItem2 = new StringItem("", "");
   StringItem stringItem3 = new StringItem("", "");


   public MainMenu() {
      super("");

      try {
         this.jbInit();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void jbInit() throws Exception {
      this.imageItem1 = new ImageItem("", (Image)null, 3, "");
      this.imageItem1.setImage(Image.createImage("/books.png"));
      this.imageItem1.setLayout(3);
      this.setTicker(this.ticker1);
      this.ticker1.setString("Eng-Kh Dict V 1.1    Meanings over 40,800 definitions! Updated By Khmer PDA.Best Expert On Phone Development.               ");
      this.setCommandListener(this);
      this.addCommand(new Command("Continue", 4, 2));
      this.addCommand(new Command("Exit", 7, 1));
      this.append(this.imageItem1);
      this.append(this.stringItem1);
      this.append(this.stringItem2);
      this.RetriDatabase();
      this.stringItem1.setText("     Updated By: Khmer PDA              ");
      this.stringItem1.setPreferredSize(200, 30);
      this.stringItem1.setFont(Font.getFont(0));
      this.stringItem2.setPreferredSize(200, 30);
      this.stringItem2.setFont(Font.getFont(0));
   }

   public void RetriDatabase() {
      try {
         database = RecordStore.openRecordStore("KMS", true);
         RecordEnumeration e1 = database.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
         String record = new String(e1.nextRecord());
         if(record.substring(0, 32).equals("@f!&$71ghdfJE*^#$@fjdKH54W$05849")) {
            this.intOpenGate = 10;
         }

         this.stringItem3.setText("Registered to Mobile\'s User number " + this.EncodeURL(record.substring(32, 41)));
         this.stringItem2.setPreferredSize(200, 30);
         this.append(this.stringItem3);
      } catch (Exception var11) {
         ;
      } finally {
         if(database != null) {
            try {
               database.closeRecordStore();
            } catch (Exception var10) {
               ;
            }
         }

      }

   }

   private String replace(String source, char oldChar, String dest) {
      String ret = "";

      for(int i = 0; i < source.length(); ++i) {
         if(source.charAt(i) != oldChar) {
            ret = ret + source.charAt(i);
         } else {
            ret = ret + dest;
         }
      }

      return ret;
   }

   private String EncodeURL(String URL) {
      URL = this.replace(URL, 'E', "0");
      URL = this.replace(URL, '@', "1");
      URL = this.replace(URL, 'R', "2");
      URL = this.replace(URL, '%', "3");
      URL = this.replace(URL, 'Z', "4");
      URL = this.replace(URL, 'Y', "5");
      URL = this.replace(URL, '@', "6");
      URL = this.replace(URL, 'Q', "7");
      URL = this.replace(URL, 't', "8");
      URL = this.replace(URL, 'A', "9");
      return URL;
   }

   public void commandAction(Command command, Displayable displayable) {
      switch(command.getCommandType()) {
      case 4:
         if(this.intOpenGate == 10) {
            Display.getDisplay(khmermart.instance).setCurrent(this.Wsearch);
         }

         if(this.intOpenGate == 0) {
            Display.getDisplay(khmermart.instance).setCurrent(this.reg);
         }
         break;
      case 7:
         khmermart.quitApp();
      }

   }

}

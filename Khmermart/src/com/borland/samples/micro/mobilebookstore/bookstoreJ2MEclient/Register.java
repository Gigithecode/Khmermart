package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.khmermart;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;

public class Register extends Form {

   StringItem stringItem1 = new StringItem("", "");
   String IMEIcode;
   public String Rstring;
   TextField textField1 = new TextField("", "", 10, 0);
   TextField textField2 = new TextField("", "", 6, 0);
   StringItem stringItem2 = new StringItem("", "");


   public Register() {
      super("Register");
      this.setCommandListener(new CommandListener() {
         public void commandAction(Command c, Displayable d) {
            Register.this.this_commandPerformed(c, d);
         }
      });

      try {
         this.jbInit();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void jbInit() throws Exception {
      long seconds = System.currentTimeMillis() / 8640L;
      long minutes = System.currentTimeMillis() / 5030L;
      String strSeconds = "";
      String strMinutes = "";
      String IMEI = "";
      strSeconds = "" + seconds;
      strSeconds = strSeconds.substring(5, 8);
      strMinutes = "" + minutes;
      strMinutes = strMinutes.substring(6, 8);
      IMEI = strSeconds + strMinutes + strSeconds.substring(1, 2);
      this.append(this.stringItem2);
      this.append(this.textField1);
      this.append(this.textField2);
      this.append(this.stringItem1);
      this.addCommand(new Command("OK ", 4, 0));
      this.addCommand(new Command("Show", 3, 1));
      this.addCommand(new Command("Exit", 7, 2));
      this.stringItem1.setFont(Font.getFont(32, 1, 0));
      this.textField1.setLabel("User : ");
      this.textField2.setLabel("SN : ");
      seconds = Long.parseLong(IMEI) * 13L / 50L + 121L;
      IMEI = "" + seconds;
      this.IMEIcode = "" + seconds;
      if(IMEI.length() <= 5) {
         this.IMEIcode = "0" + seconds;
      }

      this.stringItem2.setText(this.IMEIcode);
      seconds *= 20L;
      seconds /= 40L;
      seconds += 199L;
      this.IMEIcode = "" + seconds;
      if(this.IMEIcode.length() == 6) {
         this.IMEIcode = "" + seconds;
      }

      if(this.IMEIcode.length() == 5) {
         this.IMEIcode = "0" + seconds;
      }

      if(this.IMEIcode.length() == 4) {
         this.IMEIcode = "00" + seconds;
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
      URL = this.replace(URL, '0', "E");
      URL = this.replace(URL, '1', "@");
      URL = this.replace(URL, '2', "R");
      URL = this.replace(URL, '3', "%");
      URL = this.replace(URL, '4', "Z");
      URL = this.replace(URL, '5', "Y");
      URL = this.replace(URL, '6', "@");
      URL = this.replace(URL, '7', "Q");
      URL = this.replace(URL, '8', "t");
      URL = this.replace(URL, '9', "A");
      return URL;
   }

   public void where() {
      RecordStore newStocksDb = null;
      String stradd = "@f!&$71ghdfJE*^#$@fjdKH54W$05849" + this.EncodeURL(this.textField1.getString()) + "@w#d@t#%d@09";
      String strPass = this.textField2.getString().substring(0, 4);

      try {
         this.stringItem1.setText("Wrong Key...");
         if(strPass.equals(this.IMEIcode.substring(0, 4))) {
            RecordStore.deleteRecordStore("KMS");
            newStocksDb = RecordStore.openRecordStore("KMS", true);
            newStocksDb.addRecord(stradd.getBytes(), 0, stradd.getBytes().length);
            this.stringItem1.setText("Account is added");
            this.append(this.stringItem1);
         }
      } catch (Exception var13) {
         ;
      } finally {
         if(newStocksDb != null) {
            try {
               newStocksDb.closeRecordStore();
            } catch (Exception var12) {
               ;
            }
         }

      }

   }

   public void this_commandPerformed(Command c, Displayable d) {
      RecordStore database = null;
      switch(c.getCommandType()) {
      case 3:
         try {
            database = RecordStore.openRecordStore("KMS", true);
            RecordEnumeration e = database.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
            new String(e.nextRecord());
            this.stringItem1.setText("****************");
            this.append(this.stringItem1);
         } catch (Exception var6) {
            ;
         }
         break;
      case 4:
         this.where();
      case 5:
      case 6:
      default:
         break;
      case 7:
         khmermart.quitApp();
      }

   }
}

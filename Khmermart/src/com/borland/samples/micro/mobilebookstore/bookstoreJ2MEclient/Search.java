package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DC;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DD;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DE;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DF;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DG;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DH;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DI;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DJ;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DK;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DL;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DM;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DN;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DO;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DP;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DQ;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DR;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DS;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DT;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DU;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DV;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DW;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DX;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DY;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.DZ;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public class Search extends Form implements CommandListener {

   StringBuffer bookInfo = new StringBuffer();
   TextField txtWord = new TextField("", "", 1, 1);


   public Search() {
      super("KHMER PDA ");

      try {
         this.jbInit();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void jbInit() throws Exception {
      this.txtWord.setLabel("Search:");
      this.txtWord.setConstraints(1048576);
      this.txtWord.setMaxSize(20);
      this.txtWord.setPreferredSize(200, 38);
      this.setCommandListener(this);
      this.addCommand(new Command("OK", 1, 1));
      this.append(this.txtWord);
   }

   public void commandAction(Command command, Displayable displayable) {
      if(command.getCommandType() == 1) {
         String sW = this.txtWord.getString();
         sW = sW.toUpperCase();
         switch(sW.charAt(0)) {
         case 65:
            DA a23 = new DA(sW);
            sW = DA.strWResults;
            break;
         case 66:
            DB a25 = new DB(sW);
            sW = DB.strWResults;
            break;
         case 67:
            DC a24 = new DC(sW);
            sW = DC.strWResults;
            break;
         case 68:
            DD a20 = new DD(sW);
            sW = DD.strWResults;
            break;
         case 69:
            DE a19 = new DE(sW);
            sW = DE.strWResults;
            break;
         case 70:
            DF a22 = new DF(sW);
            sW = DF.strWResults;
            break;
         case 71:
            DG a21 = new DG(sW);
            sW = DG.strWResults;
            break;
         case 72:
            DH a17 = new DH(sW);
            sW = DH.strWResults;
            break;
         case 73:
            DI a18 = new DI(sW);
            sW = DI.strWResults;
            break;
         case 74:
            DJ a15 = new DJ(sW);
            sW = DJ.strWResults;
            break;
         case 75:
            DK a16 = new DK(sW);
            sW = DK.strWResults;
            break;
         case 76:
            DL a13 = new DL(sW);
            sW = DL.strWResults;
            break;
         case 77:
            DM a14 = new DM(sW);
            sW = DM.strWResults;
            break;
         case 78:
            DN a11 = new DN(sW);
            sW = DN.strWResults;
            break;
         case 79:
            DO a12 = new DO(sW);
            sW = DO.strWResults;
            break;
         case 80:
            DP a9 = new DP(sW);
            sW = DP.strWResults;
            break;
         case 81:
            DQ a10 = new DQ(sW);
            sW = DQ.strWResults;
            break;
         case 82:
            DR a7 = new DR(sW);
            sW = DR.strWResults;
            break;
         case 83:
            DS a8 = new DS(sW);
            sW = DS.strWResults;
            break;
         case 84:
            DT a5 = new DT(sW);
            sW = DT.strWResults;
            break;
         case 85:
            DU a6 = new DU(sW);
            sW = DU.strWResults;
            break;
         case 86:
            DV a3 = new DV(sW);
            sW = DV.strWResults;
            break;
         case 87:
            DW a4 = new DW(sW);
            sW = DW.strWResults;
            break;
         case 88:
            DX a2 = new DX(sW);
            sW = DX.strWResults;
            break;
         case 89:
            DY a1 = new DY(sW);
            sW = DY.strWResults;
            break;
         case 90:
            DZ a = new DZ(sW);
            sW = DZ.strWResults;
         }
      }

   }
}

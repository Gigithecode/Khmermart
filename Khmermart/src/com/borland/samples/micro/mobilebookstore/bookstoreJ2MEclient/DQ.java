package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.font;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.khmermart;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;

public class DQ {

   public static String strWResults;
   public String strWord;
   String StrQ = new String("KMSGAMESJDO1QUACK!2sERmkkab> !5EdlEkøgeZIVCaRKUeBTü !3ERskkab>1QUADRANGLE!2ctuekaN1QUADRILATERAL!5EdlmanRCugßmuxbYn!2ctur&gS1QUADRUPLE!5ctVaKuN !3eLIgmYyCabYn !4KuNnwgbYn1QUADRUPLED!5EdlmaneCIgbYn !2stVeCIgbYn ctub|aT vtæúbYndUcKña1QUADRUPLET!2kUnePøaHbYn kUnbYnnak´ekItenAeBlCamYyKña1QUAGMIRE!2Pk´eRCA1QUAIL!3Gs´kmøaMgcitþ !2RkYc 0stV01QUAINT!5cas´hYssm&yehIyEbøk1QUAKE!2rJ¢Üy !3jab´j&r!2rJ¢ÜydI EpndI karj&r1QUALIFICATION!2PaBmanlk¡N;CacaM:c´ PaBmansiTiÆTTYl1QUALIFIED!5EdlmanKuNviD¿iRKb´RKan´1QUALIFY!2manlk¡N;CacM:c´ !4eZIVomanKuNsm|tiþRKb´RKan´ kMNt´RBMEdn1QUALITATIVE!5énKuNPaBßlk¡N;1QUALITY!5Zunl�? !2KuNPaB1QUALM!2karrkcg´k�?Üt1QUANDARY!2PaBGl´EGk1QUANTITATIVE!50én0brimaN1QUANTITY!2cMnYn brimaN1QUARANTINE!2kardak´oenAdac´BIeK !4dak´oenAdac´BIeK1QUARREL!3eQøaH yl´Tas´!2Kµanyl´Tas´ CemøaH PN�?n;1QUARRELSOME!5éhRbeQøaH1QUARRY!2GIV>EdleKtamrk stVEdleKbr:j´ !4Kas´ykzµ1QUART!2kVat CargVal´1QUARTER!4BuHCabYn !2sg,at´ mYyPaKbYn mYynaTI1QUARTERLY!5ecjral´bIEx !6ral´bIEx1QUARTET!3GIV>EdlmanbYn !2GIV>EdlmanbYn1QUARTZ!2kVatS¾ silamü¨agrwg1QUASH!4kMeTc bMpøaj bdiesZ1QUATRAIN!2bTkaBüEdlmanbYn:T1QUAVER!3j&r!2sUrj&r!4eZIVoj&r1QUAY!2Epk:¨l´1QUEASY!5Edlrkcg´Etk�?Üt1QUEEN!2RBHmhakSRtiyanI1QUEER!4eZIVoxUc !5q,Üt Ebøk!2mnusSRbtiB&TÆnwgmnusSePTdUcKña1QUELL!4bRg,ab BRgab bM:t´1QUENCH!4Bnøt´ eZIVo:t´1QUERULOUS!5rG)UrTaM1QUERY!3sYrsMNYr !2sMNYr !4sYrsMNYr1QUEST!2karEsVgrk !4EsVgrk1QUESTION!2sMNYr !4sYr saksYr minyl´Rsbnwg CMTas´1QUESTIONABLE!5KYrosgS&y1QUESTIONAIRE!2bJ¢IsMNYr1QUEUE!2CYrmnusSQrbnþ>Kña !3QrbnþbnÞúyKña1QUIBBLE!3CYjer]g !2karCYjer]g1QUICK!5rh&s qab´xwg1QUICKEN!3maneLIgvij jab´eLIg!4eZIVojab´eLIg1QUICKSAND!2xSac´pug1QUIET!5esá{msáat´ EdlminsUvmat´k!4eZIVoesá{m1QUIETUDE!2esckIþsáb´1QUIETUS!2karbJ©b´Elgoman1QUILL!2kaM énstVkaMRbma dg:¨kaeZIVBIsøabstV søab1QUILT!4jat´sMLI1QUININE!2KInIn1QUINTESSENCE!2xøwmsar PaKRbesIrbMput GK<sar1QUINTUPLET!2vtæúR:MdUcKña !2kUnePøaHR:M kUnR:Mnak´ekItenAeBlCamYyKña1QUIP!3niyaykMEbøgy¨agmut !2BakükMEbøgy¨agmut1QUIRK!2GniytPaB lk¡N;cEmøk1QUIT!5bM:t´ecal!3lHbg´ e:Hbg´ !4ecjBI1QUITCLAIM!2karepÞrsiTiÆ sMbuRtepÞrsiTiÆ !4epÞrsiTiÆ1QUITE!6xøaMg Zán Nas´1QUITTANCE!2bg,an´édseRmc karrYc sMNg1QUIVER!2karj&r !4jak´ !3j&r1QUIXOTIC!5EdlmanKMnitrevIrvay1QUIZ!2cMeNaTsYr !4ecaTsYr1QUIZZICAL!5dUceKqál´1QUORUM!2cMnYncaM:c´edIm|IebIkGg<RbCMu1QUOTA!2cMnYnkRmitÇ bmaNPaK1QUOTE!2sRmag´ecjBIRbPBNamYy !4Rsg´BaküBIRbPBNamYy1QUOTIENT!2plEck1");


   public DQ(String StrW) {
      this.strWord = StrW;

      try {
         this.jbInit();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   private void jbInit() throws Exception {
      String isbn = "BaküminRtwmRtUvßminTan0man";
      int index = this.StrQ.indexOf("1" + this.strWord + "!") + this.strWord.length() + 1;
      String name = this.StrQ.substring(index, this.StrQ.indexOf("1", index));
      if(index > 10) {
         isbn = name;
      }

      font RS = new font(isbn, this.strWord);
      Display.getDisplay(khmermart.instance).setCurrent(RS);
   }

   public void commandAction(Command command, Displayable displayable) {}
}

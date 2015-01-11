package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.MainMenu;
import java.io.IOException;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public class khmermart extends MIDlet {

   static khmermart instance;
   private static Display display;
   private MainMenu mainMenu = new MainMenu();


   public khmermart() {
      instance = this;
      display = Display.getDisplay(this);
   }

   public void startApp() {
      display.setCurrent(this.mainMenu);
   }

   public void pauseApp() {}

   public void destroyApp(boolean unconditional) {}

   public static void quitApp() {
      instance.destroyApp(true);
      instance.notifyDestroyed();
      instance = null;
   }

   public static void showAlert(Exception e) {
      showAlert(e.getMessage());
   }

   public static void showAlert(String message) {
      Image image = null;

      try {
         image = Image.createImage("/ErrorClaim.png");
      } catch (IOException var3) {
         ;
      }

      Alert alert = new Alert("Error", "", image, AlertType.ERROR);
      alert.setTimeout(-2);
      alert.setString(message);
      display.setCurrent(alert);
   }
}

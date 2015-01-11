package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.Search;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.khmermart;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

public class font extends Canvas implements CommandListener {

   public int Pwidth;
   public int Pheight;
   String strContent;
   String strWord;
   int x = 0;
   int y = 0;
   int c = 0;
   int d = 0;
   int a = 0;
   int b = 0;
   int i = 0;
   int h = 0;
   int arow = 0;


   public font(String strKH, String strLL) {
      this.strContent = strKH;
      this.strWord = strLL;

      try {
         this.jbInit();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   private void jbInit() throws Exception {
      this.setCommandListener(this);
      this.addCommand(new Command("BACK", 4, 1));
      this.addCommand(new Command("Exit", 2, 0));
   }

   public void commandAction(Command command, Displayable displayable) {
      switch(command.getCommandType()) {
      case 2:
         khmermart.quitApp();
         break;
      case 4:
         Search isbnS = new Search();
         Display.getDisplay(khmermart.instance).setCurrent(isbnS);
      }

   }

   private String getAction(int key) {
      int action = this.getGameAction(key);
      switch(action) {
      case 1:
         return "UP";
      case 2:
         return "LEFT";
      case 3:
      case 4:
      default:
         return "";
      case 5:
         return "RIGHT";
      case 6:
         return "DOWN";
      }
   }

   protected void keyPressed(int key) {
      if(key == -2) {
         this.arow -= 5;
      }

      if(key == -1) {
         this.arow += 5;
      }

      this.repaint();
   }

   private void k(Graphics g) {
      g.drawLine(this.x, this.y - 7, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 7);
      g.drawLine(this.x + 1, this.y - 9, this.x + 1, this.y - 9);
      g.drawLine(this.x + 2, this.y - 6, this.x + 2, this.y - 7);
      g.drawLine(this.x + 2, this.y - 9, this.x + 2, this.y - 10);
      g.drawLine(this.x + 3, this.y - 7, this.x + 3, this.y - 9);
      g.drawLine(this.x + 4, this.y - 7, this.x + 4, this.y - 7);
      g.drawLine(this.x + 4, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 5, this.y - 7, this.x + 5, this.y - 7);
      g.drawLine(this.x + 5, this.y - 9, this.x + 5, this.y - 10);
      g.drawLine(this.x + 6, this.y - 6, this.x + 6, this.y - 9);
      g.drawLine(this.x + 7, this.y, this.x + 7, this.y - 6);
      g.drawLine(this.x + 7, this.y - 9, this.x + 7, this.y - 9);
      this.x += 9;
   }

   private void x(Graphics g) {
      g.drawLine(this.x, this.y - 1, this.x, this.y - 4);
      g.drawLine(this.x, this.y - 7, this.x, this.y - 9);
      g.drawLine(this.x + 1, this.y - 9, this.x + 1, this.y - 10);
      g.drawLine(this.x + 1, this.y - 10, this.x + 4, this.y - 10);
      g.drawLine(this.x + 5, this.y - 9, this.x + 5, this.y - 9);
      g.drawLine(this.x + 6, this.y - 8, this.x + 6, this.y - 7);
      g.drawLine(this.x + 1, this.y, this.x + 4, this.y);
      g.drawLine(this.x + 1, this.y - 4, this.x + 3, this.y - 4);
      g.drawLine(this.x + 4, this.y - 5, this.x + 5, this.y - 5);
      g.drawLine(this.x + 6, this.y - 6, this.x + 6, this.y - 6);
      g.drawLine(this.x + 1, this.y - 6, this.x + 3, this.y - 6);
      g.drawLine(this.x + 2, this.y - 7, this.x + 3, this.y - 7);
      g.drawLine(this.x + 6, this.y - 1, this.x + 6, this.y - 4);
      g.drawLine(this.x + 5, this.y - 1, this.x + 5, this.y - 2);
      g.drawLine(this.x + 4, this.y - 1, this.x + 4, this.y - 1);
      this.x += 8;
   }

   private void K(Graphics g) {
      g.drawLine(this.x, this.y - 7, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 7);
      g.drawLine(this.x + 1, this.y - 9, this.x + 1, this.y - 9);
      g.drawLine(this.x + 2, this.y - 6, this.x + 2, this.y - 7);
      g.drawLine(this.x + 2, this.y - 9, this.x + 2, this.y - 10);
      g.drawLine(this.x + 3, this.y - 7, this.x + 3, this.y - 9);
      g.drawLine(this.x + 4, this.y - 7, this.x + 4, this.y - 7);
      g.drawLine(this.x + 4, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 5, this.y - 7, this.x + 5, this.y - 7);
      g.drawLine(this.x + 5, this.y - 9, this.x + 5, this.y - 10);
      g.drawLine(this.x + 6, this.y - 6, this.x + 6, this.y - 9);
      g.drawLine(this.x + 7, this.y, this.x + 7, this.y - 6);
      g.drawLine(this.x + 7, this.y - 9, this.x + 7, this.y - 9);
      g.drawLine(this.x + 2, this.y - 1, this.x + 3, this.y - 2);
      g.drawLine(this.x + 3, this.y - 2, this.x + 4, this.y - 2);
      this.x += 9;
   }

   private void X(Graphics g) {
      g.drawLine(this.x, this.y - 7, this.x, this.y - 9);
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 9);
      g.drawLine(this.x + 2, this.y, this.x + 5, this.y);
      g.drawLine(this.x + 5, this.y - 8, this.x + 5, this.y - 9);
      g.drawLine(this.x + 6, this.y - 1, this.x + 6, this.y - 7);
      g.drawLine(this.x + 6, this.y - 9, this.x + 6, this.y - 10);
      g.drawLine(this.x + 6, this.y - 9, this.x + 8, this.y - 9);
      g.drawLine(this.x + 7, this.y, this.x + 9, this.y);
      g.drawLine(this.x + 9, this.y, this.x + 9, this.y - 1);
      g.drawLine(this.x + 9, this.y - 8, this.x + 9, this.y - 8);
      g.drawLine(this.x + 10, this.y - 1, this.x + 10, this.y - 7);
      g.drawLine(this.x + 10, this.y - 9, this.x + 12, this.y - 9);
      this.x += 12;
   }

   private void g(Graphics g) {
      g.drawLine(this.x, this.y - 5, this.x, this.y - 5);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 6);
      g.drawLine(this.x + 2, this.y, this.x + 2, this.y);
      g.drawLine(this.x + 3, this.y - 1, this.x + 3, this.y - 1);
      g.drawLine(this.x + 4, this.y - 1, this.x + 4, this.y - 2);
      g.drawLine(this.x + 5, this.y, this.x + 5, this.y - 1);
      g.drawLine(this.x + 6, this.y, this.x + 6, this.y - 10);
      g.drawLine(this.x + 5, this.y - 10, this.x + 5, this.y - 10);
      g.drawLine(this.x + 5, this.y - 8, this.x + 5, this.y - 8);
      g.drawLine(this.x + 4, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 2, this.y - 7, this.x + 5, this.y - 7);
      g.drawLine(this.x + 2, this.y - 7, this.x + 2, this.y - 8);
      g.drawLine(this.x + 1, this.y - 8, this.x + 1, this.y - 12);
      this.x += 8;
   }

   private void c(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 7);
      g.drawLine(this.x + 2, this.y, this.x + 6, this.y);
      g.drawLine(this.x + 7, this.y - 1, this.x + 7, this.y - 7);
      g.drawLine(this.x + 5, this.y - 7, this.x + 7, this.y - 7);
      g.drawLine(this.x + 5, this.y - 4, this.x + 7, this.y - 4);
      g.drawLine(this.x + 4, this.y - 5, this.x + 4, this.y - 6);
      g.drawLine(this.x + 1, this.y - 9, this.x + 7, this.y - 9);
      g.drawLine(this.x + 2, this.y - 10, this.x + 2, this.y - 10);
      g.drawLine(this.x + 3, this.y - 8, this.x + 3, this.y - 8);
      g.drawLine(this.x + 5, this.y - 10, this.x + 5, this.y - 10);
      g.drawLine(this.x + 6, this.y - 8, this.x + 6, this.y - 8);
      this.x += 9;
   }

   private void q(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 2);
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 7);
      g.drawLine(this.x + 2, this.y - 2, this.x + 3, this.y - 2);
      g.drawLine(this.x + 3, this.y - 1, this.x + 4, this.y - 1);
      g.drawLine(this.x + 4, this.y, this.x + 6, this.y);
      g.drawLine(this.x + 6, this.y, this.x + 6, this.y - 9);
      g.drawLine(this.x + 1, this.y - 9, this.x + 7, this.y - 9);
      g.drawLine(this.x + 5, this.y - 7, this.x + 5, this.y - 10);
      g.drawLine(this.x + 4, this.y - 6, this.x + 4, this.y - 5);
      g.drawLine(this.x + 5, this.y - 4, this.x + 5, this.y - 4);
      g.drawLine(this.x + 2, this.y - 10, this.x + 2, this.y - 10);
      this.x += 9;
   }

   private void C(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 7);
      g.drawLine(this.x + 2, this.y, this.x + 4, this.y - 2);
      g.drawLine(this.x + 4, this.y - 2, this.x + 6, this.y);
      g.drawLine(this.x + 7, this.y, this.x + 7, this.y - 7);
      g.drawLine(this.x + 7, this.y - 9, this.x + 7, this.y - 12);
      g.drawLine(this.x + 6, this.y - 11, this.x + 6, this.y - 12);
      g.drawLine(this.x + 1, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 4, this.y - 8, this.x + 6, this.y - 8);
      this.x += 9;
   }

   private void Q(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 9);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 2);
      g.drawLine(this.x + 2, this.y - 1, this.x + 2, this.y - 2);
      g.drawLine(this.x + 1, this.y - 10, this.x + 4, this.y - 10);
      g.drawLine(this.x + 5, this.y - 1, this.x + 5, this.y - 9);
      g.drawLine(this.x + 1, this.y - 10, this.x + 4, this.y - 10);
      g.drawLine(this.x + 6, this.y, this.x + 9, this.y);
      g.drawLine(this.x + 6, this.y - 1, this.x + 6, this.y - 1);
      g.drawLine(this.x + 10, this.y - 1, this.x + 10, this.y - 7);
      g.drawLine(this.x + 9, this.y - 8, this.x + 9, this.y - 9);
      g.drawLine(this.x + 8, this.y - 8, this.x + 8, this.y - 8);
      g.drawLine(this.x + 10, this.y - 9, this.x + 11, this.y - 9);
      g.drawLine(this.x + 10, this.y - 10, this.x + 10, this.y - 10);
      g.drawLine(this.x + 11, this.y - 1, this.x + 11, this.y - 1);
      g.drawLine(this.x + 11, this.y, this.x + 14, this.y);
      g.drawLine(this.x + 15, this.y - 1, this.x + 15, this.y - 7);
      g.drawLine(this.x + 14, this.y - 8, this.x + 14, this.y - 8);
      g.drawLine(this.x + 15, this.y - 9, this.x + 16, this.y - 9);
      this.x += 17;
   }

   private void j(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 7);
      g.drawLine(this.x + 2, this.y, this.x + 2, this.y);
      g.drawLine(this.x + 2, this.y - 2, this.x + 2, this.y - 2);
      g.drawLine(this.x + 3, this.y, this.x + 3, this.y - 2);
      g.drawLine(this.x + 1, this.y - 9, this.x + 7, this.y - 9);
      g.drawLine(this.x + 7, this.y, this.x + 7, this.y - 9);
      g.drawLine(this.x + 2, this.y - 10, this.x + 2, this.y - 10);
      g.drawLine(this.x + 3, this.y - 8, this.x + 3, this.y - 8);
      g.drawLine(this.x + 5, this.y - 10, this.x + 6, this.y - 10);
      g.drawLine(this.x + 4, this.y + 2, this.x + 5, this.y + 1);
      g.drawLine(this.x + 5, this.y + 3, this.x + 11, this.y + 3);
      g.drawLine(this.x + 10, this.y + 2, this.x + 11, this.y + 2);
      g.drawLine(this.x + 10, this.y + 1, this.x + 11, this.y + 1);
      this.x += 8;
      g.drawLine(this.x, this.y - 10, this.x + 1, this.y - 10);
      g.drawLine(this.x + 2, this.y - 9, this.x + 2, this.y - 9);
      g.drawLine(this.x + 3, this.y, this.x + 3, this.y - 8);
      this.x += 5;
   }

   private void d(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 9);
      g.drawLine(this.x + 1, this.y - 10, this.x + 2, this.y - 10);
      g.drawLine(this.x + 1, this.y - 7, this.x + 1, this.y - 7);
      g.drawLine(this.x + 4, this.y - 7, this.x + 4, this.y - 7);
      g.drawLine(this.x + 1, this.y - 6, this.x + 4, this.y - 6);
      g.drawLine(this.x + 1, this.y, this.x + 3, this.y - 2);
      g.drawLine(this.x + 3, this.y - 1, this.x + 4, this.y - 1);
      g.drawLine(this.x + 4, this.y, this.x + 4, this.y);
      g.drawLine(this.x + 5, this.y, this.x + 5, this.y - 11);
      this.x += 9;
   }

   private void f(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 10);
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 10);
      g.drawLine(this.x + 2, this.y, this.x + 6, this.y);
      g.drawLine(this.x + 7, this.y, this.x + 7, this.y - 8);
      g.drawLine(this.x + 5, this.y - 9, this.x + 6, this.y - 8);
      g.drawLine(this.x + 5, this.y - 11, this.x + 6, this.y - 10);
      g.drawLine(this.x + 4, this.y - 9, this.x + 4, this.y - 10);
      g.drawLine(this.x + 5, this.y - 9, this.x + 7, this.y - 11);
      g.drawLine(this.x + 6, this.y - 12, this.x + 7, this.y - 12);
      g.drawLine(this.x + 5, this.y - 13, this.x + 6, this.y - 13);
      this.x += 9;
   }

   private void D(Graphics g) {
      g.drawLine(this.x, this.y - 1, this.x, this.y - 4);
      g.drawLine(this.x, this.y - 1, this.x, this.y - 4);
      g.drawLine(this.x, this.y - 7, this.x, this.y - 9);
      g.drawLine(this.x, this.y - 9, this.x + 6, this.y - 9);
      g.drawLine(this.x + 1, this.y - 10, this.x + 1, this.y - 10);
      g.drawLine(this.x + 4, this.y - 10, this.x + 5, this.y - 10);
      g.drawLine(this.x + 3, this.y - 8, this.x + 3, this.y - 8);
      g.drawLine(this.x, this.y - 6, this.x + 3, this.y - 6);
      g.drawLine(this.x, this.y - 4, this.x + 3, this.y - 4);
      g.drawLine(this.x + 4, this.y - 5, this.x + 6, this.y - 5);
      g.drawLine(this.x + 6, this.y, this.x + 6, this.y - 9);
      g.drawLine(this.x + 1, this.y, this.x + 6, this.y);
      g.drawLine(this.x + 4, this.y - 1, this.x + 5, this.y - 1);
      this.x += 9;
   }

   private void F(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 8);
      g.drawLine(this.x + 1, this.y - 9, this.x + 6, this.y - 9);
      g.drawLine(this.x + 3, this.y - 8, this.x + 3, this.y - 8);
      g.drawLine(this.x + 5, this.y - 10, this.x + 5, this.y - 10);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 2);
      g.drawLine(this.x + 2, this.y - 1, this.x + 2, this.y - 1);
      g.drawLine(this.x + 6, this.y, this.x + 7, this.y - 1);
      g.drawLine(this.x + 6, this.y, this.x + 6, this.y - 9);
      g.drawLine(this.x + 8, this.y, this.x + 9, this.y);
      g.drawLine(this.x + 10, this.y - 1, this.x + 10, this.y - 7);
      g.drawLine(this.x + 9, this.y - 8, this.x + 9, this.y - 8);
      g.drawLine(this.x + 10, this.y - 9, this.x + 12, this.y - 9);
      g.drawLine(this.x + 10, this.y - 10, this.x + 10, this.y - 10);
      this.x += 13;
   }

   private void N(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 9);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 2);
      g.drawLine(this.x + 2, this.y - 1, this.x + 2, this.y - 1);
      g.drawLine(this.x + 1, this.y - 10, this.x + 4, this.y - 10);
      g.drawLine(this.x + 4, this.y - 9, this.x + 5, this.y - 9);
      g.drawLine(this.x + 5, this.y, this.x + 5, this.y - 9);
      g.drawLine(this.x + 6, this.y, this.x + 8, this.y - 2);
      g.drawLine(this.x + 8, this.y - 2, this.x + 10, this.y);
      g.drawLine(this.x + 11, this.y, this.x + 11, this.y - 9);
      g.drawLine(this.x + 12, this.y - 9, this.x + 12, this.y - 9);
      g.drawLine(this.x + 12, this.y - 10, this.x + 15, this.y - 10);
      g.drawLine(this.x + 15, this.y - 9, this.x + 15, this.y - 9);
      g.drawLine(this.x + 16, this.y, this.x + 16, this.y - 9);
      this.x += 18;
   }

   private void t(Graphics g) {
      g.drawLine(this.x, this.y - 7, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 7);
      g.drawLine(this.x + 1, this.y - 9, this.x + 1, this.y - 9);
      g.drawLine(this.x + 2, this.y - 6, this.x + 2, this.y - 7);
      g.drawLine(this.x + 2, this.y - 9, this.x + 2, this.y - 10);
      g.drawLine(this.x + 3, this.y - 7, this.x + 3, this.y - 9);
      g.drawLine(this.x + 4, this.y - 7, this.x + 4, this.y - 7);
      g.drawLine(this.x + 4, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 5, this.y - 7, this.x + 5, this.y - 7);
      g.drawLine(this.x + 5, this.y - 9, this.x + 5, this.y - 10);
      g.drawLine(this.x + 6, this.y - 6, this.x + 6, this.y - 9);
      g.drawLine(this.x + 7, this.y, this.x + 7, this.y - 6);
      g.drawLine(this.x + 7, this.y - 9, this.x + 7, this.y - 9);
      g.drawLine(this.x + 2, this.y, this.x + 2, this.y);
      g.drawLine(this.x + 2, this.y - 2, this.x + 3, this.y - 1);
      this.x += 9;
   }

   private void z(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 7);
      g.drawLine(this.x + 2, this.y, this.x + 6, this.y);
      g.drawLine(this.x + 7, this.y - 1, this.x + 7, this.y - 5);
      g.drawLine(this.x + 6, this.y - 5, this.x + 6, this.y - 5);
      g.drawLine(this.x + 6, this.y - 3, this.x + 6, this.y - 3);
      g.drawLine(this.x + 5, this.y - 4, this.x + 5, this.y - 4);
      g.drawLine(this.x + 1, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 4, this.y - 8, this.x + 6, this.y - 8);
      g.drawLine(this.x + 7, this.y - 9, this.x + 7, this.y - 12);
      g.drawLine(this.x + 6, this.y - 11, this.x + 6, this.y - 12);
      this.x += 9;
   }

   private void T(Graphics g) {
      g.drawLine(this.x, this.y - 7, this.x, this.y - 9);
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 6);
      g.drawLine(this.x + 2, this.y - 5, this.x + 6, this.y - 5);
      g.drawLine(this.x + 2, this.y, this.x + 4, this.y);
      g.drawLine(this.x + 5, this.y - 1, this.x + 5, this.y - 5);
      g.drawLine(this.x + 1, this.y - 10, this.x + 1, this.y - 10);
      g.drawLine(this.x + 1, this.y - 9, this.x + 1, this.y - 9);
      g.drawLine(this.x + 2, this.y - 10, this.x + 6, this.y - 10);
      g.drawLine(this.x + 6, this.y - 9, this.x + 6, this.y - 7);
      g.drawLine(this.x + 3, this.y - 7, this.x + 6, this.y - 7);
      this.x += 9;
   }

   private void Z(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x + 2, this.y - 10);
      g.drawLine(this.x + 3, this.y - 8, this.x + 5, this.y - 10);
      g.drawLine(this.x + 1, this.y - 9, this.x + 2, this.y - 9);
      g.drawLine(this.x + 6, this.y - 9, this.x + 7, this.y - 9);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 7);
      g.drawLine(this.x + 1, this.y, this.x + 3, this.y - 2);
      g.drawLine(this.x + 3, this.y - 2, this.x + 5, this.y);
      g.drawLine(this.x + 6, this.y, this.x + 6, this.y - 6);
      g.drawLine(this.x + 5, this.y - 6, this.x + 5, this.y - 6);
      g.drawLine(this.x + 4, this.y - 5, this.x + 5, this.y - 4);
      this.x += 9;
   }

   private void n(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 4);
      g.drawLine(this.x, this.y - 6, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y - 9, this.x + 1, this.y - 9);
      g.drawLine(this.x + 2, this.y - 10, this.x + 5, this.y - 10);
      g.drawLine(this.x + 6, this.y - 9, this.x + 6, this.y - 7);
      g.drawLine(this.x + 5, this.y - 9, this.x + 5, this.y - 9);
      g.drawLine(this.x + 4, this.y - 6, this.x + 5, this.y - 6);
      g.drawLine(this.x + 4, this.y - 7, this.x + 4, this.y - 7);
      g.drawLine(this.x + 1, this.y - 5, this.x + 2, this.y - 5);
      g.drawLine(this.x + 1, this.y - 1, this.x + 2, this.y - 1);
      g.drawLine(this.x + 2, this.y, this.x + 6, this.y);
      g.drawLine(this.x + 6, this.y, this.x + 6, this.y - 4);
      g.drawLine(this.x + 3, this.y - 4, this.x + 6, this.y - 4);
      this.x += 9;
   }

   private void b(Graphics g) {
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 7);
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x, this.y - 9, this.x + 2, this.y - 9);
      g.drawLine(this.x + 1, this.y, this.x + 5, this.y);
      g.drawLine(this.x + 6, this.y - 1, this.x + 6, this.y - 8);
      g.drawLine(this.x + 5, this.y - 9, this.x + 5, this.y - 9);
      g.drawLine(this.x + 6, this.y - 10, this.x + 8, this.y - 10);
      g.drawLine(this.x + 1, this.y - 10, this.x + 1, this.y - 10);
      this.x += 9;
   }

   private void p(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 7);
      g.drawLine(this.x + 2, this.y, this.x + 4, this.y - 2);
      g.drawLine(this.x + 4, this.y - 2, this.x + 6, this.y);
      g.drawLine(this.x + 7, this.y, this.x + 7, this.y - 6);
      g.drawLine(this.x + 5, this.y - 5, this.x + 6, this.y - 6);
      g.drawLine(this.x + 6, this.y - 4, this.x + 6, this.y - 4);
      g.drawLine(this.x + 7, this.y - 9, this.x + 7, this.y - 12);
      g.drawLine(this.x + 6, this.y - 11, this.x + 6, this.y - 12);
      g.drawLine(this.x + 1, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 4, this.y - 8, this.x + 6, this.y - 8);
      this.x += 9;
   }

   private void B(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 7);
      g.drawLine(this.x + 2, this.y, this.x + 2, this.y);
      g.drawLine(this.x + 2, this.y - 2, this.x + 2, this.y - 2);
      g.drawLine(this.x + 3, this.y, this.x + 3, this.y - 2);
      g.drawLine(this.x + 1, this.y - 9, this.x + 7, this.y - 9);
      g.drawLine(this.x + 7, this.y, this.x + 7, this.y - 9);
      g.drawLine(this.x + 2, this.y - 10, this.x + 2, this.y - 10);
      g.drawLine(this.x + 3, this.y - 8, this.x + 3, this.y - 8);
      g.drawLine(this.x + 5, this.y - 10, this.x + 6, this.y - 10);
      this.x += 9;
   }

   private void P(Graphics g) {
      g.drawLine(this.x, this.y - 7, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 7);
      g.drawLine(this.x + 1, this.y - 9, this.x + 1, this.y - 9);
      g.drawLine(this.x + 2, this.y - 6, this.x + 2, this.y - 7);
      g.drawLine(this.x + 2, this.y - 9, this.x + 2, this.y - 10);
      g.drawLine(this.x + 3, this.y - 7, this.x + 3, this.y - 9);
      g.drawLine(this.x + 4, this.y - 7, this.x + 4, this.y - 7);
      g.drawLine(this.x + 4, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 5, this.y - 7, this.x + 5, this.y - 7);
      g.drawLine(this.x + 5, this.y - 9, this.x + 5, this.y - 10);
      g.drawLine(this.x + 6, this.y - 6, this.x + 6, this.y - 9);
      g.drawLine(this.x + 7, this.y, this.x + 7, this.y - 6);
      g.drawLine(this.x + 7, this.y - 9, this.x + 7, this.y - 9);
      g.drawLine(this.x, this.y, this.x, this.y - 2);
      this.x += 9;
   }

   private void m(Graphics g) {
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 7);
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x, this.y - 9, this.x + 2, this.y - 9);
      g.drawLine(this.x + 1, this.y, this.x + 5, this.y);
      g.drawLine(this.x + 6, this.y - 1, this.x + 6, this.y - 8);
      g.drawLine(this.x + 5, this.y - 9, this.x + 5, this.y - 9);
      g.drawLine(this.x + 6, this.y - 10, this.x + 8, this.y - 10);
      g.drawLine(this.x + 1, this.y - 10, this.x + 1, this.y - 10);
      g.drawLine(this.x + 1, this.y - 5, this.x + 6, this.y - 5);
      this.x += 9;
   }

   private void y(Graphics g) {
      g.drawLine(this.x, this.y - 1, this.x, this.y - 10);
      g.drawLine(this.x + 1, this.y - 10, this.x + 2, this.y - 9);
      g.drawLine(this.x + 1, this.y - 7, this.x + 2, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 4, this.y);
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 1);
      g.drawLine(this.x + 5, this.y - 1, this.x + 5, this.y - 7);
      g.drawLine(this.x + 4, this.y - 8, this.x + 4, this.y - 8);
      g.drawLine(this.x + 5, this.y - 9, this.x + 7, this.y - 9);
      g.drawLine(this.x + 5, this.y - 10, this.x + 5, this.y - 10);
      g.drawLine(this.x + 6, this.y, this.x + 9, this.y);
      g.drawLine(this.x + 10, this.y - 1, this.x + 10, this.y - 7);
      g.drawLine(this.x + 9, this.y - 8, this.x + 9, this.y - 8);
      g.drawLine(this.x + 9, this.y - 9, this.x + 11, this.y - 9);
      g.drawLine(this.x + 9, this.y - 10, this.x + 9, this.y - 10);
      this.x += 12;
   }

   private void r(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 1);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 2);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y);
      g.drawLine(this.x + 2, this.y, this.x + 2, this.y - 7);
      g.drawLine(this.x + 1, this.y - 8, this.x + 1, this.y - 8);
      g.drawLine(this.x + 2, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 2, this.y - 10, this.x + 2, this.y - 10);
      this.x += 6;
   }

   private void l(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 9);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 2);
      g.drawLine(this.x + 2, this.y - 1, this.x + 2, this.y - 2);
      g.drawLine(this.x + 1, this.y - 10, this.x + 4, this.y - 10);
      g.drawLine(this.x + 5, this.y - 1, this.x + 5, this.y - 9);
      g.drawLine(this.x + 1, this.y - 10, this.x + 4, this.y - 10);
      g.drawLine(this.x + 6, this.y, this.x + 9, this.y);
      g.drawLine(this.x + 6, this.y - 1, this.x + 6, this.y - 1);
      g.drawLine(this.x + 10, this.y - 1, this.x + 10, this.y - 7);
      g.drawLine(this.x + 9, this.y - 8, this.x + 9, this.y - 9);
      g.drawLine(this.x + 8, this.y - 8, this.x + 8, this.y - 8);
      g.drawLine(this.x + 10, this.y - 9, this.x + 11, this.y - 9);
      g.drawLine(this.x + 10, this.y - 10, this.x + 10, this.y - 10);
      this.x += 13;
   }

   private void v(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 1);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 2);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y);
      g.drawLine(this.x + 2, this.y, this.x + 2, this.y - 7);
      g.drawLine(this.x + 1, this.y - 8, this.x + 1, this.y - 8);
      g.drawLine(this.x + 2, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 2, this.y - 10, this.x + 2, this.y - 10);
      g.drawLine(this.x + 4, this.y - 9, this.x + 4, this.y - 12);
      g.drawLine(this.x + 2, this.y - 11, this.x + 4, this.y - 12);
      this.x += 6;
   }

   private void s(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 7);
      g.drawLine(this.x, this.y, this.x, this.y - 9);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 2);
      g.drawLine(this.x + 1, this.y - 9, this.x + 1, this.y - 10);
      g.drawLine(this.x + 2, this.y - 1, this.x + 2, this.y - 2);
      g.drawLine(this.x + 2, this.y - 10, this.x + 2, this.y - 11);
      g.drawLine(this.x + 3, this.y - 10, this.x + 3, this.y - 10);
      g.drawLine(this.x + 1, this.y - 8, this.x + 4, this.y - 8);
      g.drawLine(this.x + 5, this.y - 1, this.x + 5, this.y - 7);
      g.drawLine(this.x + 6, this.y, this.x + 9, this.y);
      g.drawLine(this.x + 6, this.y, this.x + 9, this.y);
      g.drawLine(this.x + 10, this.y, this.x + 10, this.y - 8);
      g.drawLine(this.x + 9, this.y - 9, this.x + 9, this.y - 9);
      g.drawLine(this.x + 10, this.y - 10, this.x + 11, this.y - 10);
      this.x += 13;
   }

   private void h(Graphics g) {
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 7);
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x, this.y - 9, this.x + 2, this.y - 9);
      g.drawLine(this.x + 1, this.y, this.x + 5, this.y);
      g.drawLine(this.x + 6, this.y - 1, this.x + 6, this.y - 8);
      g.drawLine(this.x + 5, this.y - 9, this.x + 5, this.y - 9);
      g.drawLine(this.x + 6, this.y - 10, this.x + 8, this.y - 10);
      g.drawLine(this.x + 6, this.y - 10, this.x + 10, this.y - 10);
      g.drawLine(this.x + 11, this.y, this.x + 11, this.y - 9);
      this.x += 13;
   }

   private void L(Graphics g) {
      g.drawLine(this.x, this.y - 7, this.x, this.y - 9);
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 6);
      g.drawLine(this.x + 2, this.y - 5, this.x + 6, this.y - 5);
      g.drawLine(this.x + 2, this.y, this.x + 4, this.y);
      g.drawLine(this.x + 5, this.y - 1, this.x + 5, this.y - 5);
      g.drawLine(this.x + 1, this.y - 10, this.x + 1, this.y - 10);
      g.drawLine(this.x + 1, this.y - 9, this.x + 1, this.y - 9);
      g.drawLine(this.x + 2, this.y - 10, this.x + 6, this.y - 10);
      g.drawLine(this.x + 6, this.y - 9, this.x + 6, this.y - 7);
      g.drawLine(this.x + 3, this.y - 7, this.x + 6, this.y - 7);
      this.x += 4;
      this.y += 6;
      g.drawLine(this.x, this.y, this.x, this.y - 3);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y);
      g.drawLine(this.x + 2, this.y - 1, this.x + 3, this.y - 1);
      g.drawLine(this.x + 3, this.y, this.x + 4, this.y);
      g.drawLine(this.x + 5, this.y, this.x + 5, this.y - 13);
      g.drawLine(this.x + 4, this.y - 14, this.x + 4, this.y - 14);
      g.drawLine(this.x + 5, this.y - 15, this.x + 7, this.y - 15);
      g.drawLine(this.x + 5, this.y - 16, this.x + 5, this.y - 16);
      g.drawLine(this.x - 1, this.y - 2, this.x - 1, this.y - 3);
      this.y -= 6;
      this.x += 9;
   }

   private void G(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 1);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 2);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y);
      g.drawLine(this.x + 2, this.y, this.x + 2, this.y - 7);
      g.drawLine(this.x + 1, this.y - 8, this.x + 1, this.y - 8);
      g.drawLine(this.x + 2, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 2, this.y - 10, this.x + 2, this.y - 10);
      g.drawLine(this.x + 3, this.y - 5, this.x + 7, this.y - 5);
      this.x += 5;
      g.drawLine(this.x, this.y, this.x, this.y - 1);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 2);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y);
      g.drawLine(this.x + 2, this.y, this.x + 2, this.y - 7);
      g.drawLine(this.x + 1, this.y - 8, this.x + 1, this.y - 8);
      g.drawLine(this.x + 2, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 2, this.y - 10, this.x + 2, this.y - 10);
      this.x += 6;
   }

   private void Fb(Graphics g) {
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 7);
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x, this.y - 9, this.x + 2, this.y - 9);
      g.drawLine(this.x + 1, this.y, this.x + 5, this.y);
      g.drawLine(this.x + 6, this.y - 1, this.x + 6, this.y - 8);
      g.drawLine(this.x + 5, this.y - 9, this.x + 5, this.y - 9);
      g.drawLine(this.x + 6, this.y - 10, this.x + 8, this.y - 10);
      g.drawLine(this.x + 1, this.y - 10, this.x + 1, this.y - 10);
      g.drawLine(this.x, this.y + 3, this.x + 2, this.y + 3);
      g.drawLine(this.x, this.y + 4, this.x + 1, this.y + 4);
      g.drawLine(this.x + 3, this.y + 1, this.x + 3, this.y + 2);
      g.drawLine(this.x + 4, this.y + 2, this.x + 5, this.y + 2);
      this.x += 9;
   }

   private void FB(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 7);
      g.drawLine(this.x + 2, this.y, this.x + 2, this.y);
      g.drawLine(this.x + 2, this.y - 2, this.x + 2, this.y - 2);
      g.drawLine(this.x + 3, this.y, this.x + 3, this.y - 2);
      g.drawLine(this.x + 1, this.y - 9, this.x + 7, this.y - 9);
      g.drawLine(this.x + 7, this.y, this.x + 7, this.y - 9);
      g.drawLine(this.x + 2, this.y - 10, this.x + 2, this.y - 10);
      g.drawLine(this.x + 3, this.y - 8, this.x + 3, this.y - 8);
      g.drawLine(this.x + 5, this.y - 10, this.x + 6, this.y - 10);
      g.drawLine(this.x, this.y + 3, this.x + 2, this.y + 3);
      g.drawLine(this.x, this.y + 4, this.x + 1, this.y + 4);
      g.drawLine(this.x + 3, this.y + 1, this.x + 3, this.y + 2);
      g.drawLine(this.x + 4, this.y + 2, this.x + 5, this.y + 2);
      this.x += 10;
   }

   private void Fo(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 3);
      g.drawLine(this.x, this.y - 6, this.x, this.y - 7);
      g.drawLine(this.x, this.y - 10, this.x + 1, this.y - 10);
      g.drawLine(this.x, this.y, this.x + 3, this.y);
      g.drawLine(this.x, this.y - 3, this.x + 3, this.y - 3);
      g.drawLine(this.x, this.y - 5, this.x + 2, this.y - 5);
      g.drawLine(this.x + 1, this.y - 5, this.x + 2, this.y - 5);
      g.drawLine(this.x + 1, this.y - 8, this.x + 4, this.y - 8);
      g.drawLine(this.x + 2, this.y - 9, this.x + 3, this.y - 9);
      g.drawLine(this.x + 1, this.y - 11, this.x + 5, this.y - 11);
      g.drawLine(this.x + 4, this.y - 1, this.x + 4, this.y - 1);
      g.drawLine(this.x + 4, this.y - 4, this.x + 4, this.y - 4);
      g.drawLine(this.x + 5, this.y - 4, this.x + 5, this.y + 3);
      g.drawLine(this.x + 5, this.y - 6, this.x + 5, this.y - 8);
      g.drawLine(this.x + 5, this.y - 12, this.x + 5, this.y - 12);
      g.drawLine(this.x + 4, this.y + 3, this.x + 4, this.y + 3);
      this.x += 8;
   }

   private void FE(Graphics g) {
      g.drawLine(this.x, this.y - 5, this.x, this.y - 6);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 9);
      g.drawLine(this.x + 2, this.y, this.x + 3, this.y - 1);
      g.drawLine(this.x + 3, this.y - 1, this.x + 4, this.y);
      g.drawLine(this.x + 5, this.y, this.x + 5, this.y - 7);
      g.drawLine(this.x + 1, this.y - 7, this.x + 1, this.y - 7);
      g.drawLine(this.x + 2, this.y - 8, this.x + 4, this.y - 8);
      this.x += 8;
   }

   private void Fu(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 3);
      g.drawLine(this.x, this.y - 6, this.x, this.y - 7);
      g.drawLine(this.x, this.y, this.x + 3, this.y);
      g.drawLine(this.x, this.y - 3, this.x + 3, this.y - 3);
      g.drawLine(this.x, this.y - 5, this.x + 2, this.y - 5);
      g.drawLine(this.x + 1, this.y - 5, this.x + 2, this.y - 5);
      g.drawLine(this.x + 1, this.y - 8, this.x + 4, this.y - 8);
      g.drawLine(this.x + 2, this.y - 9, this.x + 3, this.y - 9);
      g.drawLine(this.x + 4, this.y - 1, this.x + 4, this.y - 1);
      g.drawLine(this.x + 4, this.y - 4, this.x + 4, this.y - 4);
      g.drawLine(this.x + 5, this.y - 4, this.x + 5, this.y + 3);
      g.drawLine(this.x + 5, this.y - 6, this.x + 5, this.y - 8);
      g.drawLine(this.x + 4, this.y + 3, this.x + 4, this.y + 3);
      this.x += 8;
   }

   private void FO(Graphics g) {
      g.drawLine(this.x, this.y, this.x, this.y - 3);
      g.drawLine(this.x, this.y - 6, this.x, this.y - 7);
      g.drawLine(this.x, this.y, this.x + 3, this.y);
      g.drawLine(this.x, this.y - 3, this.x + 3, this.y - 3);
      g.drawLine(this.x, this.y - 5, this.x + 2, this.y - 5);
      g.drawLine(this.x + 1, this.y - 5, this.x + 2, this.y - 5);
      g.drawLine(this.x + 1, this.y - 8, this.x + 4, this.y - 8);
      g.drawLine(this.x + 2, this.y - 9, this.x + 3, this.y - 9);
      g.drawLine(this.x + 4, this.y - 1, this.x + 4, this.y - 1);
      g.drawLine(this.x + 4, this.y - 4, this.x + 4, this.y - 4);
      g.drawLine(this.x + 5, this.y - 4, this.x + 5, this.y + 3);
      g.drawLine(this.x + 5, this.y - 6, this.x + 5, this.y - 8);
      g.drawLine(this.x + 4, this.y + 3, this.x + 4, this.y + 3);
      g.drawLine(this.x, this.y - 10, this.x, this.y - 11);
      g.drawLine(this.x, this.y - 11, this.x + 3, this.y - 11);
      g.drawLine(this.x + 4, this.y - 10, this.x + 5, this.y - 10);
      this.x += 8;
   }

   private void FU(Graphics g) {
      g.drawLine(this.x, this.y - 1, this.x, this.y - 7);
      g.drawLine(this.x + 1, this.y - 8, this.x + 3, this.y - 8);
      g.drawLine(this.x + 2, this.y - 7, this.x + 3, this.y - 7);
      g.drawLine(this.x + 1, this.y - 5, this.x + 1, this.y - 6);
      g.drawLine(this.x + 2, this.y - 5, this.x + 2, this.y - 5);
      g.drawLine(this.x + 1, this.y, this.x + 4, this.y);
      g.drawLine(this.x + 4, this.y, this.x + 4, this.y - 2);
      g.drawLine(this.x + 2, this.y - 3, this.x + 3, this.y - 3);
      g.drawLine(this.x + 4, this.y - 4, this.x + 4, this.y - 7);
      ++this.x;
      this.y += 6;
      g.drawLine(this.x, this.y - 1, this.x, this.y - 3);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 3);
      g.drawLine(this.x + 1, this.y, this.x + 4, this.y);
      g.drawLine(this.x + 5, this.y - 1, this.x + 5, this.y - 12);
      g.drawLine(this.x + 4, this.y - 13, this.x + 4, this.y - 13);
      g.drawLine(this.x + 5, this.y - 14, this.x + 7, this.y - 14);
      g.drawLine(this.x + 5, this.y - 15, this.x + 5, this.y - 15);
      this.y -= 6;
      this.x += 8;
   }

   private void BA(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 9);
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 10);
      g.drawLine(this.x + 2, this.y, this.x + 5, this.y);
      g.drawLine(this.x + 5, this.y + 2, this.x + 5, this.y - 8);
      g.drawLine(this.x + 1, this.y - 10, this.x + 7, this.y - 10);
      g.drawLine(this.x + 4, this.y - 9, this.x + 4, this.y - 9);
      g.drawLine(this.x + 8, this.y, this.x + 8, this.y - 9);
      this.x += 11;
   }

   private void a(Graphics g) {
      g.drawLine(this.x, this.y - 10, this.x + 1, this.y - 10);
      g.drawLine(this.x + 2, this.y - 9, this.x + 2, this.y - 9);
      g.drawLine(this.x + 3, this.y, this.x + 3, this.y - 8);
      this.x += 5;
   }

   private void e(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 10);
      g.drawLine(this.x + 1, this.y - 9, this.x + 3, this.y - 9);
      g.drawLine(this.x + 2, this.y, this.x + 2, this.y);
      g.drawLine(this.x + 2, this.y - 2, this.x + 2, this.y - 2);
      g.drawLine(this.x + 3, this.y - 1, this.x + 3, this.y - 1);
      this.x += 5;
   }

   private void E(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 10);
      g.drawLine(this.x + 1, this.y - 9, this.x + 3, this.y - 9);
      g.drawLine(this.x + 2, this.y, this.x + 2, this.y);
      g.drawLine(this.x + 2, this.y - 2, this.x + 2, this.y - 2);
      g.drawLine(this.x + 3, this.y - 1, this.x + 3, this.y - 1);
      g.drawLine(this.x, this.y - 13, this.x, this.y - 13);
      g.drawLine(this.x + 1, this.y - 12, this.x + 1, this.y - 14);
      g.drawLine(this.x + 1, this.y - 12, this.x + 3, this.y - 12);
      g.drawLine(this.x + 3, this.y - 12, this.x + 3, this.y - 16);
      g.drawLine(this.x + 2, this.y - 16, this.x + 2, this.y - 16);
      this.x += 5;
   }

   private void é(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 10);
      g.drawLine(this.x + 1, this.y - 9, this.x + 3, this.y - 9);
      g.drawLine(this.x + 2, this.y, this.x + 2, this.y);
      g.drawLine(this.x + 2, this.y - 2, this.x + 2, this.y - 2);
      g.drawLine(this.x + 3, this.y - 1, this.x + 3, this.y - 1);
      g.drawLine(this.x, this.y - 15, this.x, this.y - 18);
      g.drawLine(this.x + 1, this.y - 13, this.x + 1, this.y - 14);
      g.drawLine(this.x + 1, this.y - 14, this.x + 3, this.y - 14);
      g.drawLine(this.x + 3, this.y - 13, this.x + 3, this.y - 14);
      g.drawLine(this.x + 2, this.y - 12, this.x + 2, this.y - 12);
      this.x += 5;
   }

   private void A(Graphics g) {
      g.drawLine(this.x, this.y - 10, this.x + 1, this.y - 10);
      g.drawLine(this.x + 2, this.y - 9, this.x + 2, this.y - 9);
      g.drawLine(this.x + 3, this.y, this.x + 3, this.y - 8);
      g.drawLine(this.x + 4, this.y - 9, this.x + 4, this.y - 11);
      g.drawLine(this.x + 3, this.y - 12, this.x + 3, this.y - 13);
      g.drawLine(this.x + 2, this.y - 13, this.x + 2, this.y - 14);
      this.x += 5;
   }

   private void m1(Graphics g) {
      this.x -= 5;
      g.drawLine(this.x, this.y + 6, this.x, this.y + 2);
      g.drawLine(this.x + 1, this.y + 6, this.x + 4, this.y + 6);
      g.drawLine(this.x + 5, this.y + 5, this.x + 5, this.y - 13);
      g.drawLine(this.x, this.y - 14, this.x + 4, this.y - 14);
      g.drawLine(this.x, this.y - 13, this.x, this.y - 16);
      this.x += 8;
   }

   private void m2(Graphics g) {
      this.x -= 4;
      g.drawLine(this.x, this.y + 6, this.x, this.y + 2);
      g.drawLine(this.x + 1, this.y + 6, this.x + 4, this.y + 6);
      g.drawLine(this.x + 5, this.y + 5, this.x + 5, this.y - 17);
      g.drawLine(this.x, this.y - 13, this.x + 5, this.y - 13);
      g.drawLine(this.x, this.y - 13, this.x, this.y - 15);
      g.drawLine(this.x, this.y - 13, this.x, this.y - 15);
      g.drawLine(this.x + 1, this.y - 16, this.x + 2, this.y - 16);
      g.drawLine(this.x + 3, this.y - 15, this.x + 3, this.y - 15);
      g.drawLine(this.x + 4, this.y - 14, this.x + 4, this.y - 14);
      g.drawLine(this.x + 3, this.y - 16, this.x + 3, this.y - 18);
      this.x += 8;
   }

   private void m3(Graphics g) {
      g.drawLine(this.x, this.y - 2, this.x, this.y - 3);
      g.drawLine(this.x, this.y - 5, this.x, this.y - 6);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 3);
      g.drawLine(this.x + 1, this.y - 5, this.x + 1, this.y - 6);
      this.x += 4;
   }

   private void H(Graphics g) {
      g.drawLine(this.x, this.y - 1, this.x, this.y - 2);
      g.drawLine(this.x + 3, this.y - 1, this.x + 3, this.y - 2);
      g.drawLine(this.x + 1, this.y - 3, this.x + 2, this.y - 3);
      g.drawLine(this.x + 1, this.y, this.x + 2, this.y);
      g.drawLine(this.x, this.y - 6, this.x, this.y - 9);
      g.drawLine(this.x + 3, this.y - 6, this.x + 3, this.y - 9);
      g.drawLine(this.x + 1, this.y - 10, this.x + 2, this.y - 10);
      g.drawLine(this.x + 1, this.y - 5, this.x + 2, this.y - 5);
      this.x += 5;
   }

   private void sp(Graphics g) {
      g.drawLine(this.x, this.y - 3, this.x + 1, this.y - 3);
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 3);
      g.drawLine(this.x, this.y, this.x, this.y);
      this.x += 6;
   }

   private void Xs(Graphics g) {
      this.y += 5;
      this.x -= 5;
      g.drawLine(this.x, this.y - 4, this.x, this.y - 4);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 3);
      g.drawLine(this.x + 2, this.y, this.x + 3, this.y);
      g.drawLine(this.x + 3, this.y - 3, this.x + 3, this.y - 3);
      g.drawLine(this.x + 4, this.y - 1, this.x + 4, this.y - 3);
      g.drawLine(this.x + 5, this.y, this.x + 7, this.y);
      g.drawLine(this.x + 7, this.y, this.x + 7, this.y - 11);
      g.drawLine(this.x + 6, this.y - 12, this.x + 6, this.y - 13);
      g.drawLine(this.x + 6, this.y - 12, this.x + 6, this.y - 13);
      g.drawLine(this.x + 6, this.y - 13, this.x + 8, this.y - 13);
      g.drawLine(this.x + 7, this.y - 13, this.x + 7, this.y - 14);
      this.x += 10;
      this.y -= 5;
   }

   private void Qs(Graphics g) {
      this.y += 6;
      this.x -= 7;
      g.drawLine(this.x, this.y, this.x, this.y - 4);
      g.drawLine(this.x, this.y, this.x, this.y - 4);
      g.drawLine(this.x, this.y - 4, this.x + 3, this.y - 4);
      g.drawLine(this.x + 3, this.y, this.x + 3, this.y - 4);
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 1);
      g.drawLine(this.x, this.y - 4, this.x + 3, this.y - 4);
      g.drawLine(this.x, this.y, this.x + 8, this.y);
      g.drawLine(this.x + 6, this.y, this.x + 6, this.y - 2);
      g.drawLine(this.x + 5, this.y - 2, this.x + 5, this.y - 2);
      g.drawLine(this.x + 9, this.y - 1, this.x + 9, this.y - 13);
      g.drawLine(this.x + 8, this.y - 14, this.x + 8, this.y - 14);
      g.drawLine(this.x + 9, this.y - 15, this.x + 9, this.y - 16);
      g.drawLine(this.x + 9, this.y - 15, this.x + 10, this.y - 15);
      this.y -= 6;
      this.x += 10;
   }

   private void bs(Graphics g) {
      this.y += 6;
      this.x -= 5;
      g.drawLine(this.x, this.y, this.x, this.y - 3);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 3);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y);
      g.drawLine(this.x + 2, this.y - 1, this.x + 3, this.y - 1);
      g.drawLine(this.x + 3, this.y, this.x + 4, this.y);
      g.drawLine(this.x + 5, this.y, this.x + 5, this.y - 13);
      g.drawLine(this.x + 4, this.y - 14, this.x + 4, this.y - 14);
      g.drawLine(this.x + 5, this.y - 15, this.x + 7, this.y - 15);
      g.drawLine(this.x + 5, this.y - 16, this.x + 5, this.y - 16);
      this.x += 8;
      this.y -= 6;
   }

   private void ys(Graphics g) {
      this.y += 5;
      this.x -= 4;
      g.drawLine(this.x, this.y - 1, this.x, this.y - 3);
      g.drawLine(this.x + 1, this.y - 2, this.x + 1, this.y - 3);
      g.drawLine(this.x + 1, this.y, this.x + 4, this.y);
      g.drawLine(this.x + 5, this.y - 1, this.x + 5, this.y - 12);
      g.drawLine(this.x + 4, this.y - 13, this.x + 4, this.y - 13);
      g.drawLine(this.x + 5, this.y - 14, this.x + 7, this.y - 14);
      g.drawLine(this.x + 5, this.y - 15, this.x + 5, this.y - 15);
      this.y -= 5;
      this.x += 9;
   }

   private void rs(Graphics g) {
      g.drawLine(this.x, this.y - 8, this.x, this.y - 8);
      g.drawLine(this.x + 1, this.y - 9, this.x + 3, this.y - 9);
      g.drawLine(this.x + 1, this.y - 10, this.x + 1, this.y - 10);
      g.drawLine(this.x + 1, this.y + 7, this.x + 1, this.y - 7);
      g.drawLine(this.x + 2, this.y + 8, this.x + 5, this.y + 8);
      g.drawLine(this.x + 5, this.y + 8, this.x + 5, this.y + 6);
      this.x += 4;
   }

   private void ss(Graphics g) {
      this.x -= 5;
      this.y += 6;
      g.drawLine(this.x, this.y - 2, this.x, this.y - 3);
      g.drawLine(this.x + 1, this.y, this.x + 1, this.y - 4);
      g.drawLine(this.x + 1, this.y, this.x + 5, this.y);
      g.drawLine(this.x + 6, this.y - 1, this.x + 6, this.y - 13);
      g.drawLine(this.x + 5, this.y - 14, this.x + 5, this.y - 14);
      g.drawLine(this.x + 6, this.y - 16, this.x + 6, this.y - 16);
      g.drawLine(this.x + 6, this.y - 15, this.x + 7, this.y - 15);
      g.drawLine(this.x + 4, this.y - 5, this.x + 7, this.y - 6);
      this.x += 9;
      this.y -= 6;
   }

   private void Fs(Graphics g) {
      this.y += 5;
      this.x -= 8;
      g.drawLine(this.x, this.y, this.x, this.y - 2);
      g.drawLine(this.x, this.y, this.x + 2, this.y);
      g.drawLine(this.x + 1, this.y - 3, this.x + 5, this.y - 3);
      g.drawLine(this.x + 5, this.y, this.x + 5, this.y - 3);
      g.drawLine(this.x + 5, this.y, this.x + 8, this.y);
      g.drawLine(this.x + 9, this.y, this.x + 9, this.y - 13);
      g.drawLine(this.x + 8, this.y - 14, this.x + 8, this.y - 14);
      g.drawLine(this.x + 9, this.y - 15, this.x + 9, this.y - 15);
      g.drawLine(this.x + 9, this.y - 15, this.x + 10, this.y - 15);
      this.y -= 6;
      this.x += 12;
   }

   private void ks(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 5;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 3);
      g.drawLine(this.c + 1, this.d - 4, this.c + 4, this.d - 4);
      g.drawLine(this.c + 5, this.d, this.c + 5, this.d - 3);
   }

   private void xs(Graphics g) {
      this.c = this.x - 8;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c + 1, this.d, this.c + 4, this.d);
      g.drawLine(this.c, this.d - 1, this.c, this.d - 4);
      g.drawLine(this.c + 1, this.d - 5, this.c + 4, this.d - 5);
      g.drawLine(this.c + 5, this.d - 1, this.c + 5, this.d - 4);
      g.drawLine(this.c + 1, this.d - 2, this.c + 3, this.d - 2);
      g.drawLine(this.c + 4, this.d - 3, this.c + 4, this.d - 3);
   }

   private void Ks(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 3);
      g.drawLine(this.c + 1, this.d - 4, this.c + 4, this.d - 4);
      g.drawLine(this.c + 5, this.d, this.c + 5, this.d - 3);
      g.drawLine(this.c + 1, this.d, this.c + 2, this.d - 1);
      g.drawLine(this.c + 2, this.d - 1, this.c + 3, this.d - 1);
   }

   private void gs(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 5;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d - 1, this.c, this.d - 3);
      g.drawLine(this.c + 1, this.d - 2, this.c + 1, this.d - 3);
      g.drawLine(this.c + 1, this.d, this.c + 3, this.d);
      g.drawLine(this.c + 3, this.d - 1, this.c + 5, this.d - 1);
      g.drawLine(this.c + 5, this.d - 2, this.c + 6, this.d - 2);
   }

   private void cs(Graphics g) {
      this.c = this.x - 8;
      this.d = this.y + 5;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 1);
      g.drawLine(this.c + 1, this.d - 2, this.c + 1, this.d - 2);
      g.drawLine(this.c + 1, this.d - 5, this.c + 1, this.d - 5);
      g.drawLine(this.c, this.d, this.c + 2, this.d);
      g.drawLine(this.c + 2, this.d - 3, this.c + 2, this.d - 5);
      g.drawLine(this.c + 3, this.d - 1, this.c + 3, this.d - 1);
      g.drawLine(this.c + 3, this.d - 1, this.c + 3, this.d - 1);
      g.drawLine(this.c + 4, this.d - 2, this.c + 4, this.d - 4);
      g.drawLine(this.c + 4, this.d - 2, this.c + 6, this.d - 2);
   }

   private void Bs(Graphics g) {
      this.c = this.x - 8;
      this.d = this.y + 5;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 3);
      g.drawLine(this.c + 4, this.d, this.c + 4, this.d - 3);
      g.drawLine(this.c + 1, this.d - 3, this.c + 1, this.d - 3);
      g.drawLine(this.c + 3, this.d - 3, this.c + 3, this.d - 3);
      g.drawLine(this.c + 2, this.d - 2, this.c + 2, this.d - 2);
   }

   private void qs(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 1);
      g.drawLine(this.c + 1, this.d, this.c + 1, this.d - 3);
      g.drawLine(this.c + 1, this.d - 1, this.c + 3, this.d - 1);
      g.drawLine(this.c + 3, this.d, this.c + 6, this.d);
      g.drawLine(this.c + 6, this.d, this.c + 6, this.d - 4);
      g.drawLine(this.c + 5, this.d - 4, this.c + 5, this.d - 4);
      g.drawLine(this.c + 5, this.d - 2, this.c + 5, this.d - 2);
      g.drawLine(this.c + 4, this.d - 3, this.c + 4, this.d - 3);
   }

   private void Cs(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 2);
      g.drawLine(this.c + 1, this.d - 3, this.c + 2, this.d - 3);
      g.drawLine(this.c + 1, this.d, this.c + 5, this.d);
      g.drawLine(this.c + 5, this.d, this.c + 5, this.d - 3);
      g.drawLine(this.c + 4, this.d - 3, this.c + 4, this.d - 3);
      g.drawLine(this.c + 5, this.d - 1, this.c + 5, this.d - 2);
      g.drawLine(this.c + 6, this.d - 1, this.c + 6, this.d - 1);
   }

   private void js(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 3);
      g.drawLine(this.c + 1, this.d, this.c + 1, this.d);
      g.drawLine(this.c + 1, this.d - 3, this.c + 1, this.d - 3);
      g.drawLine(this.c + 3, this.d - 3, this.c + 4, this.d - 3);
      g.drawLine(this.c + 2, this.d - 2, this.c + 2, this.d - 2);
      g.drawLine(this.c + 5, this.d, this.c + 5, this.d - 2);
      g.drawLine(this.c + 5, this.d - 3, this.c + 7, this.d - 3);
      g.drawLine(this.c + 8, this.d, this.c + 8, this.d - 2);
      g.drawLine(this.c + 1, this.d + 1, this.c + 1, this.d + 1);
      g.drawLine(this.c + 2, this.d + 2, this.c + 4, this.d + 2);
      g.drawLine(this.c + 5, this.d + 3, this.c + 7, this.d + 3);
      g.drawLine(this.c + 7, this.d + 2, this.c + 7, this.d + 2);
   }

   private void Js(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 1;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 29;
      }

      g.drawLine(this.c + 1, this.d + 1, this.c + 1, this.d + 1);
      g.drawLine(this.c + 2, this.d + 2, this.c + 4, this.d + 2);
      g.drawLine(this.c + 5, this.d + 3, this.c + 7, this.d + 3);
      g.drawLine(this.c + 7, this.d + 2, this.c + 7, this.d + 2);
   }

   private void ds(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 3);
      g.drawLine(this.c + 1, this.d - 4, this.c + 4, this.d - 4);
      g.drawLine(this.c + 5, this.d, this.c + 5, this.d - 3);
      g.drawLine(this.c + 1, this.d, this.c + 1, this.d);
      g.drawLine(this.c + 1, this.d - 2, this.c + 2, this.d - 1);
   }

   private void fs(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 5;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d - 2, this.c + 1, this.d - 2);
      g.drawLine(this.c, this.d - 3, this.c + 4, this.d - 3);
      g.drawLine(this.c + 5, this.d - 1, this.c + 7, this.d - 1);
   }

   private void Ds(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d - 1, this.c + 3, this.d - 4);
      g.drawLine(this.c, this.d - 3, this.c + 1, this.d - 4);
      g.drawLine(this.c + 1, this.d, this.c + 5, this.d);
      g.drawLine(this.c + 5, this.d, this.c + 5, this.d - 3);
      g.drawLine(this.c + 1, this.d, this.c + 5, this.d);
      g.drawLine(this.c + 4, this.d - 4, this.c + 4, this.d - 4);
      g.drawLine(this.c + 2, this.d - 2, this.c + 3, this.d - 2);
      g.drawLine(this.c + 5, this.d + 1, this.c + 5, this.d + 1);
   }

   private void Ns(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 3);
      g.drawLine(this.c + 1, this.d, this.c + 1, this.d);
      g.drawLine(this.c + 1, this.d - 2, this.c + 1, this.d - 2);
      g.drawLine(this.c + 2, this.d - 1, this.c + 2, this.d - 1);
      g.drawLine(this.c + 1, this.d - 4, this.c + 3, this.d - 4);
      g.drawLine(this.c + 4, this.d, this.c + 4, this.d - 3);
      g.drawLine(this.c + 4, this.d, this.c + 6, this.d - 2);
      g.drawLine(this.c + 6, this.d - 2, this.c + 8, this.d);
      g.drawLine(this.c + 8, this.d, this.c + 8, this.d - 3);
      g.drawLine(this.c + 9, this.d - 4, this.c + 11, this.d - 4);
      g.drawLine(this.c + 12, this.d, this.c + 12, this.d - 3);
   }

   private void ts(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 3);
      g.drawLine(this.c + 1, this.d - 4, this.c + 4, this.d - 4);
      g.drawLine(this.c + 5, this.d, this.c + 5, this.d - 3);
      g.drawLine(this.c + 1, this.d, this.c + 1, this.d);
      g.drawLine(this.c + 1, this.d - 2, this.c + 2, this.d - 1);
   }

   private void Ts(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d - 1, this.c, this.d - 2);
      g.drawLine(this.c, this.d - 1, this.c, this.d - 2);
      g.drawLine(this.c + 1, this.d - 2, this.c + 3, this.d - 2);
      g.drawLine(this.c + 3, this.d - 3, this.c + 4, this.d - 3);
      g.drawLine(this.c + 5, this.d - 4, this.c + 6, this.d - 4);
      g.drawLine(this.c + 6, this.d + 1, this.c + 6, this.d - 2);
      g.drawLine(this.c + 5, this.d - 1, this.c + 5, this.d - 2);
      g.drawLine(this.c + 4, this.d - 1, this.c + 4, this.d - 1);
      g.drawLine(this.c + 6, this.d, this.c + 6, this.d - 2);
      g.drawLine(this.c + 1, this.d, this.c + 3, this.d);
   }

   private void Zs(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d - 1, this.c + 1, this.d);
      g.drawLine(this.c + 2, this.d, this.c + 3, this.d - 1);
      g.drawLine(this.c, this.d - 2, this.c + 3, this.d - 2);
      g.drawLine(this.c + 4, this.d - 3, this.c + 5, this.d - 3);
      g.drawLine(this.c + 5, this.d - 1, this.c + 5, this.d - 4);
      g.drawLine(this.c, this.d - 2, this.c + 3, this.d - 2);
      g.drawLine(this.c + 4, this.d, this.c + 5, this.d - 1);
      g.drawLine(this.c + 5, this.d, this.c + 5, this.d);
   }

   private void ns(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d - 1, this.c, this.d - 2);
      g.drawLine(this.c + 1, this.d - 3, this.c + 7, this.d - 3);
      g.drawLine(this.c + 6, this.d, this.c + 6, this.d - 4);
      g.drawLine(this.c + 7, this.d, this.c + 7, this.d - 1);
      g.drawLine(this.c + 1, this.d, this.c + 4, this.d);
      g.drawLine(this.c + 5, this.d - 1, this.c + 5, this.d - 1);
   }

   private void ps(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 3);
      g.drawLine(this.c + 1, this.d, this.c + 2, this.d - 1);
      g.drawLine(this.c + 3, this.d - 1, this.c + 4, this.d);
      g.drawLine(this.c + 5, this.d, this.c + 5, this.d - 4);
      g.drawLine(this.c + 4, this.d - 3, this.c + 4, this.d - 4);
   }

   private void ms(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d - 3, this.c + 2, this.d - 3);
      g.drawLine(this.c + 2, this.d - 2, this.c + 3, this.d - 2);
      g.drawLine(this.c + 3, this.d - 1, this.c + 4, this.d - 1);
      g.drawLine(this.c + 5, this.d - 2, this.c + 5, this.d - 2);
      g.drawLine(this.c + 6, this.d, this.c + 6, this.d - 3);
      g.drawLine(this.c + 7, this.d, this.c + 7, this.d - 2);
   }

   private void ls(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 2);
      g.drawLine(this.c + 1, this.d, this.c + 1, this.d);
      g.drawLine(this.c + 1, this.d - 3, this.c + 1, this.d - 3);
      g.drawLine(this.c + 2, this.d - 1, this.c + 2, this.d - 3);
      g.drawLine(this.c + 3, this.d - 1, this.c + 5, this.d - 3);
   }

   private void vs(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d - 1, this.c, this.d - 2);
      g.drawLine(this.c + 1, this.d, this.c + 4, this.d);
      g.drawLine(this.c, this.d - 2, this.c + 3, this.d - 2);
      g.drawLine(this.c + 4, this.d - 3, this.c + 5, this.d - 3);
      g.drawLine(this.c + 6, this.d - 2, this.c + 6, this.d - 4);
      g.drawLine(this.c + 5, this.d - 1, this.c + 5, this.d - 1);
   }

   private void hs(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 4);
      g.drawLine(this.c, this.d, this.c + 2, this.d);
      g.drawLine(this.c + 3, this.d, this.c + 3, this.d - 4);
      g.drawLine(this.c + 3, this.d - 4, this.c + 5, this.d - 4);
      g.drawLine(this.c + 5, this.d, this.c + 5, this.d - 4);
   }

   private void gh(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 4);
      g.drawLine(this.c + 4, this.d, this.c + 4, this.d - 4);
      g.drawLine(this.c, this.d - 2, this.c + 4, this.d - 2);
   }

   private void B1(Graphics g) {
      this.c = this.x - 9;
      this.d = this.y + 6;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 24;
      }

      g.drawLine(this.c, this.d, this.c, this.d - 1);
      g.drawLine(this.c + 1, this.d, this.c + 1, this.d - 3);
      g.drawLine(this.c + 2, this.d - 4, this.c + 5, this.d - 4);
      g.drawLine(this.c + 6, this.d, this.c + 6, this.d - 3);
   }

   private void u(Graphics g) {
      this.c = this.x - 10;
      this.d = this.y;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 30;
      }

      g.drawLine(this.c + 3, this.d + 2, this.c + 3, this.d + 5);
   }

   private void u1(Graphics g) {
      this.c = this.x - 10;
      this.d = this.y;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 29;
      }

      g.drawLine(this.c + 3, this.d + 8, this.c + 3, this.d + 10);
   }

   private void U(Graphics g) {
      this.c = this.x - 10;
      this.d = this.y;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 30;
      }

      g.drawLine(this.c + 3, this.d + 2, this.c + 3, this.d + 4);
      g.drawLine(this.c + 5, this.d + 2, this.c + 5, this.d + 4);
      g.drawLine(this.c + 4, this.d + 5, this.c + 4, this.d + 5);
   }

   private void U1(Graphics g) {
      this.c = this.x - 10;
      this.d = this.y;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 29;
      }

      g.drawLine(this.c + 3, this.d + 7, this.c + 3, this.d + 9);
      g.drawLine(this.c + 5, this.d + 7, this.c + 5, this.d + 9);
      g.drawLine(this.c + 4, this.d + 10, this.c + 4, this.d + 10);
   }

   private void Y(Graphics g) {
      this.c = this.x - 10;
      this.d = this.y;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 30;
      }

      g.drawLine(this.c + 3, this.d + 3, this.c + 3, this.d + 7);
      g.drawLine(this.c + 7, this.d + 3, this.c + 7, this.d + 7);
      g.drawLine(this.c + 4, this.d + 7, this.c + 4, this.d + 7);
      g.drawLine(this.c + 6, this.d + 7, this.c + 6, this.d + 7);
      g.drawLine(this.c + 5, this.d + 6, this.c + 5, this.d + 6);
   }

   private void Y1(Graphics g) {
      this.c = this.x - 10;
      this.d = this.y + 1;
      if(this.x == 5) {
         this.c = this.Pwidth - 5;
         this.d = this.y - 29;
      }

      g.drawLine(this.c + 3, this.d + 7, this.c + 3, this.d + 10);
      g.drawLine(this.c + 7, this.d + 7, this.c + 7, this.d + 10);
      g.drawLine(this.c + 4, this.d + 10, this.c + 4, this.d + 10);
      g.drawLine(this.c + 6, this.d + 10, this.c + 6, this.d + 10);
      g.drawLine(this.c + 5, this.d + 9, this.c + 5, this.d + 9);
   }

   private void TB1(Graphics g) {
      this.a = this.x - 7;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 5;
         this.b = this.y - 42;
      }

      g.drawLine(this.a + 2, this.b, this.a + 2, this.b - 3);
   }

   private void TB2(Graphics g) {
      this.a = this.x - 7;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 5;
         this.b = this.y - 42;
      }

      g.drawLine(this.a + 2, this.b, this.a + 2, this.b - 3);
      g.drawLine(this.a + 4, this.b, this.a + 4, this.b - 3);
   }

   private void Ti(Graphics g) {
      this.a = this.x - 7;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 5;
         this.b = this.y - 42;
      }

      g.drawLine(this.a, this.b, this.a + 6, this.b);
      g.drawLine(this.a, this.b - 1, this.a, this.b - 1);
      g.drawLine(this.a + 1, this.b - 2, this.a + 4, this.b - 2);
      g.drawLine(this.a + 5, this.b - 1, this.a + 5, this.b - 1);
   }

   private void TI(Graphics g) {
      this.a = this.x - 7;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 5;
         this.b = this.y - 42;
      }

      g.drawLine(this.a, this.b, this.a + 6, this.b);
      g.drawLine(this.a, this.b - 1, this.a, this.b - 1);
      g.drawLine(this.a + 1, this.b - 2, this.a + 4, this.b - 2);
      g.drawLine(this.a + 5, this.b - 1, this.a + 5, this.b - 1);
      g.drawLine(this.a + 6, this.b - 1, this.a + 6, this.b - 4);
   }

   private void Tw(Graphics g) {
      this.a = this.x - 7;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 5;
         this.b = this.y - 42;
      }

      g.drawLine(this.a, this.b, this.a + 6, this.b);
      g.drawLine(this.a, this.b - 1, this.a, this.b - 1);
      g.drawLine(this.a + 1, this.b - 2, this.a + 4, this.b - 2);
      g.drawLine(this.a + 5, this.b - 1, this.a + 5, this.b - 1);
      g.drawLine(this.a + 6, this.b - 1, this.a + 6, this.b - 3);
      g.drawLine(this.a + 4, this.b - 2, this.a + 4, this.b - 3);
      g.drawLine(this.a + 5, this.b - 3, this.a + 5, this.b - 3);
   }

   private void TW(Graphics g) {
      this.a = this.x - 7;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 5;
         this.b = this.y - 42;
      }

      g.drawLine(this.a, this.b, this.a + 6, this.b);
      g.drawLine(this.a, this.b - 1, this.a, this.b - 1);
      g.drawLine(this.a + 1, this.b - 2, this.a + 4, this.b - 2);
      g.drawLine(this.a + 5, this.b - 1, this.a + 5, this.b - 1);
      g.drawLine(this.a + 6, this.b - 1, this.a + 6, this.b - 4);
      g.drawLine(this.a + 4, this.b - 2, this.a + 4, this.b - 5);
   }

   private void TM(Graphics g) {
      this.a = this.x - 7;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 3;
         this.b = this.y - 42;
      }

      g.drawLine(this.a, this.b - 1, this.a, this.b - 3);
      g.drawLine(this.a + 1, this.b - 4, this.a + 2, this.b - 4);
      g.drawLine(this.a + 1, this.b, this.a + 2, this.b);
      g.drawLine(this.a + 3, this.b - 1, this.a + 3, this.b - 3);
   }

   private void Tm(Graphics g) {
      this.a = this.x - 7;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 5;
         this.b = this.y - 42;
      }

      g.drawLine(this.a, this.b - 1, this.a, this.b - 3);
      g.drawLine(this.a + 1, this.b - 4, this.a + 2, this.b - 4);
      g.drawLine(this.a + 1, this.b, this.a + 2, this.b);
      g.drawLine(this.a + 3, this.b - 1, this.a + 3, this.b - 3);
   }

   private void TSGA(Graphics g) {
      this.a = this.x - 7;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 5;
         this.b = this.y - 42;
      }

      g.drawLine(this.a, this.b, this.a + 3, this.b);
      g.drawLine(this.a, this.b - 1, this.a + 1, this.b - 1);
      g.drawLine(this.a + 3, this.b - 1, this.a + 3, this.b - 1);
      g.drawLine(this.a + 4, this.b - 2, this.a + 4, this.b - 4);
      g.drawLine(this.a + 3, this.b - 4, this.a + 3, this.b - 4);
   }

   private void TRBA(Graphics g) {
      this.a = this.x - 7;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 5;
         this.b = this.y - 42;
      }

      g.drawLine(this.a, this.b - 2, this.a, this.b - 3);
      g.drawLine(this.a + 1, this.b - 1, this.a + 1, this.b - 2);
      g.drawLine(this.a + 1, this.b - 4, this.a + 3, this.b - 4);
      g.drawLine(this.a + 1, this.b - 2, this.a + 3, this.b - 2);
      g.drawLine(this.a + 3, this.b, this.a + 3, this.b - 3);
      g.drawLine(this.a + 2, this.b, this.a + 2, this.b);
      g.drawLine(this.a + 4, this.b - 3, this.a + 4, this.b - 3);
      g.drawLine(this.a + 5, this.b - 2, this.a + 6, this.b - 2);
      g.drawLine(this.a + 7, this.b - 3, this.a + 7, this.b - 3);
   }

   private void TSUB(Graphics g) {
      this.a = this.x - 9;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 5;
         this.b = this.y - 42;
      }

      g.drawLine(this.a, this.b, this.a, this.b);
      g.drawLine(this.a + 1, this.b - 1, this.a + 2, this.b - 1);
      g.drawLine(this.a + 3, this.b, this.a + 7, this.b);
      g.drawLine(this.a + 5, this.b - 1, this.a + 5, this.b - 1);
   }

   private void TN8(Graphics g) {
      this.a = this.x - 9;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 5;
         this.b = this.y - 42;
      }

      g.drawLine(this.a, this.b - 1, this.a, this.b - 2);
      g.drawLine(this.a + 1, this.b, this.a + 1, this.b - 1);
      g.drawLine(this.a + 1, this.b - 3, this.a + 4, this.b - 3);
      g.drawLine(this.a + 2, this.b - 2, this.a + 2, this.b - 2);
      g.drawLine(this.a + 3, this.b, this.a + 3, this.b - 1);
      g.drawLine(this.a + 4, this.b, this.a + 4, this.b);
      g.drawLine(this.a + 5, this.b - 1, this.a + 5, this.b - 2);
      g.drawLine(this.a + 5, this.b - 4, this.a + 5, this.b - 4);
      g.drawLine(this.a + 6, this.b - 5, this.a + 6, this.b - 6);
   }

   private void TI8(Graphics g) {
      this.a = this.x - 9;
      this.b = this.y - 13;
      if(this.x == 5) {
         this.a = this.Pwidth - 5;
         this.b = this.y - 42;
      }

      g.drawLine(this.a, this.b, this.a + 6, this.b);
      g.drawLine(this.a, this.b - 1, this.a, this.b - 1);
      g.drawLine(this.a + 1, this.b - 2, this.a + 4, this.b - 2);
      g.drawLine(this.a + 5, this.b - 1, this.a + 5, this.b - 1);
      g.drawLine(this.a + 6, this.b - 1, this.a + 6, this.b - 3);
      g.drawLine(this.a + 4, this.b - 2, this.a + 4, this.b - 3);
      g.drawLine(this.a + 5, this.b - 3, this.a + 5, this.b - 3);
      g.drawLine(this.a + 6, this.b - 4, this.a + 6, this.b - 4);
      g.drawLine(this.a + 7, this.b - 5, this.a + 8, this.b - 5);
   }

   private void ENG01(Graphics g) {
      this.h = this.x;
      this.i = this.y;
      g.drawLine(this.h, this.i, this.h + 2, this.i);
      g.drawLine(this.h + 1, this.i, this.h + 1, this.i - 4);
      g.drawLine(this.h + 2, this.i - 5, this.h + 2, this.i - 9);
      g.drawLine(this.h + 3, this.i - 10, this.h + 3, this.i - 11);
      g.drawLine(this.h + 4, this.i - 11, this.h + 4, this.i - 11);
   }

   private void ENG02(Graphics g) {
      this.h = this.x;
      this.i = this.y - 3;
      g.drawLine(this.h, this.i, this.h, this.i - 1);
      g.drawLine(this.h, this.i - 5, this.h, this.i - 5);
      g.drawLine(this.h + 1, this.i - 2, this.h + 1, this.i - 5);
      g.drawLine(this.h + 2, this.i - 4, this.h + 2, this.i - 4);
      g.drawLine(this.h + 3, this.i - 5, this.h + 5, this.i - 5);
      g.drawLine(this.h + 5, this.i - 2, this.h + 5, this.i - 5);
      g.drawLine(this.h + 4, this.i - 1, this.h + 4, this.i - 1);
      g.drawLine(this.h + 4, this.i, this.h + 6, this.i);
   }

   private void ENG03(Graphics g) {
      this.h = this.x;
      this.i = this.y - 3;
      g.drawLine(this.h, this.i, this.h, this.i - 1);
      g.drawLine(this.h, this.i, this.h + 2, this.i);
      g.drawLine(this.h, this.i - 5, this.h, this.i - 5);
      g.drawLine(this.h + 1, this.i - 2, this.h + 1, this.i - 5);
      g.drawLine(this.h + 2, this.i - 8, this.h + 2, this.i - 8);
   }

   private void ENG04(Graphics g) {
      this.h = this.x;
      this.i = this.y - 3;
      g.drawLine(this.h, this.i, this.h, this.i - 1);
      g.drawLine(this.h, this.i, this.h + 2, this.i);
      g.drawLine(this.h, this.i - 5, this.h + 3, this.i - 5);
      g.drawLine(this.h + 1, this.i - 2, this.h + 1, this.i - 5);
      g.drawLine(this.h + 2, this.i - 8, this.h + 2, this.i - 8);
      g.drawLine(this.h + 2, this.i - 5, this.h + 2, this.i - 7);
   }

   private void ENG05(Graphics g) {
      this.h = this.x;
      this.i = this.y - 3;
      g.drawLine(this.h, this.i - 1, this.h, this.i - 3);
      g.drawLine(this.h + 1, this.i, this.h + 3, this.i);
      g.drawLine(this.h + 1, this.i - 4, this.h + 1, this.i - 4);
      g.drawLine(this.h + 2, this.i - 5, this.h + 4, this.i - 5);
      g.drawLine(this.h + 4, this.i - 1, this.h + 4, this.i - 1);
      g.drawLine(this.h + 5, this.i - 1, this.h + 5, this.i - 4);
      g.drawLine(this.h + 6, this.i - 4, this.h + 6, this.i - 5);
      g.drawLine(this.h + 6, this.i, this.h + 6, this.i);
   }

   private void ENG06(Graphics g) {
      this.h = this.x;
      this.i = this.y - 3;
      g.drawLine(this.h, this.i - 1, this.h, this.i - 3);
      g.drawLine(this.h + 1, this.i, this.h + 3, this.i);
      g.drawLine(this.h + 1, this.i - 4, this.h + 1, this.i - 4);
      g.drawLine(this.h + 2, this.i - 5, this.h + 4, this.i - 5);
      g.drawLine(this.h + 4, this.i - 1, this.h + 4, this.i - 1);
      g.drawLine(this.h + 5, this.i - 1, this.h + 5, this.i - 4);
      g.drawLine(this.h + 6, this.i - 4, this.h + 6, this.i - 8);
      g.drawLine(this.h + 6, this.i, this.h + 6, this.i);
      g.drawLine(this.h + 5, this.i - 7, this.h + 5, this.i - 7);
      g.drawLine(this.h + 7, this.i - 8, this.h + 7, this.i - 8);
   }

   private void ENG07(Graphics g) {
      this.h = this.x;
      this.i = this.y;
      g.drawLine(this.h, this.i, this.h + 2, this.i);
      g.drawLine(this.h + 4, this.i - 1, this.h + 4, this.i - 4);
      g.drawLine(this.h + 5, this.i - 5, this.h + 5, this.i - 8);
      g.drawLine(this.h + 4, this.i - 8, this.h + 4, this.i - 8);
      g.drawLine(this.h + 4, this.i - 8, this.h + 4, this.i - 8);
      g.drawLine(this.h + 5, this.i - 11, this.h + 5, this.i - 11);
   }

   private void ENG08(Graphics g) {
      this.h = this.x;
      this.i = this.y - 3;
      g.drawLine(this.h, this.i, this.h, this.i - 1);
      g.drawLine(this.h, this.i - 4, this.h, this.i - 4);
      g.drawLine(this.h, this.i, this.h + 2, this.i);
      g.drawLine(this.h + 3, this.i - 1, this.h + 5, this.i - 3);
      g.drawLine(this.h + 1, this.i - 2, this.h + 1, this.i - 5);
      g.drawLine(this.h + 2, this.i - 5, this.h + 2, this.i - 5);
      g.drawLine(this.h + 5, this.i - 4, this.h + 5, this.i - 5);
   }

   private void ENG09(Graphics g) {
      this.h = this.x;
      this.i = this.y;
      g.drawLine(this.h, this.i, this.h + 3, this.i);
      g.drawLine(this.h + 2, this.i, this.h + 2, this.i - 4);
      g.drawLine(this.h + 2, this.i, this.h + 2, this.i - 4);
      g.drawLine(this.h + 2, this.i - 8, this.h + 2, this.i - 8);
      g.drawLine(this.h + 3, this.i - 5, this.h + 3, this.i - 8);
      g.drawLine(this.h + 3, this.i - 3, this.h + 6, this.i - 3);
      g.drawLine(this.h + 7, this.i - 4, this.h + 7, this.i - 4);
      g.drawLine(this.h + 8, this.i - 5, this.h + 8, this.i - 7);
      g.drawLine(this.h + 5, this.i - 8, this.h + 7, this.i - 8);
      g.drawLine(this.h + 4, this.i - 7, this.h + 4, this.i - 7);
   }

   private void ENG10(Graphics g) {
      this.h = this.x;
      this.i = this.y - 3;
      g.drawLine(this.h, this.i, this.h, this.i - 1);
      g.drawLine(this.h, this.i - 5, this.h, this.i - 5);
      g.drawLine(this.h + 1, this.i - 2, this.h + 1, this.i - 5);
      g.drawLine(this.h + 2, this.i - 4, this.h + 2, this.i - 4);
      g.drawLine(this.h + 3, this.i - 5, this.h + 4, this.i - 5);
   }

   private void ENG11(Graphics g) {
      this.h = this.x;
      this.i = this.y - 3;
      g.drawLine(this.h, this.i - 1, this.h, this.i - 3);
      g.drawLine(this.h + 1, this.i, this.h + 3, this.i);
      g.drawLine(this.h + 4, this.i - 1, this.h + 4, this.i - 1);
      g.drawLine(this.h + 1, this.i - 4, this.h + 1, this.i - 4);
      g.drawLine(this.h + 2, this.i - 5, this.h + 5, this.i - 5);
      g.drawLine(this.h + 5, this.i - 4, this.h + 5, this.i - 4);
      g.drawLine(this.h, this.i - 3, this.h + 5, this.i - 3);
   }

   private void ENG12(Graphics g) {
      this.h = this.x;
      this.i = this.y - 3;
      g.drawLine(this.h, this.i - 1, this.h, this.i - 3);
      g.drawLine(this.h + 1, this.i, this.h + 3, this.i);
      g.drawLine(this.h + 4, this.i - 1, this.h + 4, this.i - 1);
      g.drawLine(this.h + 1, this.i - 4, this.h + 1, this.i - 4);
      g.drawLine(this.h + 2, this.i - 5, this.h + 5, this.i - 5);
      g.drawLine(this.h + 5, this.i - 4, this.h + 5, this.i - 4);
   }

   private void ENG13(Graphics g) {
      this.h = this.x;
      this.i = this.y - 3;
      g.drawLine(this.h, this.i - 1, this.h, this.i - 3);
      g.drawLine(this.h + 1, this.i, this.h + 3, this.i);
      g.drawLine(this.h + 4, this.i - 1, this.h + 4, this.i - 1);
      g.drawLine(this.h + 1, this.i - 4, this.h + 1, this.i - 4);
      g.drawLine(this.h + 2, this.i - 5, this.h + 5, this.i - 5);
      g.drawLine(this.h + 6, this.i - 4, this.h + 6, this.i - 2);
      g.drawLine(this.h + 5, this.i - 1, this.h + 5, this.i - 1);
   }

   private void ENG14(Graphics g) {
      this.h = this.x;
      this.i = this.y;
      g.drawLine(this.h, this.i, this.h, this.i);
      g.drawLine(this.h + 1, this.i, this.h + 1, this.i - 1);
      g.drawLine(this.h + 2, this.i - 2, this.h + 2, this.i - 6);
      g.drawLine(this.h + 3, this.i - 7, this.h + 3, this.i - 10);
      g.drawLine(this.h + 2, this.i - 10, this.h + 4, this.i - 10);
   }

   protected void paint(Graphics g) {
      int width = this.getWidth();
      int height = this.getHeight();
      this.Pwidth = width - 8;
      this.Pheight = height;
      g.setColor(255, 255, 255);
      g.fillRect(0, 0, width, height);
      g.drawLine(this.x, this.y - 1, this.x, this.y - 3);
      g.drawLine(this.x + 1, this.y - 1, this.x + 1, this.y - 3);
      g.drawLine(this.x, this.y - 7, this.x, this.y - 10);
      g.drawLine(this.x + 1, this.y - 7, this.x + 1, this.y - 10);
      this.x = 5;
      this.y = 5 + this.arow;
      g.setColor(16711935);
      g.drawString(this.strWord, this.x + 5, this.y, 20);
      g.setColor(7893);
      this.y += 30;

      for(int i = 0; i < this.strContent.length(); ++i) {
         if(this.x > this.Pwidth) {
            this.x = 5;
            this.y += 30;
         }

         switch(this.strContent.charAt(i)) {
         case 32:
            this.sp(g);
            break;
         case 35:
            this.Fb(g);
            break;
         case 38:
            this.TSGA(g);
            break;
         case 40:
            this.TRBA(g);
            break;
         case 41:
            if(this.strContent.charAt(i - 2) != 40) {
               this.TSUB(g);
            }
            break;
         case 44:
            this.ks(g);
            break;
         case 48:
            this.TB1(g);
            break;
         case 50:
            g.setColor('\ucc00');
            this.ENG01(g);
            this.x += 4;
            this.ENG02(g);
            this.x += 5;
            this.ENG14(g);
            this.x += 6;
            g.setColor(7893);
            break;
         case 51:
            g.setColor(16711680);
            this.ENG01(g);
            this.x += 4;
            this.ENG03(g);
            this.x += 4;
            this.ENG08(g);
            this.x += 5;
            this.ENG14(g);
            this.x += 5;
            g.setColor(7893);
            break;
         case 52:
            g.setColor(16711935);
            this.ENG01(g);
            this.x += 4;
            this.ENG04(g);
            this.x += 4;
            this.ENG08(g);
            this.x += 5;
            this.ENG14(g);
            this.x += 5;
            g.setColor(7893);
            break;
         case 53:
            g.setColor(0);
            this.ENG01(g);
            this.x += 4;
            this.ENG05(g);
            this.x += 8;
            this.ENG06(g);
            this.x += 4;
            this.ENG07(g);
            this.x += 5;
            this.ENG14(g);
            this.x += 5;
            g.setColor(7893);
            break;
         case 54:
            g.setColor(16711935);
            this.ENG01(g);
            this.x += 4;
            this.ENG05(g);
            this.x += 8;
            this.ENG06(g);
            this.x += 7;
            this.ENG08(g);
            this.x += 6;
            this.ENG14(g);
            this.x += 5;
            g.setColor(7893);
            break;
         case 55:
            g.setColor(0);
            this.ENG01(g);
            this.x += 4;
            this.ENG09(g);
            this.x += 10;
            this.ENG10(g);
            this.x += 4;
            this.ENG11(g);
            this.x += 5;
            this.ENG14(g);
            this.x += 5;
            g.setColor(7893);
            break;
         case 56:
            g.setColor(16711935);
            this.ENG01(g);
            this.x += 4;
            this.ENG12(g);
            this.x += 7;
            this.ENG13(g);
            this.x += 8;
            this.ENG02(g);
            this.x += 5;
            this.ENG14(g);
            this.x += 5;
            g.setColor(7893);
            break;
         case 57:
            g.setColor(0);
            this.ENG01(g);
            this.x += 4;
            this.ENG09(g);
            this.x += 10;
            this.ENG02(g);
            this.x += 5;
            this.ENG14(g);
            this.x += 5;
            g.setColor(7893);
            break;
         case 58:
            this.BA(g);
            break;
         case 59:
            this.m3(g);
            break;
         case 60:
            this.Ks(g);
            break;
         case 61:
            this.Js(g);
            break;
         case 63:
            this.TM(g);
            break;
         case 65:
            this.A(g);
            break;
         case 66:
            this.B(g);
            break;
         case 67:
            this.C(g);
            break;
         case 68:
            this.D(g);
            break;
         case 69:
            this.E(g);
            break;
         case 70:
            this.F(g);
            break;
         case 71:
            this.G(g);
            break;
         case 72:
            this.H(g);
            break;
         case 73:
            this.TI(g);
            break;
         case 74:
            this.B(g);
            this.a(g);
            break;
         case 75:
            this.K(g);
            break;
         case 76:
            this.L(g);
            break;
         case 77:
            this.TM(g);
            break;
         case 78:
            this.N(g);
            break;
         case 79:
            this.FO(g);
            break;
         case 80:
            this.P(g);
            break;
         case 81:
            this.Q(g);
            break;
         case 82:
            this.rs(g);
            break;
         case 83:
            this.ss(g);
            break;
         case 84:
            this.T(g);
            break;
         case 85:
            this.U(g);
            break;
         case 86:
            this.vs(g);
            break;
         case 87:
            this.TW(g);
            break;
         case 88:
            this.X(g);
            break;
         case 89:
            this.Y(g);
            break;
         case 90:
            this.Z(g);
            break;
         case 91:
            this.m1(g);
            break;
         case 93:
            this.m2(g);
            break;
         case 97:
            if(this.strContent.charAt(i - 1) != 40 || this.strContent.charAt(i + 1) != 41) {
               this.a(g);
            }
            break;
         case 98:
            this.b(g);
            break;
         case 99:
            if(this.strContent.charAt(i - 1) != 40 || this.strContent.charAt(i + 1) != 41) {
               this.c(g);
            }
            break;
         case 100:
            if(this.strContent.charAt(i - 1) != 40 || this.strContent.charAt(i + 1) != 41) {
               this.d(g);
            }
            break;
         case 101:
            this.e(g);
            break;
         case 102:
            this.f(g);
            break;
         case 103:
            this.g(g);
            break;
         case 104:
            this.h(g);
            break;
         case 105:
            if(this.strContent.charAt(i - 1) != 40 || this.strContent.charAt(i + 1) != 41) {
               this.Ti(g);
            }
            break;
         case 106:
            this.j(g);
            break;
         case 107:
            this.k(g);
            break;
         case 108:
            this.l(g);
            break;
         case 109:
            this.m(g);
            break;
         case 110:
            if(this.strContent.charAt(i - 1) != 40 || this.strContent.charAt(i + 1) != 41) {
               this.n(g);
            }
            break;
         case 111:
            this.FU(g);
            break;
         case 112:
            if(this.strContent.charAt(i - 1) != 40 || this.strContent.charAt(i + 1) != 41) {
               this.p(g);
            }
            break;
         case 113:
            this.q(g);
            break;
         case 114:
            if(this.strContent.charAt(i - 1) != 40 || this.strContent.charAt(i + 1) != 41) {
               this.r(g);
            }
            break;
         case 115:
            this.s(g);
            break;
         case 116:
            if(this.strContent.charAt(i - 1) != 40 || this.strContent.charAt(i + 1) != 41) {
               this.t(g);
            }
            break;
         case 117:
            this.u(g);
            break;
         case 118:
            this.v(g);
            break;
         case 119:
            this.Tw(g);
            break;
         case 120:
            this.x(g);
            break;
         case 121:
            this.y(g);
            break;
         case 122:
            this.z(g);
            break;
         case 124:
            this.bs(g);
            break;
         case 162:
            this.Cs(g);
            break;
         case 165:
            this.TI8(g);
            break;
         case 168:
            this.TB2(g);
            break;
         case 169:
            this.cs(g);
            break;
         case 170:
            this.ks(g);
            break;
         case 172:
            this.Bs(g);
            break;
         case 173:
            this.Ks(g);
            break;
         case 174:
            this.rs(g);
            break;
         case 180:
            this.TB1(g);
            break;
         case 181:
            this.ms(g);
            break;
         case 184:
            this.gs(g);
            break;
         case 190:
            this.TN8(g);
            break;
         case 192:
            this.TN8(g);
            break;
         case 193:
            this.gh(g);
            break;
         case 195:
            this.js(g);
            break;
         case 196:
            this.Qs(g);
            break;
         case 198:
            this.Zs(g);
            break;
         case 200:
            this.vs(g);
            break;
         case 201:
            this.FE(g);
            break;
         case 202:
            this.bs(g);
            break;
         case 203:
            this.Bs(g);
            break;
         case 207:
            this.Xs(g);
            break;
         case 208:
            this.Ds(g);
            break;
         case 209:
            this.Ns(g);
            break;
         case 211:
            this.Fo(g);
            break;
         case 214:
            this.B1(g);
            break;
         case 216:
            this.hs(g);
            break;
         case 217:
            this.v(g);
            this.TB2(g);
            break;
         case 218:
            this.U1(g);
            break;
         case 220:
            this.Y1(g);
            break;
         case 222:
            this.Ts(g);
            break;
         case 223:
            this.Fb(g);
            break;
         case 225:
            this.gs(g);
            break;
         case 228:
            this.qs(g);
            break;
         case 230:
            this.fs(g);
            break;
         case 233:
            this.é(g);
            break;
         case 240:
            this.ps(g);
            break;
         case 241:
            this.ns(g);
            break;
         case 243:
            this.Fu(g);
            break;
         case 246:
            this.ps(g);
            break;
         case 248:
            this.ls(g);
            break;
         case 250:
            this.u1(g);
            break;
         case 252:
            this.ys(g);
            break;
         case 254:
            this.ds(g);
            break;
         case 8218:
            this.Ns(g);
            break;
         case 8226:
            this.gs(g);
         }
      }

   }
}

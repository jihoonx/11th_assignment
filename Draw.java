import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Draw extends Applet{
	public void paint(Graphics g)
	{		
	int width = getSize().width;
	int height = getSize().height;
	
	int rectWidth =(width-50)/7; // 가로길이 4등분
	int rectHeight=(height-70)/2; // 세로 3등분
	
	int x=5;
	int y=5;
	
	g.drawRect(x,y,rectWidth,rectHeight);  // drawRect 그리기
	g.drawString("drawRect",x,rectHeight+30);
	
	x+=rectWidth+20;
	
	g.fillRect(x,y,rectWidth,rectHeight); // fillRect 그리기
	int border=(int)(rectWidth*0.25);
	
	//fillRect안에 clearRect 그림
	g.clearRect(x+border,y+border,rectWidth-2*border,rectHeight-2*border);
	g.drawString("fillRect/claerRect",x,rectHeight+30);
	
	x+=rectWidth+20;
	
	g.drawRoundRect(x,y,rectWidth,rectHeight,15,15); // clearRoundRect 그리기
	g.drawString("clearRoundRect",x,y+rectHeight+25); 
	
	x+=rectWidth+30;

	
	g.fillRoundRect(x, y, rectWidth, rectHeight, 15, 15); //fillRoundRect 그림
	g.drawString("fillRoundRect", x, y+rectHeight+25);
	
	x+=rectWidth+20;
	g.setColor(Color.black);
	for(int i=0;i<4;i++){
		g.draw3DRect(x+i*2,y+i*2,rectWidth-i*4,rectHeight-i*4,false);
	}

	g.setColor(Color.black);
	g.drawString("Draw3DRect", x, y+rectHeight+25);
	
	x+=rectWidth+20;
	
	g.setColor(Color.black);
	g.fill3DRect(x,y,rectWidth,rectHeight,true); // fillRoundRect 그림
	g.setColor(Color.black);
	g.drawString("fill3DRect",x,y+rectHeight+25); 
	
	y+=rectHeight+40;
	
	g.drawLine(5,y, rectWidth, y+rectHeight-20); // 직선그림
	g.drawString("DrawLine", 5, y+rectHeight);
	
	x+=rectWidth+20;
	
	g.drawOval(x/6, y+40, 80,60);
	g.drawString("DrawOval", 120, y+rectHeight); // 타원 그림
	
	g.fillOval(x/3, y+40, 80, 60);
	g.drawString("FillOval", 250, y+rectHeight); //채워진 타원그림
	
	g.drawArc(340,250, 80, 50, 180, -180);//호
	g.fillArc(340,300,80,50,180,-180);//채워진 호
	g.drawString("DrawArc/fillArc", 340, y+rectHeight);
	
	int[]a={450,500,450,490};
	int[]b={330,300,340,280};
	g.drawPolyline(a, b, 4); 
	g.drawString("DrawPolyline", 450, y+rectHeight); 
	
}
}
	

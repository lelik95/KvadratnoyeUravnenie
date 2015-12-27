package com.cvad;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class KvadratnoeUravnenieServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String var1 = req.getParameter("var1");
		int i1 = Integer.parseInt(var1);
		
		String var2 = req.getParameter("var2");
		int i2 = Integer.parseInt(var2);
		
		String var3 = req.getParameter("var3");
		int i3 = Integer.parseInt(var3);
		//int result;
	//	result = i1+i2+i3;
		
		resp.getWriter().println(calculation(i1, i2, i3));

		
	}
	public static String calculation(int a,int b,int c){
		int d = discriminant(a, b, c);
		System.out.println(d);
		double x1,x2;
		String resh = "korney net!";
		if (d>0){
			x1= ((((-1)*b)+Math.sqrt(d))/(2*a) );
			
			//System.out.println(x1);
			x2= ((((-1)*b)-Math.sqrt(d))/(2*a) );
			//System.out.println(x2);
			resh = "X1 = " +Double.toString(x1)+" X2 = " + Double.toString(x2);
		}
		else if(d==0){
			x1= (((-1*b)+Math.sqrt(d))/2*a );
			//System.out.println("Один корень:"+x1);
			resh = "X1 = " +Double.toString(x1);
		}
		return "D= "+d+"  "+ resh;
		
	}
	public static int  discriminant(int a,int b,int c){
		int d = 0;
		d = (b*b)-(4*a*c);
		return d;	 
		
	}
}

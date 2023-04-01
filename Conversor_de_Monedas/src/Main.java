import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		double valorPesoD = 0;
		double valorTemperaturaD = 0;
		double result=0;
		int finalizar;
		boolean terminando=true;
		
		
		 JFrame frame = new JFrame();
	     frame.setAlwaysOnTop(true);
	     
	     while(terminando==true){
	    	 
	    	 Object[] options = {"Conversor de Moneda", "Conversor de Temperatura"};
		     //...and passing `frame` instead of `null` as first parameter
		     Object selectionObject = JOptionPane.showInputDialog(frame, "Elige", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		     
		     try {
		    	 String selectionString = selectionObject.toString();
		    	 //Conversor de Monedas
		    	 if(selectionString == "Conversor de Moneda"){
			    	 String valorPeso = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:");
			    	 valorPesoD = Double.parseDouble(valorPeso);
			    	 
			    	 Object[] options2 = {
				    		   "MXN a USD"
				    	       ,"MXN a EUR"
				    	       ,"MXN a GBP"
				    	       ,"MXN a JPY"
				    	       ,"MXN a KRW"
				    	       ,"USD a MXN"
				    	       ,"EUR a MXN"
				    	       ,"GBP a MXN"
				    	       ,"JPY a MXN"
				    	       ,"KRW a MXN"};
				     
				     Object selecionObject2 = JOptionPane.showInputDialog(frame, "Elige", "Menu", JOptionPane.PLAIN_MESSAGE, null, options2, options2[0]);
				     String selectionString2 = selecionObject2.toString();
				     
				     Moneda monedaMXN = new Moneda("Peso Mexicano");
				     Moneda monedaUSD = new Moneda("Dolar", 0.055);
				     Moneda monedaEUR = new Moneda("Euro", 0.051);
				     Moneda monedaGBP = new Moneda("Libra Esterlina", 0.045);
				     Moneda monedaJPY = new Moneda("Yen Japones", 7.00);
				     Moneda monedaKRW = new Moneda("Won Sul-Coreano", 72.00);
				     
				     
				     if(selectionString2 == "MXN a USD") {
				    	 monedaMXN.setValorMoneda(valorPesoD);
				    	 double mxn = monedaMXN.getValorMoneda();
				    	 double usd = monedaUSD.getValorMoneda2();
				    	 result = mxn*usd;
				    	 JOptionPane.showMessageDialog(frame, "$ "+valorPesoD+" MXN"+" son $ "+df.format(result)+" USD");
				     }
				     if(selectionString2 == "MXN a EUR") {
				    	 monedaMXN.setValorMoneda(valorPesoD);
				    	 double mxn = monedaMXN.getValorMoneda();
				    	 double eur = monedaEUR.getValorMoneda2();
				    	 result = mxn*eur;
				    	 JOptionPane.showMessageDialog(frame, "$ "+valorPesoD+" MXN"+" son $ "+df.format(result)+" EUR");
				     }
				     if(selectionString2 == "MXN a GBP") {
				    	 monedaMXN.setValorMoneda(valorPesoD);
				    	 double mxn = monedaMXN.getValorMoneda();
				    	 double gbp = monedaGBP.getValorMoneda2();
				    	 result = mxn*gbp;
				    	 JOptionPane.showMessageDialog(frame, "$ "+valorPesoD+" MXN"+" son $ "+df.format(result)+" GBP");
				     }
				     if(selectionString2 == "MXN a JPY") {
				    	 monedaMXN.setValorMoneda(valorPesoD);
				    	 double mxn = monedaMXN.getValorMoneda();
				    	 double jpy = monedaJPY.getValorMoneda2();
				    	 result = mxn*jpy;
				    	 JOptionPane.showMessageDialog(frame, "$ "+valorPesoD+" MXN"+" son $ "+df.format(result)+" JPY");
				     }
				     if(selectionString2 == "MXN a KRW") {
				    	 monedaMXN.setValorMoneda(valorPesoD);
				    	 double mxn = monedaMXN.getValorMoneda();
				    	 double krw = monedaKRW.getValorMoneda2();
				    	 result = mxn*krw;
				    	 JOptionPane.showMessageDialog(frame, "$ "+valorPesoD+" MXN"+" son $ "+df.format(result)+" KRW");
				     }
				     //-------------------------------------------------------------------------------------------
				     //-------------------------------------------------------------------------------------------
				     if(selectionString2 == "USD a MXN") {
				    	 monedaMXN.setValorMoneda(valorPesoD);
				    	 double mxn = monedaMXN.getValorMoneda();
				    	 double usd = monedaUSD.getValorMoneda2();
				    	 result = mxn/usd;
				    	 JOptionPane.showMessageDialog(frame, "$ "+valorPesoD+" USD"+" son $ "+df.format(result)+" MXN");
				     }
				     if(selectionString2 == "EUR a MXN") {
				    	 monedaMXN.setValorMoneda(valorPesoD);
				    	 double mxn = monedaMXN.getValorMoneda();
				    	 double eur = monedaEUR.getValorMoneda2();
				    	 result = mxn/eur;
				    	 JOptionPane.showMessageDialog(frame, "$ "+valorPesoD+" EUR"+" son $ "+df.format(result)+" MXN");
				     }
				     if(selectionString2 == "GBP a MXN") {
				    	 monedaMXN.setValorMoneda(valorPesoD);
				    	 double mxn = monedaMXN.getValorMoneda();
				    	 double gbp = monedaGBP.getValorMoneda2();
				    	 result = mxn/gbp;
				    	 JOptionPane.showMessageDialog(frame, "$ "+valorPesoD+" GBP"+" son $ "+df.format(result)+" MXN");
				     }
				     if(selectionString2 == "JPY a MXN") {
				    	 monedaMXN.setValorMoneda(valorPesoD);
				    	 double mxn = monedaMXN.getValorMoneda();
				    	 double jpy = monedaJPY.getValorMoneda2();
				    	 result = mxn/jpy;
				    	 JOptionPane.showMessageDialog(frame, "$ "+valorPesoD+" JPY"+" son $ "+df.format(result)+" MXN");
				     }
				     if(selectionString2 == "KRW a MXN") {
				    	 monedaMXN.setValorMoneda(valorPesoD);
				    	 double mxn = monedaMXN.getValorMoneda();
				    	 double krw = monedaKRW.getValorMoneda2();
				    	 result = mxn/krw;
				    	 JOptionPane.showMessageDialog(frame, "$ "+valorPesoD+" KRW"+" son $ "+result+" MXN");
				     }
			     }
		    	 //Conversor de Temperatura
		    	 if(selectionString == "Conversor de Temperatura") {
		    		 String valorTemperatura = JOptionPane.showInputDialog("Ingresa la temperatura que deseas convertir:");
			    	 valorTemperaturaD = Double.parseDouble(valorTemperatura);
			    	 
			    	 Object[] options3 = {
				    		   "Celcius a Farenheit"
				    	       ,"Celcius a Kelvin"
				    	       ,"Farenheit a Celcius"
				    	       ,"Kelvin a Celcius"
				    	       ,"Kelvin a Farenheit"};
				     
				     Object selecionObject3 = JOptionPane.showInputDialog(frame, "Elige", "Menu", JOptionPane.PLAIN_MESSAGE, null, options3, options3[0]);
				     String selectionString3 = selecionObject3.toString();
				     
				    Temperatura celcius = new Temperatura("Celsius");
				    Temperatura farenheit = new Temperatura("Farenheit");
				    Temperatura kelvin = new Temperatura("Kelvin");
				    
				    
				    if(selectionString3 == "Celcius a Farenheit") {
				    	celcius.setCelcius(valorTemperaturaD);
				    	double cel = celcius.getCelcius();
				        result = cel * 9/5 + 32;
				        JOptionPane.showMessageDialog(frame, cel+" Celcius"+" son "+df.format(result)+" Frenheit");
				    }
				    if(selectionString3 == "Celcius a Kelvin") {
				    	celcius.setCelcius(valorTemperaturaD);
				    	double cel = celcius.getCelcius();
				    	result = cel + 273.15;
				    	JOptionPane.showMessageDialog(frame, cel+" Celcius"+" son "+df.format(result)+" Kelvin");
				    }
				    if(selectionString3 == "Farenheit a Celcius") {
				    	farenheit.setFarenheit(valorTemperaturaD);
				    	double far = farenheit.getFarenheit();
				    	result = ((far - 32) * 5/9);
				    	JOptionPane.showMessageDialog(frame, far+" Farenheit"+" son "+df.format(result)+" Celcius");
				    }
				    if(selectionString3 == "Kelvin a Celcius") {
				    	kelvin.setKelvin(valorTemperaturaD);
				    	double kel = kelvin.getKelvin();
				    	result = kel - 273.15;
				    	JOptionPane.showMessageDialog(frame, kel+" Kelvin"+" son "+df.format(result)+" Celcius");
				    }
				    if(selectionString3 == "Kelvin a Farenheit") {
				    	kelvin.setKelvin(valorTemperaturaD);
				    	double kel = kelvin.getKelvin();
				    	result = kel * 9/5 -459.67;
				    	JOptionPane.showMessageDialog(frame, kel+" Kelvin"+" son "+df.format(result)+" Farenheit");
				    }
		    		 
		    	 }
		    		
		    	//Deseas continuar
		    	 finalizar = JOptionPane.showConfirmDialog(null, "Deseas continuar?", "Cual es tu eleccion chamaco/a", JOptionPane.INFORMATION_MESSAGE);
		    	 System.out.println(finalizar);

		 	        if(finalizar==0){
		 	            terminando = true;
		 	        }
		 	        if(finalizar==1) {
		 	            terminando = false;
		 	            JOptionPane.showConfirmDialog(null, "Programa terminado", "Gooodbye ;)", JOptionPane.DEFAULT_OPTION);
		 	        }
		 	       if(finalizar==2) {
		 	            terminando = false;
		 	            JOptionPane.showConfirmDialog(null, "Programa terminado", "Gooodbye ;)", JOptionPane.DEFAULT_OPTION);
		 	        }
		     }catch(NullPointerException e) {
		    	 JOptionPane.showMessageDialog(frame, "Cancelando operacion");
		    	 terminando=false;
		     }catch(NumberFormatException e) {
		    	 JOptionPane.showMessageDialog(frame, "Ingresa un valor numerico");
		     }
	    	 
	     } 

	     
	     
	     
	     
	     
	     
	}//Main

}

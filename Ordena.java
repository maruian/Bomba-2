
public class Ordena {

	private String txtStr;
	private String txtStrRslt;
	
	public Ordena() {
		txtStr = new String("ihgfedcba");
		txtStrRslt = new String("");
		
	}
	
	private String encriptador(String txt){
		int cVal=0;
		int i = 0;
		int j = 0;
		String txtSol= new String("");
		
		int instancia=0;
		boolean esta=false;
		
		
		while(txt.length()!=0) {
			cVal = txt.charAt(0);
									
			for (i=1;i<txt.length();i++){
				if (cVal>=txt.charAt(i)){
					cVal = txt.charAt(i);	
				}
			}
		
			for (j=0;j<txt.length();j++){
				if (txt.charAt(j)==cVal) { instancia=j;	esta=true; }
			}
							
			if (esta==true) { txt = txt.substring(0, instancia)+txt.substring(instancia+1, txt.length()); }
						
			esta = false; 
				
			if ((char)cVal==' '){ cVal='*'; }
		
			txtSol = txtSol + (char)cVal;
		
		}
		
		return txtSol;
			
	}

	
	
	public static void main(String[] args) {
		Ordena a = new Ordena();
		a.txtStrRslt = a.encriptador(a.txtStr);
		System.out.println(a.txtStrRslt);
	}

}

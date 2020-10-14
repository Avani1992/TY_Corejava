package asd;

public class Starting_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]={"Eric","Adam","Alisha","Andy","Fay","Cristina","Ken","Ship"};
		String str2[]=new String[str.length];
		for(int i=0;i<str.length;i++){
			if(str[i].charAt(0)=='A'){
				str2[i]="True";
			}else{
				str2[i]="False";
			}
		}
		for(int i=0;i<str2.length;i++){
			System.out.println(str2[i]);
		}

	}

}

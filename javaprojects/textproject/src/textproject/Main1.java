package textproject;

public class Main1 {

	public static void main(String[] args) {
	String str = "Ram says \"Hello\" ";
	System.out.println(str);
	
	
	String multiLine = """
			
	Ram says "hello"
			
		<html>                                       \s
	<body>\
		        <h1>Header</h1>\
		    </body>\
		</html>        	
						
			""";
	System.out.println(multiLine);
			
			

	}

}

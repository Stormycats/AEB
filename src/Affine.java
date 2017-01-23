import java.util.Scanner;

public class Affine {

	//To get the freaking word read from the command line.
	//private static String enteredCode;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Variables scanned in from Command Line
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int i = 0;
		int j = 0;
		int k = 0;
		int m = 0;
		int o = 0;
		String enteredCode = "";
		for (i=2; i < args.length; i++){
			enteredCode = enteredCode + args[i] + " ";
		}
		
		//inverse modulo
		
		int n = (a % b);
			n = (a + b) % n;
			
		//Encryption/ Decryption
			
			String ac[] = new String[29];

			ac[0] = " ";
			ac[1] = "A";
			ac[2] = "B";
			ac[3] = "C";
			ac[4] = "D";
			ac[5] = "E";
			ac[6] = "F";
			ac[7] = "G";
			ac[8] = "H";
			ac[9] = "I";
			ac[10] = "J";
			ac[11] = "K";
			ac[12] = "L";
			ac[13] = "M";
			ac[14] = "N";
			ac[15] = "O";
			ac[16] = "P";
			ac[17] = "Q";
			ac[18] = "R";
			ac[19] = "S";
			ac[20] = "T";
			ac[21] = "U";
			ac[22] = "V";
			ac[23] = "W";
			ac[24] = "X";
			ac[25] = "Y";
			ac[26] = "Z";
			ac[27] = ".";
			ac[28] = "!";
			
			
			
		//Parsing the encoded message into individual characters.
		String codeArray[] = new String[enteredCode.length()];
		
		for (i = 0; i < enteredCode.length(); i++){
			codeArray[i] = enteredCode.substring(0,1+j);
			j++;
		}
		for (i = 0; i < codeArray.length; i++){
			for (k = 0; k < ac.length; k++){
				if (ac[k].equals(codeArray[i])){
					m = k;
					/*if k is not 0
					k = (10*k) +b;
					k = k % 29;
					*/
					m = k;
					

				}
			}
		}
		
		
		System.out.println("a   =  " + a);
		System.out.println("b   =  " + b);
		System.out.println("a^-1=  " + n);
		System.out.println("Encrypted Message: " + enteredCode);
		System.out.println("Decrypted Message: " );
		System.out.println(ac[m]);
		scan.close();
	}}

import java.io.*;
class FilePrac {
public static void main(String args[])  throws Exception{
Console c = System.console();

while(true) {
int op = Integer.parseInt(c.readLine("1. Create , 2. Delete , 3. Write , 4. read and 5. Exit "));
if ( op ==1 ) {
	String filename = c.readLine(" enter filename to be created ");
	File f = new File(filename);
	if(f.exists() ) {
		System.out.println(filename + " already exists");
	} else {
		f.createNewFile();
		System.out.println(filename + " created ");
	}
} else if(op == 2) {
	String filename = c.readLine("enter file name to be deleted ");
	File f = new File(filename);
	if ( f.exists() ) {
		f.delete();
		System.out.println(filename + " deleted ");
	} else {
		System.out.println(filename + " does not exists ");
	}
} else if(op == 3 ) {
	String filename = c.readLine(" enter filename to write ");
	File f = new File(filename);
	if(f.exists()) {
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		String data = c.readLine("enter the data ");
		pw.println(data);
		pw.close();
	} else {
		System.out.println(filename + " does not exists ");
	}
} else if ( op == 4) {
	String filename = c.readLine(" enter filename to read ");
	File f = new File(filename);
	if(f.exists()) {
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String data = br.readLine();
		while(data != null) {
			System.out.println(data);
			data = br.readLine();
		}
		br.close();
	} else {
		System.out.println(filename + " does not exists ");
	}


} else if (op == 5 ) {
	break;
} else {
	System.out.println("invalid option ");
}

}	// end of while
}	// end of main
	// end of class
}
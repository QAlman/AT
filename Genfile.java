public class Genfile {
    public static void main(String args[]) {

        try {


            int i = 10;
            for (i = 3; i > 0; i--)


                // try {

                new File ("D:/13", +i+ ".txt").createNewFile();
              //  FileWriter wr = new FileWriter(+i+".txt", true);
               // FileWriter wr = new FileWriter(+i+".txt");
                // String str = new String();
                // str = "I like java EE";
                // wr.append("symbol"+i);
               //  wr.write("qewettyrt");
               //  wr.flush();
               //  wr.close();
            // new File(File.separator + "qwe130.txt").createNewFile();


        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}

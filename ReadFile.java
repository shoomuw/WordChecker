import java.io.*;

class ReadFile{
    String filename;
    String[] word;
    String[][] tango;
    public ReadFile(String name){
        this.filename = name;
    }

    public void run(){
        FileReader file;
        BufferedReader in;
        try{
            file = new FileReader(filename);
            in = new BufferedReader(file);
            String s;
            int i = 0;
            while(in.readLine()!=null){
                i++;
            }
            word = new String[i];
            tango = new String[i][];
            file.close();
            System.out.println("íPåÍêî: " + i);

            file = new FileReader(filename);
            in = new BufferedReader(file);

            i = 0;
            while((s = in.readLine()) != null){
                String[] sp;
                sp = s.split(",");
                tango[i] = new String[sp.length-1]; 
                word[i] = sp[0];
                for(int j=1; j<sp.length; j++){
                    tango[i][j-1] = sp[j];
                }
                i++;
            }


            in.close();
            file.close();

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void checkEtoJ(){
        int count = 0;
        for(int i=0; i<word.length; i++){
            System.out.println(i+1 + ". éüÇÃâpíPåÍÇòañÛÇπÇÊÅB");
            System.out.println(word[i]);
            try{
                BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
                String urans = br.readLine();
                int j = 0;
                while(j < tango[i].length){
                    if(urans.equals(tango[i][j])){
                        System.out.println("ê≥â");
                        count++;
                        break;
                    }
                    j++;
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        System.out.println("ê≥ìöó¶: " + Double.toString((double)count*100 / (double)word.length) + "%");
    } 
    public void checkJtoE(){
        int count = 0;
        for(int i=0; i<word.length; i++){
            System.out.println(i+1 + ". éüÇÃíPåÍÇâpñÛÇπÇÊÅB");
            System.out.println(tango[i][0]);
            try{
                BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
                String urans = br.readLine();                
                if(urans.equals(word[i])){
                    System.out.println("ê≥â");
                    count++;
                }
                
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        System.out.println("ê≥ìöó¶: " + Double.toString((double)count*100 / (double)word.length) + "%");
    } 
}
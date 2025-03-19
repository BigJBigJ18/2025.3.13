public class CharArray {
    private char[] satz;
    private int anz;

    public CharArray(char[] satz) {
        setSatz(satz);
        setAnz();
    }

    public char[] getSatz() {
        return satz;
    }
    public void setSatz(char[] satz) {
        if(satz.length ==0) {
            satz= new char[]{'a', 'b', 'c'};
        }
        this.satz = satz;
    }
    public int getAnz() {
        return anz;
    }
    public void setAnz() {
        this.anz = satz.length;
    }

    public void entferneZeichen(char c){
        int entfernte =0;

        for(int i=0; i<anz; i++){
            if(satz[i]==c){
                entfernte++;
                satz[i]=' ';
                for(int j=i; j<anz; j++){
                    if(!(j+1>=anz)){
                        satz[j]=satz[j+1];
                    }else{
                        satz[j]=' ';
                    }
                }
                i--;
            }
        }
        char[] fix=new char[anz-entfernte];
        System.arraycopy(satz, 0, fix, 0, fix.length);
        satz=fix;
        setAnz();
    }
    public void ausgeben(){
        for (char c : satz) {
            System.out.print(c);
        }
    }
    public void reverseZeile(){
        char[] tausch=new char[anz];
        for(int i=anz-1; i>=0; i--){
            tausch[anz-i-1]=satz[i];
        }
        satz=tausch;
    }
    public boolean istIdentMit(char[] satz){
        boolean check = true;
        if(this.anz == anz){
            for(int i=0; i<anz; i++){
                if(this.satz[i]!=satz[i]){
                    check=false;
                    break;
                }
            }
        }else{
            check = false;
        }
        return check;
    }
    public String istTeilVon(char[] satzteil){
        boolean enthalten=false;
        StringBuilder stringSatz=new StringBuilder("\"");
        for(char c:satzteil){
            stringSatz.append(c);
        }
        stringSatz.append("\"");

        for(int i=0; i<anz; i++){
            if(satzteil[0]==satz[i]){
                for(int j=0; j<satzteil.length; j++){
                    if(satzteil[j]!=satz[i+j]){
                        enthalten=false;
                        break;
                    }else{
                        enthalten=true;
                    }
                }
            }
        }
        if(enthalten){
            stringSatz.append(" ist in \"");
        }else{
            stringSatz.append(" ist nicht in \"");
        }
        for(char c:satz){
            stringSatz.append(c);
        }
        stringSatz.append("\" enthalten.");
        return stringSatz.toString();
    }
    public int ersterIndexVon(char c){
        int position=0;
        for(int i=0; i<anz-1; i++){
            if(satz[i]==c){
                System.out.println("Von 1 gezählt befindet sich der Character \""+c+"\" an der Position "+(i+1));
                return i;
            }
        }
        System.out.println("Es gibt dieses Character nicht im Array!");
        return -1;
    }
    public int ersterIndexVon(char c, int abIndex){
        for(int i=abIndex; i<anz; i++){
            if(satz[i]==c){
                System.out.println("Ab der Stelle "+abIndex+" ist an der Stelle "+i+" der Character \""+c+"\"");
                return i;
            }
        }
        System.out.println("Es gibt dieses Character nicht im Array!");
        return -1;
    }
    public int letzterIndexVon(char c){
        for(int i=anz; i>0; i--){
            if(satz[i-1]==c){
                return i;
            }
        }
        System.out.println("Es gibt dieses Character nicht im Array!");
        return -1;
    }
    public void sort(){
        for(int j=0; j<Math.pow(anz, 2); j++){
            int posGross=0;
            char charGross=satz[0];
            for(int i=0; i<anz; i++){
                if(satz[i]>charGross){
                    posGross=i;
                    charGross=satz[i];
                }
            }
            char tausch=satz[anz-1];
            satz[anz-1]=charGross;
            satz[posGross]=tausch;
            anz--;
        }
    }
}
class Main {
    public static void main (String[] args){
        String word = "\\\\ \' I am a programmer \" //";
        for(int i = 0; i < 4; i++){
            System.out.println(word);
            word = "  "+word;
        }
    }
}
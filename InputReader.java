import java.util.*;


/**
 * @author Vrushabh
 * @version 1.0.0
 * @TODO InputReader Arrays
 */
public class InputReader {
    private final Scanner sc = new Scanner(System.in);
    public boolean isClosed = false;
    public static final String version = "1.0.0";
    public int nextInt(){
        try {
            return sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input Type");
        }catch(NoSuchElementException e){
            System.out.println("Input Exhausted");
        }catch(IllegalStateException e){
            System.out.println("InputReader closed");
        }
        return 0;
    }
    public float nextFloat() {
        try {
            return sc.nextFloat();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input Type");
        }catch(NoSuchElementException e){
            System.out.println("Input Exhausted");
        }catch(IllegalStateException e){
            System.out.println("InputReader closed");
        }
        return 0.0f;
    }
    public String nextWord (){
        try{
            return sc.next();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input Type");
        }catch(NoSuchElementException e){
            System.out.println("Input Exhausted");
        }catch(IllegalStateException e){
            System.out.println("InputReader closed");
        }
        return null;
    }
    public String nextLine(){
        try{
            return sc.nextLine();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input Type");
        }catch(NoSuchElementException e){
            System.out.println("Input Exhausted");
        }catch(IllegalStateException e){
            System.out.println("InputReader closed");
        }
        return null;
    }
    public char nextChar (){
        try{
            String in = sc.next();
            char ch;
            if (in.length() > 1) {
                throw new InputMismatchException(null);
            } else {
                ch = in.charAt(0);
            }
            return ch;
        }catch(InputMismatchException e){
            System.out.println("Invalid Input Type");
        }catch(NoSuchElementException e){
            System.out.println("Input Exhausted");
        }catch(IllegalStateException e){
            System.out.println("InputReader closed");
        }
        return 0;
    }
    public short nextShort (){
        try{
            return sc.nextShort();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input Type");
        }catch(NoSuchElementException e){
            System.out.println("Input Exhausted");
        }catch(IllegalStateException e){
            System.out.println("InputReader closed");
        }
        return 0;
    }

    public long nextLong(){
        try{
            return sc.nextLong();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input Type");
        }catch(NoSuchElementException e){
            System.out.println("Input Exhausted");
        }catch(IllegalStateException e){
            System.out.println("InputReader closed");
        }
        return 0;
    }
    public double nextDouble (){
        try{
            return sc.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input Type");
        }catch(NoSuchElementException e){
            System.out.println("Input Exhausted");
        }catch(IllegalStateException e){
            System.out.println("InputReader closed");
        }
        return 0.0d;
    }
    public boolean nextBoolean(){
        try{
            return sc.hasNextBoolean();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input Type");
        }catch(NoSuchElementException e){
            System.out.println("Input Exhausted");
        }catch(IllegalStateException e){
            System.out.println("InputReader closed");
        }
        return false;
    }
    public byte nextByte (){
        try{
            return sc.nextByte();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input Type");
        }catch(NoSuchElementException e){
            System.out.println("Input Exhausted");
        }catch(IllegalStateException e){
            System.out.println("InputReader closed");
        }
        return 0;
    }
    public int[] nextInts (int length){
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++){
            a[i] = nextInt();
        }
        return a;
    }
    public String[] nextWords (int length){
        String[] a = new String[length];
        for (int i = 0; i < a.length; i++){
            a[i] = nextWord();
        }
        return a;
    }
    public long[] nextLongs (int length){
        long[] a = new long[length];
        for (int i = 0; i < a.length; i++){
            a[i] = nextLong();
        }
        return a;
    }
    public short[] nextShorts (int length){
        short[] a = new short[length];
        for (int i = 0; i < a.length; i++){
            a[i] = nextShort();
        }
        return a;
    }
    public String[] nextLines (int length){
        String[] a = new String[length];
        for (int i = 0; i < a.length; i++){
            a[i] = nextLine();
        }
        return a;
    }
    public boolean[] nextBooleans (int length){
        boolean[] a = new boolean[length];
        for (int i = 0; i < a.length; i++){
            a[i] = nextBoolean();
        }
        return a;
    }
    public byte[] nextBytes (int length){
        byte[] a = new byte[length];
        for (int i = 0; i < a.length; i++){
            a[i] = nextByte();
        }
        return a;
    }
    public float[] nextFloats (int length){
        float[] a = new float[length];
        for (int i = 0; i < a.length; i++){
            a[i] = nextFloat();
        }
        return a;
    }
    public double[] nextDoubles (int length){
        double[] a = new double[length];
        for (int i = 0; i < a.length; i++){
            a[i] = nextDouble();
        }
        return a;
    }
    public char[] nextChars (int length){
        char[] a = new char[length];
        for (int i = 0; i < a.length; i++){
            a[i] = nextChar();
        }
        return a;
    }

    public void close(){
        sc.close();
        isClosed = true;
    }
    public void reset(){
        sc.reset();
    }
    public Scanner getScanner (){return sc;}

}

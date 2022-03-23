class Main {
  public static void main(String[] args) {
    for(int i=20; i<301;i=i+20 ){
      double g= (i*9/5)+32;// wzór (°C x 9/5) + 32 =°F , dodatkowo myślałem że wyniki będą po przecinku więc dałem double 
      System.out.println(+i +"st.C="+g+"st.F");
        
    }
  }
}
public class Punkt {
    public int x, y;
    public Punkt() { }
    public Punkt(int x, int y) { 
    this.x = x;
    this.y = y;
    }
    public void setLocation(int x, int y) { 
    this.x = x;
    this.y = y;
    }
    
    public static void modifyReference( Punkt p ) {
        p.setLocation( 0, 0 );
        }
        public static void main( String[] args ) {
         Punkt a = new Punkt( 47, 11 ); // Koordinaten gesetzt (x=47, y=11)
         modifyReference( a );
         System.out.println( a.x ); // ?
        }
        
}    
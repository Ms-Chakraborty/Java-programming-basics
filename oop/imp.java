package oop;

public class imp {
    public static void main(String[] args) {
        queen q=new queen();
        q.moves();
    }
    interface herbivores{
        void eats();
    }
    interface carnivores{
        void 
    }
    interface chessplayer{
        void moves();
    }
    static class queen implements chessplayer{
        public void moves(){
            System.out.println("up,down,left,right,diagonal in all four directions");
        }
    }
    class rook implements chessplayer{
        public void moves(){
            System.out.println("up,down,left,right, in all four directions");
        }
    }
    class king implements chessplayer{
        public void moves(){
            System.out.println("up,down,left,right,diagonal one step each");
        }
    }
}

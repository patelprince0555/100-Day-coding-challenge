

public class find_the_shortest_path_to_reach_destination {
    public static float shortestPath(String path){
        int n =path.length();
        int x=0;
        int y=0;

        for(int i=0;i<n;i++){
            char dir= path.charAt(i);
            if(dir=='E'){
                x++;
            }
            else if(dir=='W'){
                x--;
            }
            if(dir=='N'){
                y++;
            }
           else if(dir=='S'){
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}

import java.util.HashMap;
import java.util.Set;
public class trackList{
    public static void main(String[] args){
        HashMap<String, String> TrackList = new HashMap<String, String>();
        TrackList.put("IN AN" , "in an kd an awanh");
        TrackList.put("WLAD KUDS" , "lw knt bsla7 3 7dod 3la arde kan b65k");
        TrackList.put("SHAB MTKTK" , "ana shab mtktk a9le mrtb");
        TrackList.put("NKD KLK" , "nkd klk ya 5y klb m3deh");

        String tracks = TrackList.get("IN AN");
        System.out.println(tracks);

        Set <String> Tracks = TrackList.keySet();
        for(String track : Tracks){
            System.out.print(track + " : ");
            System.out.println(TrackList.get(track));
        }


    }
}
package Queue;

//Find the first circular tour that visits all petrol pumps
public class CircluarTour{
    
    class PetrolPump
    {
        int petrol;
        int distance;
    }
    public int GetCircularTourStartingPoint(PetrolPump[] petrolPump,int n)
    {
        int start = 0;
        int end = 1;
        
        
        int currentPetrol = petrolPump[start].petrol - petrolPump[start].distance;
        
        while(start!= end || currentPetrol < 0)
        {
            while( start!= end && currentPetrol < 0)
            {
                
                currentPetrol = currentPetrol - petrolPump[start].petrol + petrolPump[start].distance;
                
                start = (start+1)%n;
                
                if(start == 0)
                    return -1;
                
            }
            
            currentPetrol += petrolPump[end].petrol - petrolPump[end].distance;
            
            end = (end +1)%n;
        }
        
        return start;
    }
    
    public static void main(String[] args)
    {
    	CircluarTour tour = new CircluarTour();
        PetrolPump[] pumps = new PetrolPump[3];
        pumps[0] = tour. new PetrolPump();
        pumps[1] = tour. new PetrolPump();
        pumps[2] = tour.new PetrolPump();
        
        pumps[0].petrol = 6;
        pumps[0].distance = 4;
        
        pumps[1].petrol = 3;
        pumps[1].distance = 6;
        
        pumps[2].petrol = 7;
        pumps[2].distance = 3;
        
        
        
        System.out.println("Tour start Point = " + tour.GetCircularTourStartingPoint(pumps, 3));
    }

} 

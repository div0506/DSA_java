public class LS 
{
    public static int linearsearch(int num[] ,int key)
    {
        for(int i =0; i<num.length;i++ )
        {
            if(num[i] == key)
            return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int num[]= {1,2,3,4,5,6,7,8,9};
        int key = 5;
        int index = linearsearch(num , key);


        if(index == -1)
        {
            System.out.println("key ot found");
        } 

        else {System.out.println("key found at index :" + index);}
    }

    
}

public class SortedList extends IntList
{
   //constructor 
   public SortedList(int size) 
   {super(size);}
   
   //overridden add method 
   public void add(int value)
    {
        if (numElements == list.length)
        {
            //call the inherited method, becuz the inherited method wil print a message anyway if length is full
            super.add(value);
        }
        else if(numElements == 0 || value > list[numElements - 1]) // I can insert 0 as first element;
        //there is some room in the array, but let's say value is > list[i - 1] so insert value at i
           {
            list[numElements] = value;
            
          //increment the index, I don't want to increment it even if numEle == list.len
           numElements++;
           }
        else // there is some room in the array, but let's say value is <= list[i - 1] so insert value at i
           {
               //insert value at numEle index first
               list[numElements] = value;
               int temp = numElements;
               while(temp > 0 && list[temp] < list[temp - 1])
               {
                  int tempInt = list[temp];
                  list[temp] = list[temp - 1];
                  list[temp - 1] = tempInt;
                  temp--;
               }
               
              //increment the index, I don't want to increment it even if numEle == list.len
              numElements++;
           }
           
    }




}
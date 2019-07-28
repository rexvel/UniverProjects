////
package Queue;

public  class Queue1 {

    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue1(int s){
        maxSize = s;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;

    }

    public void insertLim(String j){

        if (rear == maxSize - 1) {
            rear = -1;
        }

        queArray[++rear] = j;
        nItems++;
    }


    public void DoubleUnlim(String j){

        createNewQueue();
        insertLim(j);

    }

    private void createNewQueue() {

        if(isFull()) {
            System.out.println("Create new arr");
            maxSize=maxSize*2;
            String[] temp = new String[maxSize];

            for(int i=0;i<size();i++) {

                if(front==queArray.length) {
                    front=0;
                    temp[i]=queArray[front];
                }else {
                    temp[i]=queArray[front];
                }
                front++;
            }

            front=0;
            rear=size()-1;

            queArray= new String[maxSize];

            for(int i=0;i<maxSize;i++) {
                queArray[i]=temp[i];
            }
        }
    }


    public String remove(){

        String temp = queArray[front++];
        if(front == maxSize)
            front = 0;

        nItems--;
        return temp;
    }

    public String peekFront()
    {
        return queArray[front];
    }

    public boolean isEmpty()

    {
        return (nItems==0);
    }

    public boolean isFull()
    {
        return (nItems==maxSize);
    }

    public int size(){
        return nItems;
    }

    public void outQueueArr(){

        for(int i=0;i<queArray.length;i++) {
            System.out.print(queArray[i]+", ");
        }

    }

    public void outQueue() {
        int k=front;
        for(int i=0;i<size();i++) {

            if(k==queArray.length) {
                k=0;
                System.out.print(queArray[k]+", ");
            }else {
                System.out.print(queArray[k]+", ");
            }
            k++;
        }
    }

    public void outInfo() {
        System.out.println();
        System.out.println("Front index: "+front+", rear index:"+rear);
    }

}
///////////////////////////////////////////////////////////